<template>
<div :style='{"border":"1px solid #dfdfdf","padding":"20px","margin":"20px auto 0","borderRadius":"16px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="导诊编号" prop="daozhenbianhao">
              <el-input v-model="ruleForm.daozhenbianhao" placeholder="导诊编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="账号" prop="zhanghao">
            <el-select  @change="zhanghaoChange" v-model="ruleForm.zhanghao" placeholder="请选择账号">
              <el-option
                  v-for="(item,index) in zhanghaoOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="性别" prop="xingbie">
            <el-input v-model="ruleForm.xingbie" 
                placeholder="性别" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="就诊卡号" prop="jiuzhenkahao">
            <el-input v-model="ruleForm.jiuzhenkahao" 
                placeholder="就诊卡号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="症状描述" prop="zhengzhuangmiaoshu">
            <el-input v-model="ruleForm.zhengzhuangmiaoshu" 
                placeholder="症状描述" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="推荐医生" prop="yishenggonghao">
            <el-select  @change="yishenggonghaoChange" v-model="ruleForm.yishenggonghao" placeholder="请选择推荐医生">
              <el-option
                  v-for="(item,index) in yishenggonghaoOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="医生姓名" prop="yishengxingming">
            <el-input v-model="ruleForm.yishengxingming" 
                placeholder="医生姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="职位" prop="zhiwei">
            <el-input v-model="ruleForm.zhiwei" 
                placeholder="职位" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室号" prop="keshihao">
            <el-input v-model="ruleForm.keshihao" 
                placeholder="科室号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室名称" prop="keshimingcheng">
            <el-input v-model="ruleForm.keshimingcheng" 
                placeholder="科室名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室分类" prop="keshifenlei">
            <el-input v-model="ruleForm.keshifenlei" 
                placeholder="科室分类" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="科室地址" prop="keshidizhi">
            <el-input v-model="ruleForm.keshidizhi" 
                placeholder="科室地址" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"1px solid #dfdfdf","padding":"10px","boxShadow":"1px 2px 3px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"radial-gradient(circle, rgba(246,246,246,1) 0%, rgba(230,230,230,1) 100%)"}' label="推荐时间" prop="tuijianshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.tuijianshijian" 
                  type="datetime"
                  placeholder="推荐时间">
              </el-date-picker>
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
        baseUrl: '',
        ro:{
            daozhenbianhao : false,
            zhanghao : false,
            xingming : false,
            xingbie : false,
            jiuzhenkahao : false,
            zhengzhuangmiaoshu : false,
            yishenggonghao : false,
            yishengxingming : false,
            zhiwei : false,
            keshihao : false,
            keshimingcheng : false,
            keshifenlei : false,
            keshidizhi : false,
            tuijianshijian : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          daozhenbianhao: this.getUUID(),
          zhanghao: '',
          xingming: '',
          xingbie: '',
          jiuzhenkahao: '',
          zhengzhuangmiaoshu: '',
          yishenggonghao: '',
          yishengxingming: '',
          zhiwei: '',
          keshihao: '',
          keshimingcheng: '',
          keshifenlei: '',
          keshidizhi: '',
          tuijianshijian: '',
        },
        zhanghaoOptions: [],
        yishenggonghaoOptions: [],


        rules: {
          daozhenbianhao: [
          ],
          zhanghao: [
          ],
          xingming: [
          ],
          xingbie: [
          ],
          jiuzhenkahao: [
          ],
          zhengzhuangmiaoshu: [
            { required: true, message: '症状描述不能为空', trigger: 'blur' },
          ],
          yishenggonghao: [
            { required: true, message: '推荐医生不能为空', trigger: 'blur' },
          ],
          yishengxingming: [
          ],
          zhiwei: [
          ],
          keshihao: [
          ],
          keshimingcheng: [
          ],
          keshifenlei: [
          ],
          keshidizhi: [
          ],
          tuijianshijian: [
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
      this.ruleForm.tuijianshijian = this.getCurDateTime()
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
            if(o=='daozhenbianhao'){
              this.ruleForm.daozhenbianhao = obj[o];
              this.ro.daozhenbianhao = true;
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
            if(o=='xingbie'){
              this.ruleForm.xingbie = obj[o];
              this.ro.xingbie = true;
              continue;
            }
            if(o=='jiuzhenkahao'){
              this.ruleForm.jiuzhenkahao = obj[o];
              this.ro.jiuzhenkahao = true;
              continue;
            }
            if(o=='zhengzhuangmiaoshu'){
              this.ruleForm.zhengzhuangmiaoshu = obj[o];
              this.ro.zhengzhuangmiaoshu = true;
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
            if(o=='keshihao'){
              this.ruleForm.keshihao = obj[o];
              this.ro.keshihao = true;
              continue;
            }
            if(o=='keshimingcheng'){
              this.ruleForm.keshimingcheng = obj[o];
              this.ro.keshimingcheng = true;
              continue;
            }
            if(o=='keshifenlei'){
              this.ruleForm.keshifenlei = obj[o];
              this.ro.keshifenlei = true;
              continue;
            }
            if(o=='keshidizhi'){
              this.ruleForm.keshidizhi = obj[o];
              this.ro.keshidizhi = true;
              continue;
            }
            if(o=='tuijianshijian'){
              this.ruleForm.tuijianshijian = obj[o];
              this.ro.tuijianshijian = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.daozhenbianhao!=''&&json.daozhenbianhao) || json.daozhenbianhao==0){
                this.ruleForm.daozhenbianhao = json.daozhenbianhao
            }
            if((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0){
                this.ruleForm.zhanghao = json.zhanghao
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming
            }
            if((json.xingbie!=''&&json.xingbie) || json.xingbie==0){
                this.ruleForm.xingbie = json.xingbie
            }
            if((json.jiuzhenkahao!=''&&json.jiuzhenkahao) || json.jiuzhenkahao==0){
                this.ruleForm.jiuzhenkahao = json.jiuzhenkahao
            }
            if((json.zhengzhuangmiaoshu!=''&&json.zhengzhuangmiaoshu) || json.zhengzhuangmiaoshu==0){
                this.ruleForm.zhengzhuangmiaoshu = json.zhengzhuangmiaoshu
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
        this.$http.get('option/yonghu/zhanghao', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.zhanghaoOptions = res.data.data;
          }
        });
        this.$http.get('option/keshixinxi/yishenggonghao', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.yishenggonghaoOptions = res.data.data;
          }
        });
      },
      // 下二随
      zhanghaoChange () {
        this.$http.get('follow/yonghu/zhanghao?columnValue=' + this.ruleForm.zhanghao, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.xingming){
              this.ruleForm.xingming = res.data.data.xingming
            }
            if(res.data.data.xingbie){
              this.ruleForm.xingbie = res.data.data.xingbie
            }
            if(res.data.data.jiuzhenkahao){
              this.ruleForm.jiuzhenkahao = res.data.data.jiuzhenkahao
            }
            if(res.data.data.zhengzhuangmiaoshu){
              this.ruleForm.zhengzhuangmiaoshu = res.data.data.zhengzhuangmiaoshu
            }
            if(res.data.data.yishengxingming){
              this.ruleForm.yishengxingming = res.data.data.yishengxingming
            }
            if(res.data.data.zhiwei){
              this.ruleForm.zhiwei = res.data.data.zhiwei
            }
            if(res.data.data.keshihao){
              this.ruleForm.keshihao = res.data.data.keshihao
            }
            if(res.data.data.keshimingcheng){
              this.ruleForm.keshimingcheng = res.data.data.keshimingcheng
            }
            if(res.data.data.keshifenlei){
              this.ruleForm.keshifenlei = res.data.data.keshifenlei
            }
            if(res.data.data.keshidizhi){
              this.ruleForm.keshidizhi = res.data.data.keshidizhi
            }
          }
        });
      },
      // 下二随
      yishenggonghaoChange () {
        this.$http.get('follow/keshixinxi/yishenggonghao?columnValue=' + this.ruleForm.yishenggonghao, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.xingming){
              this.ruleForm.xingming = res.data.data.xingming
            }
            if(res.data.data.xingbie){
              this.ruleForm.xingbie = res.data.data.xingbie
            }
            if(res.data.data.jiuzhenkahao){
              this.ruleForm.jiuzhenkahao = res.data.data.jiuzhenkahao
            }
            if(res.data.data.zhengzhuangmiaoshu){
              this.ruleForm.zhengzhuangmiaoshu = res.data.data.zhengzhuangmiaoshu
            }
            if(res.data.data.yishengxingming){
              this.ruleForm.yishengxingming = res.data.data.yishengxingming
            }
            if(res.data.data.zhiwei){
              this.ruleForm.zhiwei = res.data.data.zhiwei
            }
            if(res.data.data.keshihao){
              this.ruleForm.keshihao = res.data.data.keshihao
            }
            if(res.data.data.keshimingcheng){
              this.ruleForm.keshimingcheng = res.data.data.keshimingcheng
            }
            if(res.data.data.keshifenlei){
              this.ruleForm.keshifenlei = res.data.data.keshifenlei
            }
            if(res.data.data.keshidizhi){
              this.ruleForm.keshidizhi = res.data.data.keshidizhi
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('zhinengdaozhen/detail/${id}', {emulateJSON: true}).then(res => {
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
                 this.$http.get('zhinengdaozhen/list', {
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


                          this.$http.post('zhinengdaozhen/add', this.ruleForm).then(res => {
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


                  this.$http.post('zhinengdaozhen/add', this.ruleForm).then(res => {
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
