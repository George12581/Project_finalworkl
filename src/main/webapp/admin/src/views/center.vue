<template>
  <div :style='{"padding":"0px 0px","margin":"0px auto 0 auto","borderColor":"#eee","overflow":"hidden","background":"#f6f6f6","borderWidth":"1px 0 0","width":"94%","position":"relative","borderStyle":"solid"}'>
    <el-form
	  :style='{"minHeight":"calc(100vh - 260px)","padding":"30px  30px 20px 40px","boxShadow":"6px 6px 0px rgba(0,0,0,.1)","margin":"0px auto 0","borderRadius":"0px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20221202/3a1390c8b1c6477eab0f816fcf703030.png) no-repeat left top,url(http://codegen.caihongy.cn/20221202/5cd54f92f6ee487ca789e17939569264.png) no-repeat right bottom,#fff","display":"flex","justifyContent":"space-between","height":"100%"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="120px"
    >  
     <el-row>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="doctoraccountnumber" prop="doctoraccountnumber">
          <el-input v-model="ruleForm.doctoraccountnumber" readonly              placeholder="doctoraccountnumber" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}' v-if="flag=='doctor'" label="avatar" prop="avatar">
          <file-upload
          tip="点击上传avatar"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.avatar?ruleForm.avatar:''"
          @change="doctoravatarUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="doctorname" prop="doctorname">
          <el-input v-model="ruleForm.doctorname"               placeholder="doctorname" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}' v-if="flag=='doctor'"  label="gender" prop="gender">
          <el-select v-model="ruleForm.gender"  placeholder="请选择gender">
            <el-option
                v-for="(item,index) in doctorgenderOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="mobilenumber" prop="mobilenumber">
          <el-input v-model="ruleForm.mobilenumber"               placeholder="mobilenumber" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="professionaltitle" prop="professionaltitle">
          <el-input v-model="ruleForm.professionaltitle" readonly              placeholder="professionaltitle" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="medicalhealthfield" prop="medicalhealthfield">
          <el-input v-model="ruleForm.medicalhealthfield" readonly              placeholder="medicalhealthfield" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='doctor'"  label="workingtime" prop="workingtime">
          <el-input v-model="ruleForm.workingtime" readonly              placeholder="workingtime" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='nurse'"  label="nurseaccountnumber" prop="nurseaccountnumber">
          <el-input v-model="ruleForm.nurseaccountnumber" readonly              placeholder="nurseaccountnumber" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='nurse'"  label="nursename" prop="nursename">
          <el-input v-model="ruleForm.nursename"               placeholder="nursename" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}' v-if="flag=='nurse'" label="avatar" prop="avatar">
          <file-upload
          tip="点击上传avatar"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.avatar?ruleForm.avatar:''"
          @change="nurseavatarUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}' v-if="flag=='nurse'"  label="gender" prop="gender">
          <el-select v-model="ruleForm.gender"  placeholder="请选择gender">
            <el-option
                v-for="(item,index) in nursegenderOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='nurse'"  label="age" prop="age">
          <el-input v-model="ruleForm.age"               placeholder="age" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}'   v-if="flag=='nurse'"  label="mobilenumber" prop="mobilenumber">
          <el-input v-model="ruleForm.mobilenumber"               placeholder="mobilenumber" clearable></el-input>
        </el-form-item>
		<el-form-item :style='{"margin":"0 0 20px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"48%","justifyContent":"flex-start"}' v-if="flag=='users'" label="用户名" prop="username">
			<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
		</el-form-item>
		<el-form-item :style='{"padding":"0","margin":"20px 0 0"}'>
			<el-button :style='{"border":"4px solid #18cfa5","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","outline":"none","color":"#1fbfae","borderRadius":"0px","background":"#e9faf8","width":"auto","lineHeight":"40px","fontSize":"14px","height":"44px"}' type="primary" @click="onUpdateHandler">修 改</el-button>
		</el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      doctorgenderOptions: [],
      nursegenderOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.doctorgenderOptions = "男,女".split(',')
    this.nursegenderOptions = "男,女".split(',')
  },
  methods: {
    doctoravatarUploadChange(fileUrls) {
        this.ruleForm.avatar = fileUrls;
    },
    nurseavatarUploadChange(fileUrls) {
        this.ruleForm.avatar = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.doctoraccountnumber)&& 'doctor'==this.flag){
        this.$message.error('doctoraccountnumber不能为空');
        return
      }
      if((!this.ruleForm.password)&& 'doctor'==this.flag){
        this.$message.error('password不能为空');
        return
      }
        if(this.ruleForm.avatar!=null) {
                this.ruleForm.avatar = this.ruleForm.avatar.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.doctorname)&& 'doctor'==this.flag){
        this.$message.error('doctorname不能为空');
        return
      }
      if( 'doctor' ==this.flag && this.ruleForm.mobilenumber&&(!isMobile(this.ruleForm.mobilenumber))){
        this.$message.error(`mobilenumber应输入手机格式`);
        return
      }
      if( 'doctor' ==this.flag && this.ruleForm.clicknum&&(!isIntNumer(this.ruleForm.clicknum))){
       this.$message.error(`点击次数应输入整数`);
        return
      }
      if((!this.ruleForm.nurseaccountnumber)&& 'nurse'==this.flag){
        this.$message.error('nurseaccountnumber不能为空');
        return
      }
      if((!this.ruleForm.password)&& 'nurse'==this.flag){
        this.$message.error('password不能为空');
        return
      }
      if((!this.ruleForm.nursename)&& 'nurse'==this.flag){
        this.$message.error('nursename不能为空');
        return
      }
        if(this.ruleForm.avatar!=null) {
                this.ruleForm.avatar = this.ruleForm.avatar.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'nurse' ==this.flag && this.ruleForm.mobilenumber&&(!isMobile(this.ruleForm.mobilenumber))){
        this.$message.error(`mobilenumber应输入手机格式`);
        return
      }
      if( 'nurse' ==this.flag && this.ruleForm.clicknum&&(!isIntNumer(this.ruleForm.clicknum))){
       this.$message.error(`点击次数应输入整数`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  text-shadow: 0 1px 10px #fff;
	  	  color: #666;
	  	  background: none;
	  	  font-weight: 500;
	  	  display: block;
	  	  width: 120px;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #999;
	  	  background: rgba(24,207,165,.1);
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #18cfa5;
	  	  border-width: 4px;
	  	  border-style: solid;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #999;
	  	  background: rgba(24,207,165,.1);
	  	  width: 400px;
	  	  font-size: 14px;
	  	  border-color: #18cfa5;
	  	  border-width: 4px;
	  	  border-style: solid;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0px solid #333;
	  	  padding: 0 10px 0 30px;
	  	  color: #999;
	  	  font-size: 14px;
	  	  border-color: #18cfa5;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  background: rgba(24,207,165,.1);
	  	  width: 400px;
	  	  border-width: 4px;
	  	  border-style: solid;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 4px solid #18cfa5;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #18cfa5;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 4px solid #18cfa5;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #18cfa5;
	  	  width: 200px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 4px solid #18cfa5;
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  color: #999;
	  	  width: 500px;
	  	  font-size: 14px;
	  	  min-height: 120px;
	  	  height: auto;
	  	}
</style>
