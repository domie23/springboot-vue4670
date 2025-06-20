<template>
<div>
	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20221029/e35b6d97fed04bd2a3e7b21cbb5114db.jpg) no-repeat","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form ref="loginForm" :model="loginForm" :style='{"padding":"35px 20px 30px","boxShadow":"0 1px 3px rgba(64, 158, 255, .8)","margin":"0","borderRadius":"32px 32px","background":"url(http://codegen.caihongy.cn/20221029/ea2be95667c4485286b36febaa97a64e.png) no-repeat center top,url(http://codegen.caihongy.cn/20221029/238e5e194bc348e9b292b2ffaed4c06d.png) no-repeat center bottom,linear-gradient(180deg, rgba(204,204,204,1) 0%, rgba(246,246,246,1) 15%, rgba(255,255,255,1) 51%, rgba(246,246,246,1) 85%, rgba(204,204,204,1) 100%)","width":"800px","height":"auto"}' :rules="rules">
			<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#409eff","textAlign":"center","width":"100%","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)","fontWeight":"bold"}'>USER / LOGIN</div>
			<div v-if="true" :style='{"margin":"0 0 20px 0","color":"#409eff","textAlign":"center","width":"100%","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)","fontWeight":"bold"}'>智慧医疗服务平台登录</div>
			<el-form-item v-if="loginType==1" class="list-item" :style='{"width":"66%","margin":"0 auto 20px","position":"relative"}' prop="username">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute"}'>账号：</div>
				<input :style='{"border":"1px solid #999","padding":"0 10px","boxShadow":"1px 2px 4px #ccc","color":"#999","borderRadius":"8px","background":"-webkit-linear-gradient(top,#fff,#eee)","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.username" placeholder="请输入账户">
			</el-form-item>
			<el-form-item v-if="loginType==1" class="list-item" :style='{"width":"66%","margin":"0 auto 20px","position":"relative"}' prop="password">
				<div v-if="true" :style='{"color":"rgba(64, 158, 255, 1)","left":"-150px","textAlign":"right","width":"150px","lineHeight":"40px","fontSize":"14px","position":"absolute"}'>密码：</div>
				<input :style='{"border":"1px solid #999","padding":"0 10px","boxShadow":"1px 2px 4px #ccc","color":"#999","borderRadius":"8px","background":"-webkit-linear-gradient(top,#fff,#eee)","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.password" placeholder="请输入密码" type="password">
			</el-form-item>
			<el-form-item v-if="roles.length>1" class="list-type" :style='{"width":"66%","margin":"20px auto"}' prop="role">
				<el-radio v-model="loginForm.tableName" :label="item.tableName" v-for="(item, index) in roles" :key="index" @change.native="getCurrentRow(item)">{{item.roleName}}</el-radio>
			</el-form-item>
			<el-form-item :style='{"width":"66%","margin":"20px auto"}'>
				<el-button v-if="loginType==1" :style='{"border":"0","cursor":"pointer","padding":"0 24px","boxShadow":"1px 2px 3px #52a1db","margin":"0 5px","outline":"none","color":"#fff","borderRadius":"30%","background":"radial-gradient(circle, rgba(128,184,246,1) 0%, rgba(36,153,251,1) 100%)","width":"auto","fontSize":"14px","height":"40px"}' @click="submitForm('loginForm')">登录</el-button>
				<el-button v-if="loginType==1" :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0 24px","boxShadow":"1px 2px 3px #ccc","margin":"0 5px","outline":"none","color":"#999","borderRadius":"30%","background":"#fff","width":"auto","fontSize":"14px","height":"40px"}' @click="resetForm('loginForm')">重置</el-button>
			</el-form-item>
			<div :style='{"width":"66%","margin":"20px auto"}'>
			<router-link :style='{"cursor":"pointer","margin":"0 5px","fontSize":"14px","textDecoration":"none","color":"#278bd5"}' :to="{path: '/register', query: {role: item.tableName,pageFlag:'register'}}" v-if="item.hasFrontRegister=='是'" v-for="(item, index) in roles" :key="index">注册{{item.roleName.replace('注册','')}}</router-link>
			</div>
		</el-form>
    </div>
</div>
</template>

<script>

export default {
	//数据集合
	data() {
		return {
            baseUrl: this.$config.baseUrl,
            loginType: 1,
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"科室分类","menuJump":"列表","tableName":"keshifenlei"}],"menu":"科室分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改","删除","支付"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改","删除"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改","删除"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"药品类型","menuJump":"列表","tableName":"yaopinleixing"}],"menu":"药品类型管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","修改","删除","新增"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"导航服务","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","修改","删除"],"menu":"就诊卡充值","menuJump":"列表","tableName":"jiuzhenkachongzhi"}],"menu":"就诊卡充值管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"项目名称","menuJump":"列表","tableName":"xiangmumingcheng"}],"menu":"项目名称管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-form","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","充值"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","支付","交费"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","支付","修改","删除"],"menu":"就诊卡充值","menuJump":"列表","tableName":"jiuzhenkachongzhi"}],"menu":"就诊卡充值管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","体检"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","体检报告"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","开处方","登记"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"我的消息","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"}],
			loginForm: {
				username: '',
				password: '',
				tableName: '',
				code: '',
			},
			role: '',
            roles: [],
			rules: {
				username: [
					{ required: true, message: '请输入账户', trigger: 'blur' }
				],
				password: [
					{ required: true, message: '请输入密码', trigger: 'blur' }
				]
			},
			codes: [{
				num: 1,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 2,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 3,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 4,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}]
		}
	},
  components: {
  },
	created() {
        for(let item in this.roleMenus) {
            if(this.roleMenus[item].hasFrontLogin=='是') {
                this.roles.push(this.roleMenus[item]);
            }
        }
	},
	mounted() {
	},
    //方法集合
    methods: {
		randomString() {
			var len = 4;
			var chars = [
			  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
			  '3', '4', '5', '6', '7', '8', '9'
			]
			var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
			var sizes = ['14', '15', '16', '17', '18']
			
			var output = []
			for (var i = 0; i < len; i++) {
			  // 随机验证码
			  var key = Math.floor(Math.random() * chars.length)
			  this.codes[i].num = chars[key]
			  // 随机验证码颜色
			  var code = '#'
			  for (var j = 0; j < 6; j++) {
			    var key = Math.floor(Math.random() * colors.length)
			    code += colors[key]
			  }
			  this.codes[i].color = code
			  // 随机验证码方向
			  var rotate = Math.floor(Math.random() * 45)
			  var plus = Math.floor(Math.random() * 2)
			  if (plus == 1) rotate = '-' + rotate
			  this.codes[i].rotate = 'rotate(' + rotate + 'deg)'
			  // 随机验证码字体大小
			  var size = Math.floor(Math.random() * sizes.length)
			  this.codes[i].size = sizes[size] + 'px'
			}
		},
      getCurrentRow(row) {
        this.role = row.roleName;
      },
      submitForm(formName) {
        if (this.roles.length!=1) {
            if (!this.role) {
                this.$message.error("请选择登录用户类型");
                return false;
            }
        } else {
            this.role = this.roles[0].roleName;
            this.loginForm.tableName = this.roles[0].tableName;
        }
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.get(`${this.loginForm.tableName}/login`, {params: this.loginForm}).then(res => {
              if (res.data.code === 0) {
                localStorage.setItem('Token', res.data.token);
                localStorage.setItem('UserTableName', this.loginForm.tableName);
                localStorage.setItem('username', this.loginForm.username);
                localStorage.setItem('adminName', this.loginForm.username);
                localStorage.setItem('sessionTable', this.loginForm.tableName);
                localStorage.setItem('role', this.role);
                localStorage.setItem('keyPath', this.$config.indexNav.length+2);
                this.$router.push('/index/center');
                this.$message({
                  message: '登录成功',
                  type: 'success',
                  duration: 1500,
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
		
		.el-form-item {
		  & /deep/ .el-form-item__content {
		    width: 100%;
		  }
		}
		
		.list-item /deep/ .el-input .el-input__inner {
			border: 1px solid #999;
			border-radius: 8px;
			padding: 0 10px;
			box-shadow: 1px 2px 4px #ccc;
			color: #999;
			background: -webkit-linear-gradient(top,#fff,#eee);
			width: 100%;
			font-size: 14px;
			height: 44px;
		}
		
		.list-code /deep/ .el-input .el-input__inner {
			border: 1px solid #999;
			border-radius: 8px;
			padding: 0 10px;
			box-shadow: 1px 2px 4px #ccc;
			outline: none;
			color: #999;
			background: -webkit-linear-gradient(top,#fff,#eee);
			display: inline-block;
			vertical-align: middle;
			width: calc(100% - 164px);
			font-size: 14px;
			height: 44px;
		}
		
		.list-type /deep/ .el-radio__input .el-radio__inner {
			background: rgba(53, 53, 53, 0);
			border-color: #666666;
		}
		.list-type /deep/ .el-radio__input.is-checked .el-radio__inner {
			background: rgba(64, 158, 255, 1);
			border-color: rgba(64, 158, 255, 1);
		}
		.list-type /deep/ .el-radio__label {
			color: #666666;
			font-size: 14px;
		}
		.list-type /deep/ .el-radio__input.is-checked+.el-radio__label {
			color: rgba(64, 158, 255, 1);
			font-size: 14px;
		}
	}
</style>
