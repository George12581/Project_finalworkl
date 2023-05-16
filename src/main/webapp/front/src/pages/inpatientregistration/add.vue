<template>
<div :style='{"width":"1200px","padding":"120px 7% 100px","margin":"0px auto","position":"relative","background":"url(http://codegen.caihongy.cn/20230109/138a4d606eae4a168810cef229969885.png) no-repeat center top,url(http://codegen.caihongy.cn/20230109/b95aeae1c1294f398aefb7c6cd5b16de.png) no-repeat center top,url(http://codegen.caihongy.cn/20230109/5ffc803e6682418eb7f0b09a98e35527.png) no-repeat center bottom,#faf0e6"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="hospitalizationnumber" prop="hospitalizationnumber">
              <el-input v-model="ruleForm.hospitalizationnumber" placeholder="hospitalizationnumber" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="patientname" prop="patientname">
            <el-select  @change="patientnameChange" v-model="ruleForm.patientname" placeholder="请选择patientname">
              <el-option
                  v-for="(item,index) in patientnameOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="gender" prop="gender">
            <el-input v-model="ruleForm.gender" 
                placeholder="gender" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="age" prop="age">
            <el-input v-model="ruleForm.age" 
                placeholder="age" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="hospitalizationdate" prop="hospitalizationdate" >
              <el-date-picker
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.hospitalizationdate" 
                  type="date"
                  placeholder="hospitalizationdate">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="doctoraccountnumber" prop="doctoraccountnumber">
            <el-input v-model="ruleForm.doctoraccountnumber" 
                placeholder="doctoraccountnumber" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="doctorname" prop="doctorname">
            <el-input v-model="ruleForm.doctorname" 
                placeholder="doctorname" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="medicalhealthfield" prop="medicalhealthfield">
            <el-input v-model="ruleForm.medicalhealthfield" 
                placeholder="medicalhealthfield" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="hospitalbednumber" prop="hospitalbednumber">
            <el-select  @change="hospitalbednumberChange" v-model="ruleForm.hospitalbednumber" placeholder="请选择hospitalbednumber">
              <el-option
                  v-for="(item,index) in hospitalbednumberOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="nurseaccountnumber" prop="nurseaccountnumber">
            <el-input v-model="ruleForm.nurseaccountnumber" 
                placeholder="nurseaccountnumber" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="nursename" prop="nursename">
            <el-input v-model="ruleForm.nursename" 
                placeholder="nursename" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="hospitalizationnotes" prop="hospitalizationnotes">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="hospitalizationnotes"
              v-model="ruleForm.hospitalizationnotes">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px"}' label="medicalrecorddescription" prop="medicalrecorddescription">
            <editor 
                :style='{"border":"1px solid #e5d9c6","minHeight":"300px","padding":"0","margin":"0","backgroundColor":"#fff","borderRadius":"0","width":"100%","height":"auto"}'
                v-model="ruleForm.medicalrecorddescription" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","textAlign":"center","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#cca162","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#009688","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            hospitalizationnumber : false,
            patientname : false,
            gender : false,
            age : false,
            medicalrecorddescription : false,
            hospitalizationdate : false,
            hospitalizationnotes : false,
            doctoraccountnumber : false,
            doctorname : false,
            medicalhealthfield : false,
            hospitalbednumber : false,
            nurseaccountnumber : false,
            nursename : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          hospitalizationnumber: this.getUUID(),
          patientname: '',
          gender: '',
          age: '',
          medicalrecorddescription: '',
          hospitalizationdate: '',
          hospitalizationnotes: '',
          doctoraccountnumber: '',
          doctorname: '',
          medicalhealthfield: '',
          hospitalbednumber: '',
          nurseaccountnumber: '',
          nursename: '',
        },
        patientnameOptions: [],
        hospitalbednumberOptions: [],
        rules: {
          hospitalizationnumber: [
          ],
          patientname: [
          ],
          gender: [
          ],
          age: [
          ],
          medicalrecorddescription: [
          ],
          hospitalizationdate: [
          ],
          hospitalizationnotes: [
          ],
          doctoraccountnumber: [
          ],
          doctorname: [
          ],
          medicalhealthfield: [
          ],
          hospitalbednumber: [
          ],
          nurseaccountnumber: [
          ],
          nursename: [
          ],
        },
      };
    },
    computed: {



    },
    components: {
    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.hospitalizationdate = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='hospitalizationnumber'){
              this.ruleForm.hospitalizationnumber = obj[o];
              this.ro.hospitalizationnumber = true;
              continue;
            }
            if(o=='patientname'){
              this.ruleForm.patientname = obj[o];
              this.ro.patientname = true;
              continue;
            }
            if(o=='gender'){
              this.ruleForm.gender = obj[o];
              this.ro.gender = true;
              continue;
            }
            if(o=='age'){
              this.ruleForm.age = obj[o];
              this.ro.age = true;
              continue;
            }
            if(o=='medicalrecorddescription'){
              this.ruleForm.medicalrecorddescription = obj[o];
              this.ro.medicalrecorddescription = true;
              continue;
            }
            if(o=='hospitalizationdate'){
              this.ruleForm.hospitalizationdate = obj[o];
              this.ro.hospitalizationdate = true;
              continue;
            }
            if(o=='hospitalizationnotes'){
              this.ruleForm.hospitalizationnotes = obj[o];
              this.ro.hospitalizationnotes = true;
              continue;
            }
            if(o=='doctoraccountnumber'){
              this.ruleForm.doctoraccountnumber = obj[o];
              this.ro.doctoraccountnumber = true;
              continue;
            }
            if(o=='doctorname'){
              this.ruleForm.doctorname = obj[o];
              this.ro.doctorname = true;
              continue;
            }
            if(o=='medicalhealthfield'){
              this.ruleForm.medicalhealthfield = obj[o];
              this.ro.medicalhealthfield = true;
              continue;
            }
            if(o=='hospitalbednumber'){
              this.ruleForm.hospitalbednumber = obj[o];
              this.ro.hospitalbednumber = true;
              continue;
            }
            if(o=='nurseaccountnumber'){
              this.ruleForm.nurseaccountnumber = obj[o];
              this.ro.nurseaccountnumber = true;
              continue;
            }
            if(o=='nursename'){
              this.ruleForm.nursename = obj[o];
              this.ro.nursename = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.doctoraccountnumber!=''&&json.doctoraccountnumber) || json.doctoraccountnumber==0){
                this.ruleForm.doctoraccountnumber = json.doctoraccountnumber
            }
            if((json.doctorname!=''&&json.doctorname) || json.doctorname==0){
                this.ruleForm.doctorname = json.doctorname
            }
            if((json.medicalhealthfield!=''&&json.medicalhealthfield) || json.medicalhealthfield==0){
                this.ruleForm.medicalhealthfield = json.medicalhealthfield
            }
          }
        });
        this.$http.get('option/patient/patientname', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.patientnameOptions = res.data.data;
          }
        });
        this.$http.get('option/bedinformation/hospitalbednumber', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.hospitalbednumberOptions = res.data.data;
          }
        });
      },
      // 下二随
      patientnameChange () {
        this.$http.get('follow/patient/patientname?columnValue=' + this.ruleForm.patientname, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.gender){
              this.ruleForm.gender = res.data.data.gender
            }
            if(res.data.data.age){
              this.ruleForm.age = res.data.data.age
            }
            if(res.data.data.nurseaccountnumber){
              this.ruleForm.nurseaccountnumber = res.data.data.nurseaccountnumber
            }
            if(res.data.data.nursename){
              this.ruleForm.nursename = res.data.data.nursename
            }
          }
        });
      },
      // 下二随
      hospitalbednumberChange () {
        this.$http.get('follow/bedinformation/hospitalbednumber?columnValue=' + this.ruleForm.hospitalbednumber, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.gender){
              this.ruleForm.gender = res.data.data.gender
            }
            if(res.data.data.age){
              this.ruleForm.age = res.data.data.age
            }
            if(res.data.data.nurseaccountnumber){
              this.ruleForm.nurseaccountnumber = res.data.data.nurseaccountnumber
            }
            if(res.data.data.nursename){
              this.ruleForm.nursename = res.data.data.nursename
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('inpatientregistration/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('inpatientregistration/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('inpatientregistration/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('inpatientregistration/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 150px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #e5d9c6;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #333;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #e5d9c6;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #e5d9c6;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
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
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px solid #e5d9c6;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #333;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #e5d9c6;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #333;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #e5d9c6;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #333;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #e5d9c6;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #333;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
