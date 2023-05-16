<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230109/cc084b475fe046298dc937f1cc43f1a3.jpg) no-repeat center top / 100% 100%","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"border":"1px solid #ccc","padding":"20px 2%","margin":"0","borderRadius":"10px","flexWrap":"wrap","background":"rgba(255,255,255,.9)","display":"flex","width":"750px","justifyContent":"center","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"100%","margin":"0 auto 20px","lineHeight":"44px","fontSize":"20px","color":"#aa844c","textAlign":"center"}'>SSM inpatient department management system注册</p></div>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="doctoraccountnumber">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>doctoraccountnumber：</div>
				<el-input v-model="registerForm.doctoraccountnumber" placeholder="请输入doctoraccountnumber" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.password" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.password2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="avatar">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>avatar：</div>
                <file-upload
					tip="点击上传avatar"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.avatar?registerForm.avatar:''"
					@change="doctoravatarUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="doctorname">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>doctorname：</div>
				<el-input v-model="registerForm.doctorname"  placeholder="请输入doctorname" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="gender">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>gender：</div>
                <el-select v-model="registerForm.gender" placeholder="请选择gender" >
                  <el-option
                      v-for="(item,index) in doctorgenderOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="mobilenumber">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>mobilenumber：</div>
				<el-input v-model="registerForm.mobilenumber"  placeholder="请输入mobilenumber" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="professionaltitle">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>professionaltitle：</div>
				<el-input v-model="registerForm.professionaltitle" readonly placeholder="请输入professionaltitle" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="medicalhealthfield">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>medicalhealthfield：</div>
				<el-input v-model="registerForm.medicalhealthfield" readonly placeholder="请输入medicalhealthfield" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='doctor'" prop="workingtime">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>workingtime：</div>
				<el-input v-model="registerForm.workingtime" readonly placeholder="请输入workingtime" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="nurseaccountnumber">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>nurseaccountnumber：</div>
				<el-input v-model="registerForm.nurseaccountnumber" placeholder="请输入nurseaccountnumber" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<el-input v-model="registerForm.password" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>确认密码：</div>
				<el-input v-model="registerForm.password2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="nursename">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>nursename：</div>
				<el-input v-model="registerForm.nursename"  placeholder="请输入nursename" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="avatar">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>avatar：</div>
                <file-upload
					tip="点击上传avatar"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.avatar?registerForm.avatar:''"
					@change="nurseavatarUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="gender">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>gender：</div>
                <el-select v-model="registerForm.gender" placeholder="请选择gender" >
                  <el-option
                      v-for="(item,index) in nursegenderOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="age">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>age：</div>
				<el-input v-model="registerForm.age"  placeholder="请输入age" />
			</el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0 8%","margin":"0 auto 30px","height":"auto"}' v-if="tableName=='nurse'" prop="mobilenumber">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>mobilenumber：</div>
				<el-input v-model="registerForm.mobilenumber"  placeholder="请输入mobilenumber" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px ","outline":"none","color":"#fff","borderRadius":"8px","background":"#cca162","display":"inline-block","width":"20%","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px ","outline":"none","color":"#fff","borderRadius":"8px","background":"#999999","display":"inline-block","width":"20%","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","color":"rgba(159, 159, 159, 1)","textAlign":"right","display":"inline-block","width":"100%","lineHeight":"2","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {
                doctoraccountnumber: this.getUUID(),
                gender: '',
                nurseaccountnumber: this.getUUID(),
                gender: '',
            },
			rules: {},
            doctorgenderOptions: [],
            nursegenderOptions: [],
		}
    },
	mounted() {
	},
    created() {
      this.pageFlag = this.$route.query.pageFlag;
      this.tableName = this.$route.query.role;
      if ('doctor' == this.tableName) {
        this.rules.doctoraccountnumber = [{ required: true, message: '请输入doctoraccountnumber', trigger: 'blur' }];
      }
      if ('doctor' == this.tableName) {
        this.rules.password = [{ required: true, message: '请输入password', trigger: 'blur' }];
      }
      if ('doctor' == this.tableName) {
        this.rules.doctorname = [{ required: true, message: '请输入doctorname', trigger: 'blur' }];
      }
        this.doctorgenderOptions = "男,女".split(',');
      if ('doctor' == this.tableName) {
        this.rules.mobilenumber = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('doctor' == this.tableName) {
        this.rules.clicknum = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
      }
      if ('nurse' == this.tableName) {
        this.rules.nurseaccountnumber = [{ required: true, message: '请输入nurseaccountnumber', trigger: 'blur' }];
      }
      if ('nurse' == this.tableName) {
        this.rules.password = [{ required: true, message: '请输入password', trigger: 'blur' }];
      }
      if ('nurse' == this.tableName) {
        this.rules.nursename = [{ required: true, message: '请输入nursename', trigger: 'blur' }];
      }
        this.nursegenderOptions = "男,女".split(',');
      if ('nurse' == this.tableName) {
        this.rules.mobilenumber = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('nurse' == this.tableName) {
        this.rules.clicknum = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
      }
    },
    //方法集合
    methods: {
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      doctoravatarUploadChange(fileUrls) {
          this.registerForm.avatar = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      nurseavatarUploadChange(fileUrls) {
          this.registerForm.avatar = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
               if(`doctor` == this.tableName && this.registerForm.password!=this.registerForm.password2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`nurse` == this.tableName && this.registerForm.password!=this.registerForm.password2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20230109/cc084b475fe046298dc937f1cc43f1a3.jpg) no-repeat center top / 100% 100%;

		.el-date-editor.el-input {
			width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 2px solid #eee;
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color: #333;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 2px solid #eee;
						border-radius: 8px;
						padding: 0 10px;
						outline: none;
						color: #333;
						width: 288px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 2px solid #eee;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #333;
						width: 288px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 2px solid #eee;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #333;
						width: 288px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 2px solid #eee;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #333;
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 2px solid #eee;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #333;
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 2px solid #eee;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #333;
		  		  width: 80px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
	}
</style>
