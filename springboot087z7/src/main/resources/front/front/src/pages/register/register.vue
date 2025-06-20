<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20221029/e35b6d97fed04bd2a3e7b21cbb5114db.jpg) no-repeat","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"padding":"20px","boxShadow":"0 1px 3px rgba(64, 158, 255, .8)","margin":"0","borderRadius":"16px 32px","background":"url(http://codegen.caihongy.cn/20221029/ea2be95667c4485286b36febaa97a64e.png) no-repeat center top,url(http://codegen.caihongy.cn/20221029/238e5e194bc348e9b292b2ffaed4c06d.png) no-repeat center bottom,linear-gradient(180deg, rgba(204,204,204,1) 0%, rgba(246,246,246,1) 15%, rgba(255,255,255,1) 51%, rgba(246,246,246,1) 85%, rgba(204,204,204,1) 100%)","width":"800px","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="true" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)","fontWeight":"bold"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"margin":"0 0 24px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)","fontWeight":"bold"}'>智慧医疗服务平台注册</p></div>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="zhanghao">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>账号：</div>
				<el-input v-model="registerForm.zhanghao"  placeholder="请输入账号" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="xingming">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>姓名：</div>
				<el-input v-model="registerForm.xingming"  placeholder="请输入姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="xingbie">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yonghuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="zhaopian">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>照片：</div>
                <file-upload
					tip="点击上传照片"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.zhaopian?registerForm.zhaopian:''"
					@change="yonghuzhaopianUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="lianxidianhua">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="nianling">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>年龄：</div>
				<el-input v-model="registerForm.nianling"  placeholder="请输入年龄" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yonghu'" prop="jiuzhenkahao">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>就诊卡号：</div>
				<el-input v-model="registerForm.jiuzhenkahao" placeholder="请输入就诊卡号" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="yishenggonghao">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>医生工号：</div>
				<el-input v-model="registerForm.yishenggonghao"  placeholder="请输入医生工号" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="yishengxingming">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>医生姓名：</div>
				<el-input v-model="registerForm.yishengxingming"  placeholder="请输入医生姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="mima">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="mima">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="xingbie">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yishengxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="zhaopian">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>照片：</div>
                <file-upload
					tip="点击上传照片"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.zhaopian?registerForm.zhaopian:''"
					@change="yishengzhaopianUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"66%","padding":"0","margin":"0px auto 24px","position":"relative","height":"auto"}' v-if="tableName=='yisheng'" prop="zhiwei">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"44px","fontSize":"14px","position":"absolute"}'>职位：</div>
				<el-input v-model="registerForm.zhiwei"  placeholder="请输入职位" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","boxShadow":"1px 2px 3px #52a1db","margin":"12px 16px 5px 290px","color":"#fff","display":"inline-block","outline":"none","borderRadius":"30%","background":"radial-gradient(circle, rgba(128,184,246,1) 0%, rgba(36,153,251,1) 100%)","width":"auto","fontSize":"16px","height":"40px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0 24px","boxShadow":"1px 2px 3px #ccc","margin":"12px auto 5px","color":"#999","display":"inline-block","outline":"none","borderRadius":"30%","background":"#fff","width":"auto","fontSize":"16px","height":"40px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","color":"#278bd5","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
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
                xingbie: '',
                jiuzhenkahao: this.getUUID(),
                jine: '0',
                xingbie: '',
            },
			rules: {},
            yonghuxingbieOptions: [],
            yishengxingbieOptions: [],
		}
    },
	mounted() {
	},
    created() {
      this.pageFlag = this.$route.query.pageFlag;
      this.tableName = this.$route.query.role;
      if ('yonghu' == this.tableName) {
        this.rules.zhanghao = [{ required: true, message: '请输入账号', trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
        this.yonghuxingbieOptions = "男,女".split(',');
      if ('yonghu' == this.tableName) {
        this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
      }
      if ('yonghu' == this.tableName) {
        this.rules.jine = [{ required: true, validator: this.$validate.isNumber, trigger: 'blur' }];
      }
      if ('yisheng' == this.tableName) {
        this.rules.yishenggonghao = [{ required: true, message: '请输入医生工号', trigger: 'blur' }];
      }
      if ('yisheng' == this.tableName) {
        this.rules.yishengxingming = [{ required: true, message: '请输入医生姓名', trigger: 'blur' }];
      }
      if ('yisheng' == this.tableName) {
        this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
      }
        this.yishengxingbieOptions = "男,女".split(',');
    },
    //方法集合
    methods: {
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      yonghuzhaopianUploadChange(fileUrls) {
          this.registerForm.zhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      yishengzhaopianUploadChange(fileUrls) {
          this.registerForm.zhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
               if(`yonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
               if(`yisheng` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
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
		background: url(http://codegen.caihongy.cn/20221029/e35b6d97fed04bd2a3e7b21cbb5114db.jpg) no-repeat;

		.el-date-editor.el-input {
			width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #999;
						border-radius: 8px;
						padding: 0 10px;
						box-shadow: 1px 2px 4px #ccc;
						outline: none;
						color: #999;
						background: -webkit-linear-gradient(top,#fff,#eee);
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #999;
						border-radius: 8px;
						padding: 0 10px;
						box-shadow: 1px 2px 4px #ccc;
						outline: none;
						color: #999;
						background: -webkit-linear-gradient(top,#fff,#eee);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #999;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						box-shadow: 1px 2px 4px #ccc;
						outline: none;
						color: #999;
						background: -webkit-linear-gradient(top,#fff,#eee);
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #999;
						border-radius: 8px;
						padding: 0 10px 0 30px;
						box-shadow: 1px 2px 4px #ccc;
						outline: none;
						color: #999;
						background: -webkit-linear-gradient(top,#fff,#eee);
						width: 288px;
						font-size: 14px;
						height: 40px;
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
		  		  border: 1px dashed #999;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px dashed #999;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px dashed #999;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 120px;
		  		  text-align: center;
		  		  height: 120px;
		  		}
	}
</style>
