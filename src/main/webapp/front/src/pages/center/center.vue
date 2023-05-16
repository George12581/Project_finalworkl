<template>
<div class="center-preview" :style='{"padding":"40px 0 100px","margin":"0px auto","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","justifyContent":"space-between"}'>
	<div class="title" :style='{"margin":"10px 0","color":"#333","textAlign":"center","background":"none","width":"100%","fontSize":"22px","lineHeight":"54px","fontWeight":"600"}'>{{ title }}</div>

    <el-tabs tab-position="left" :style='{"width":"100%","flexWrap":"wrap","background":"none","justifyContent":"center","display":"flex"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="180px">
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="password" prop="password">
            <el-input type="password" v-model="sessionForm.password" placeholder="password"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="avatar">
            <el-upload
              class="avatar-uploader"
              :action="uploadUrl"
              :headers="headers"
              :show-file-list="false"
              :on-success="doctoravatarHandleAvatarSuccess">
              <img :style='{"border":"1px solid #e5d9c6","cursor":"pointer","color":"#333","borderRadius":"6px","textAlign":"center","width":"100px","fontSize":"32px","lineHeight":"100px","height":"100px"}' v-if="sessionForm.avatar" :src="baseUrl + sessionForm.avatar" class="avatar">
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="doctorname" prop="doctorname">
            <el-input v-model="sessionForm.doctorname" placeholder="doctorname" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="gender">
            <el-select v-model="sessionForm.gender" placeholder="请选择gender" >
              <el-option v-for="(item, index) in dynamicProp.gender" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="mobilenumber" prop="mobilenumber">
            <el-input v-model="sessionForm.mobilenumber" placeholder="mobilenumber" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="professionaltitle" prop="professionaltitle">
            <el-input v-model="sessionForm.professionaltitle" placeholder="professionaltitle" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="medicalhealthfield" prop="medicalhealthfield">
            <el-input v-model="sessionForm.medicalhealthfield" placeholder="medicalhealthfield" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='doctor'" label="workingtime" prop="workingtime">
            <el-input v-model="sessionForm.workingtime" placeholder="workingtime" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="password" prop="password">
            <el-input type="password" v-model="sessionForm.password" placeholder="password"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="nursename" prop="nursename">
            <el-input v-model="sessionForm.nursename" placeholder="nursename" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="avatar">
            <el-upload
              class="avatar-uploader"
              :action="uploadUrl"
              :headers="headers"
              :show-file-list="false"
              :on-success="nurseavatarHandleAvatarSuccess">
              <img :style='{"border":"1px solid #e5d9c6","cursor":"pointer","color":"#333","borderRadius":"6px","textAlign":"center","width":"100px","fontSize":"32px","lineHeight":"100px","height":"100px"}' v-if="sessionForm.avatar" :src="baseUrl + sessionForm.avatar" class="avatar">
              <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="gender">
            <el-select v-model="sessionForm.gender" placeholder="请选择gender" >
              <el-option v-for="(item, index) in dynamicProp.gender" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="age" prop="age">
            <el-input v-model="sessionForm.age" placeholder="age" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"0 0 20px 0","boxShadow":"0 2px 0 #efe4d4","margin":"0 0 10px","background":"none"}' v-if="userTableName=='nurse'" label="mobilenumber" prop="mobilenumber">
            <el-input v-model="sessionForm.mobilenumber" placeholder="mobilenumber" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#cca162","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#1e8892","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
		
        <el-dialog title="用户充值" :visible.sync="dialogFormVisibleMoney" width="726px" center>
          <el-form :model="chongzhiForm">
            <el-form-item label="充值金额" label-width="120px">
              <el-input type="number" v-model="chongzhiForm.money" autocomplete="off" placeholder="充值金额"></el-input>
            </el-form-item>
            <el-form-item label-width="120px">
              <el-radio-group v-model="chongzhiForm.radio">
                <el-radio style="margin-bottom: 30px" label="微信支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/weixin.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">微信支付</span>
                </el-radio>
                <el-radio label="支付宝支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhifubao.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">支付宝支付</span>
                </el-radio>
                <el-radio label="中国建设银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jianshe.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国农业银行支付">
                  <el-image
                    style="width: 126px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/nongye.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国银行支付">
                  <el-image
                    style="width: 140px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhongguo.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="交通银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jiaotong.png')"
                    fit="fill"></el-image>
                </el-radio>
              </el-radio-group>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisibleMoney = false">取 消</el-button>
            <el-button type="primary" @click="chongzhi">确认充值</el-button>
          </div>
        </el-dialog>
        <el-dialog title="会员购买" :visible.sync="dialogFormVisibleVip" width="726px" center>
          <el-form :model="chongzhiForm">
            <el-form-item label="会员卡" label-width="120px">
              <el-input readonly autocomplete="off" value="￥199/年"></el-input>
            </el-form-item>
            <el-form-item label-width="120px">
              <el-radio-group v-model="chongzhiForm.radio">
                <el-radio style="margin-bottom: 30px" label="微信支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/weixin.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">微信支付</span>
                </el-radio>
                <el-radio label="支付宝支付">
                  <el-image
                    style="width: 60px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhifubao.png')"
                    fit="fill"></el-image>
                    <span style="display: inline-block;margin-left: 10px">支付宝支付</span>
                </el-radio>
                <el-radio label="中国建设银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jianshe.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国农业银行支付">
                  <el-image
                    style="width: 126px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/nongye.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="中国银行支付">
                  <el-image
                    style="width: 140px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/zhongguo.png')"
                    fit="fill"></el-image>
                </el-radio>
                <el-radio label="交通银行支付">
                  <el-image
                    style="width: 120px; height: 60px;vertical-align: middle;"
                    :src="require('@/assets/jiaotong.png')"
                    fit="fill"></el-image>
                </el-radio>
              </el-radio-group>
            </el-form-item>
          </el-form>
          <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisibleVip = false">取 消</el-button>
            <el-button type="primary" @click="chongzhivip">确认支付</el-button>
          </div>
        </el-dialog>
      </el-tab-pane>
    </el-tabs>
</div>
</template>

<script>
  import config from '@/config/config'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
        rules: {},
        chongzhiForm: {
          money: '',
          radio: ''
        },
        disabled: false,
        dialogFormVisibleMoney: false,
        dialogFormVisibleVip: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('Token')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {}
      }
    },
    created() {
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'doctoraccountnumber', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'password', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'avatar', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'doctorname', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'gender', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'mobilenumber', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'professionaltitle', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'medicalhealthfield', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'workingtime', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'clicktime', null);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.sessionForm, 'clicknum', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'nurseaccountnumber', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'password', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'nursename', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'avatar', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'gender', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'age', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'mobilenumber', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'clicktime', null);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.sessionForm, 'clicknum', null);
      }

      if ('doctor' == this.userTableName) {
        this.$set(this.rules, 'doctoraccountnumber', [{ required: true, message: '请输入doctoraccountnumber', trigger: 'blur' }]);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.rules, 'password', [{ required: true, message: '请输入password', trigger: 'blur' }]);
      }
      if ('doctor' == this.userTableName) {
        this.$set(this.rules, 'doctorname', [{ required: true, message: '请输入doctorname', trigger: 'blur' }]);
      }
			if ('doctor' == this.userTableName) {
        this.$set(this.rules, 'mobilenumber', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }
			if ('doctor' == this.userTableName) {
        this.$set(this.rules, 'clicknum', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.rules, 'nurseaccountnumber', [{ required: true, message: '请输入nurseaccountnumber', trigger: 'blur' }]);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.rules, 'password', [{ required: true, message: '请输入password', trigger: 'blur' }]);
      }
      if ('nurse' == this.userTableName) {
        this.$set(this.rules, 'nursename', [{ required: true, message: '请输入nursename', trigger: 'blur' }]);
      }
			if ('nurse' == this.userTableName) {
        this.$set(this.rules, 'mobilenumber', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }
			if ('nurse' == this.userTableName) {
        this.$set(this.rules, 'clicknum', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
      }

      this.init();
      this.getSession();
    },
    //方法集合
    methods: {
      init() {
        if ('doctor' == this.userTableName) {
          this.dynamicProp.gender = '男,女'.split(',');
        }
        if ('nurse' == this.userTableName) {
          this.dynamicProp.gender = '男,女'.split(',');
        }
      },
      getSession() {
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.sessionForm = res.data.data;
            localStorage.setItem('userid', res.data.data.id);
            if(res.data.data.vip) {
                localStorage.setItem('vip', res.data.data.vip);
            }
            if(res.data.data.touxiang) {
                localStorage.setItem('headportrait', res.data.data.touxiang);
            } else if(res.data.data.headportrait) {
                localStorage.setItem('headportrait', res.data.data.headportrait);
            }
          }
        });
      },
      onSubmit(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
              if (res.data.code == 0) {
                this.$message({
                  message: '更新成功',
                  type: 'success',
                  duration: 1500
                });
              }
            });
          } else {
            return false;
          }
        });
      },
      doctoravatarHandleAvatarSuccess(res, file) {
        if (res.code == 0) {
          if ('doctor' == this.userTableName) {
            this.sessionForm.avatar = 'upload/' + res.file;
          }
        }
      },
      nurseavatarHandleAvatarSuccess(res, file) {
        if (res.code == 0) {
          if ('nurse' == this.userTableName) {
            this.sessionForm.avatar = 'upload/' + res.file;
          }
        }
      },
      chongzhi() {
        if (this.chongzhiForm.money == '') {
          this.$message({
            message: '请输入充值金额',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if (this.chongzhiForm.money <= 0) {
          this.$message({
            message: '请输入正确的充值金额',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if (this.chongzhiForm.radio == '') {
          this.$message({
            message: '请选择充值方式',
            type: 'error',
            duration: 1500
          });
          return;
        }
        this.sessionForm.money = parseInt(this.sessionForm.money) + parseInt(this.chongzhiForm.money);
        this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
          if (res.data.code == 0) {
            this.$message({
              message: '充值成功',
              type: 'success',
              duration: 1500,
              onClose: () => {
                this.dialogFormVisibleMoney = false;
              }
            });
          }
        });
      },
      chongzhivip() {
        this.chongzhiForm.money == 199;
        if (this.chongzhiForm.radio == '') {
          this.$message({
            message: '请选择支付方式',
            type: 'error',
            duration: 1500
          });
          return;
        }
        if(this.sessionForm.vip == '是') {
          this.$message({
            message: '您已是我们的尊贵会员。',
            type: 'success',
            duration: 1500
          });
          return;
        }
        
        this.sessionForm.vip = "是"
        this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
          if (res.data.code == 0) {
            this.$message({
              message: '会员购买成功',
              type: 'success',
              duration: 1500,
              onClose: () => {
                localStorage.setItem('vip', this.sessionForm.vip);
                this.dialogFormVisibleVip = false;
              }
            });
          }
        });
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
        }

        this.title = event.target.outerText;
      },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 0;
	margin: 0;
	display: flex;
	width: 100%;
	border-color: #eee;
	border-width: 0;
	justify-content: center;
	border-style: solid;
	height: 100px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	padding: 0 10px;
  	box-shadow: 0 4px 0 #cca162;
  	color: #333;
  	background: none;
  	font-weight: 500;
  	display: inline-block;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	min-width: 100px;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	padding: 0 20px;
  	color: #cca162;
  	background: none;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	padding: 0 20px;
  	color: #cca162;
  	background: none;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	padding: 120px 0 100px;
  	background: url(http://codegen.caihongy.cn/20230109/138a4d606eae4a168810cef229969885.png) no-repeat center top,url(http://codegen.caihongy.cn/20230109/b95aeae1c1294f398aefb7c6cd5b16de.png) no-repeat center top,url(http://codegen.caihongy.cn/20230109/5ffc803e6682418eb7f0b09a98e35527.png) no-repeat center bottom,#faf0e6;
  	width: 100vh;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 20px 0 0;
  	color: #b68742;
  	font-weight: 500;
  	width: 180px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 180px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border: 1px solid #e5d9c6;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #333;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border: 1px solid #e5d9c6;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #333;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border: 1px solid #e5d9c6;
  	border-radius: 4px;
  	padding: 0 10px 0 30px;
  	outline: none;
  	color: #333;
  	width: 200px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
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
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border: 1px solid #e5d9c6;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #333;
  	display: inline-block;
  	width: 200px;
  	font-size: 14px;
  	height: 40px;
  }
</style>
