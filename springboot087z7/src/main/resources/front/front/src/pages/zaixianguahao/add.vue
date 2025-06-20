<template>
<div :style='{"border":"1px solid #dfdfdf","padding":"20px","margin":"20px auto 0","borderRadius":"16px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="挂号编号" prop="guahaobianhao">
              <el-input v-model="ruleForm.guahaobianhao" placeholder="挂号编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室名称" prop="keshimingcheng">
            <el-input v-model="ruleForm.keshimingcheng" 
                placeholder="科室名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室号" prop="keshihao">
            <el-input v-model="ruleForm.keshihao" 
                placeholder="科室号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="挂号费" prop="jine">
            <el-input v-model="ruleForm.jine" 
                placeholder="挂号费" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="坐诊时间" prop="zuozhenshijian">
            <el-input v-model="ruleForm.zuozhenshijian" 
                placeholder="坐诊时间" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="挂号人数" prop="renshu">
            <el-input v-model="ruleForm.renshu" 
                placeholder="挂号人数" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="挂号时间" prop="guahaoshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.guahaoshijian" 
                  type="datetime"
                  placeholder="挂号时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="账号" prop="zhanghao">
            <el-input v-model="ruleForm.zhanghao" 
                placeholder="账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="就诊卡号" prop="jiuzhenkahao">
            <el-input v-model="ruleForm.jiuzhenkahao" 
                placeholder="就诊卡号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="用户金额" prop="yonghujine">
            <el-input v-model="ruleForm.yonghujine" 
                placeholder="用户金额" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="医生工号" prop="yishenggonghao">
            <el-input v-model="ruleForm.yishenggonghao" 
                placeholder="医生工号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="医生姓名" prop="yishengxingming">
            <el-input v-model="ruleForm.yishengxingming" 
                placeholder="医生姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="职位" prop="zhiwei">
            <el-input v-model="ruleForm.zhiwei" 
                placeholder="职位" clearable ></el-input>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"20px 0 20px 0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"1px 2px 6px #52a1db","margin":"0 20px 0 0","color":"rgba(255, 255, 255, 1)","outline":"none","borderRadius":"30%","background":"radial-gradient(circle, rgba(128,184,246,1) 0%, rgba(36,153,251,1) 100%)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0","boxShadow":"1px 2px 6px #ccc","margin":"0","color":"#999","outline":"none","borderRadius":"30%","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        uObject: null,
        baseUrl: '',
        ro:{
            guahaobianhao : false,
            keshimingcheng : false,
            keshihao : false,
            jine : false,
            zuozhenshijian : false,
            renshu : false,
            guahaoshijian : false,
            zhanghao : false,
            xingming : false,
            jiuzhenkahao : false,
            yonghujine : false,
            yishenggonghao : false,
            yishengxingming : false,
            zhiwei : false,
            crossuserid : false,
            crossrefid : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          guahaobianhao: this.getUUID(),
          keshimingcheng: '',
          keshihao: '',
          jine: '',
          zuozhenshijian: '',
          renshu: '',
          guahaoshijian: '',
          zhanghao: '',
          xingming: '',
          jiuzhenkahao: '',
          yonghujine: '',
          yishenggonghao: '',
          yishengxingming: '',
          zhiwei: '',
          crossuserid: '',
          crossrefid: '',
        },


        rules: {
          guahaobianhao: [
          ],
          keshimingcheng: [
            { required: true, message: '科室名称不能为空', trigger: 'blur' },
          ],
          keshihao: [
          ],
          jine: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          zuozhenshijian: [
          ],
          renshu: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          guahaoshijian: [
          ],
          zhanghao: [
          ],
          xingming: [
          ],
          jiuzhenkahao: [
          ],
          yonghujine: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          yishenggonghao: [
          ],
          yishengxingming: [
          ],
          zhiwei: [
          ],
          crossuserid: [
          ],
          crossrefid: [
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
      this.ruleForm.guahaoshijian = this.getCurDateTime()
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
            if(o=='guahaobianhao'){
              this.ruleForm.guahaobianhao = obj[o];
              this.ro.guahaobianhao = true;
              continue;
            }
            if(o=='keshimingcheng'){
              this.ruleForm.keshimingcheng = obj[o];
              this.ro.keshimingcheng = true;
              continue;
            }
            if(o=='keshihao'){
              this.ruleForm.keshihao = obj[o];
              this.ro.keshihao = true;
              continue;
            }
            if(o=='jine'){
              this.ruleForm.jine = obj[o];
              this.ro.jine = true;
              continue;
            }
            if(o=='zuozhenshijian'){
              this.ruleForm.zuozhenshijian = obj[o];
              this.ro.zuozhenshijian = true;
              continue;
            }
            if(o=='renshu'){
              this.ruleForm.renshu = obj[o];
              this.ro.renshu = true;
              continue;
            }
            if(o=='guahaoshijian'){
              this.ruleForm.guahaoshijian = obj[o];
              this.ro.guahaoshijian = true;
              continue;
            }
            if(o=='zhanghao'){
              this.ruleForm.zhanghao = obj[o];
              this.ro.zhanghao = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='jiuzhenkahao'){
              this.ruleForm.jiuzhenkahao = obj[o];
              this.ro.jiuzhenkahao = true;
              continue;
            }
            if(o=='yonghujine'){
              this.ruleForm.yonghujine = obj[o];
              this.ro.yonghujine = true;
              continue;
            }
            if(o=='yishenggonghao'){
              this.ruleForm.yishenggonghao = obj[o];
              this.ro.yishenggonghao = true;
              continue;
            }
            if(o=='yishengxingming'){
              this.ruleForm.yishengxingming = obj[o];
              this.ro.yishengxingming = true;
              continue;
            }
            if(o=='zhiwei'){
              this.ruleForm.zhiwei = obj[o];
              this.ro.zhiwei = true;
              continue;
            }
            if(o=='crossuserid'){
              this.ruleForm.crossuserid = obj[o];
              this.ro.crossuserid = true;
              continue;
            }
            if(o=='crossrefid'){
              this.ruleForm.crossrefid = obj[o];
              this.ro.crossrefid = true;
              continue;
            }
          }
          this.ruleForm.renshu = 0
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            this.uObject = res.data.data;
            if((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0){
                this.ruleForm.zhanghao = json.zhanghao
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming
            }
            if((json.jiuzhenkahao!=''&&json.jiuzhenkahao) || json.jiuzhenkahao==0){
                this.ruleForm.jiuzhenkahao = json.jiuzhenkahao
            }
            if((json.jine!=''&&json.jine) || json.jine==0){
                this.ruleForm.yonghujine = json.jine
            }
            if((json.yishenggonghao!=''&&json.yishenggonghao) || json.yishenggonghao==0){
                this.ruleForm.yishenggonghao = json.yishenggonghao
            }
            if((json.yishengxingming!=''&&json.yishengxingming) || json.yishengxingming==0){
                this.ruleForm.yishengxingming = json.yishengxingming
            }
            if((json.zhiwei!=''&&json.zhiwei) || json.zhiwei==0){
                this.ruleForm.zhiwei = json.zhiwei
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('zaixianguahao/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        var obj = JSON.parse(localStorage.getItem('crossObj'));
        var table = localStorage.getItem('crossTable');
        obj.renshu = obj.renshu - this.ruleForm.renshu
        if(obj.renshu<0){
          this.$message.error("挂号人数不足");
          return
        }
      
        //this.$http.post(table+`/update`, obj).then(res => {});
        if(this.ruleForm.jine>this.ruleForm.yonghujine){
          this.$message.error("挂号费不能超过用户金额");
          return
        }
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
                 this.$http.get('zaixianguahao/list', {
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
                          var obj = JSON.parse(localStorage.getItem('crossObj'));
                          var table = localStorage.getItem('crossTable');

                          obj.renshu = parseFloat(obj.renshu) - parseFloat(this.ruleForm.renshu)

                          this.$http.post(table+`/update`,obj).then(res => {});
                          this.$http.post('zaixianguahao/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  if(this.uObject.jine>=0){
                                      this.uObject.jine = parseFloat(this.uObject.jine) - parseFloat(this.ruleForm.jine)
                                      this.$http.post(this.userTableName+'/update', this.uObject).then(res => {});
                                  }
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
                  var obj = JSON.parse(localStorage.getItem('crossObj'));
                  var table = localStorage.getItem('crossTable');

                  obj.renshu = parseFloat(obj.renshu) - parseFloat(this.ruleForm.renshu)

                  this.$http.post(table+`/update`,obj).then(res => {});
                  this.$http.post('zaixianguahao/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          if(this.uObject.jine>=0){
                              this.uObject.jine = parseFloat(this.uObject.jine) - parseFloat(this.ruleForm.jine)
                              this.$http.post(this.userTableName+'/update', this.uObject).then(res => {});
                          }
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
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #999;
	  background: #f9f9f9;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #999;
	  background: #f9f9f9;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #999;
	  background: #f9f9f9;
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
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #f9f9f9;
	  width: 200px;
	  font-size: 32px;
	  line-height: 180px;
	  text-align: center;
	  height: 180px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #f9f9f9;
	  width: 200px;
	  font-size: 32px;
	  line-height: 180px;
	  text-align: center;
	  height: 180px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #ccc;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #f9f9f9;
	  width: 200px;
	  font-size: 32px;
	  line-height: 180px;
	  text-align: center;
	  height: 180px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #999;
	  background: #f9f9f9;
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	}
</style>
