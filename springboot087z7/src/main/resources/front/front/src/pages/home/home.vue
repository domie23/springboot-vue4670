<template>
<div class="home-preview" :style='{"width":"1200px","margin":"20px auto 20px","flexWrap":"wrap","justifyContent":"space-between","display":"flex"}'>
	<el-row type="flex" :gutter="5" justify="center" style="width: 100%">
		<el-col :span="3" v-if="queryList.length>1">
			<el-select v-model="queryIndex">
				<el-option
				  v-for="(item,index) in queryList"
				  :key="index"
				  :label="item.queryName"
				  :value="index"
				></el-option>
			</el-select>
		</el-col>
		<el-col :span="3" v-if="queryIndex==0">
			<el-input v-model="keshixinxikeshimingcheng" placeholder="科室名称"></el-input>
		</el-col>
		<el-col :span="3" v-if="queryIndex==0">
			<el-button type="primary" @click="search('keshixinxi')">搜索</el-button>
		</el-col>
	</el-row>


	<!-- 系统简介 -->
	<div :style='{"border":"1px solid #dfdfdf","padding":"20px","boxShadow":"1px 2px 3px #eee","margin":"20px 0 20px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","position":"relative","height":"auto","order":"5"}'>
	  <div :style='{"margin":"12px 0 0 0","color":"#005aad","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px bottom,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px bottom","width":"100%","lineHeight":"1.5","fontSize":"24px","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>{{systemIntroductionDetail.title}}</div>
	  <div :style='{"width":"100%","margin":"0 0 24px 0","lineHeight":"1.5","fontSize":"14px","color":"#999","textAlign":"center"}'>{{systemIntroductionDetail.subtitle}}</div>
	  <div :style='{"width":"580px","padding":"0px","float":"right","display":"inline-block","height":"auto"}'>
	    <img :style='{"boxShadow":"1px 1px 1px #ddd","margin":"0px","objectFit":"cover","borderRadius":"8px","display":"block","width":"100%","height":"360px"}' :src="baseUrl + systemIntroductionDetail.picture1">
	    <img :style='{"boxShadow":"1px 1px 1px #ddd","margin":"0px","objectFit":"cover","borderRadius":"8px","left":"20px","flex":1,"bottom":"20px","display":"block","width":"265px","position":"absolute","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
	    <img :style='{"boxShadow":"1px 1px 1px #ddd","margin":"0px","objectFit":"cover","borderRadius":"8px","left":"315px","flex":1,"bottom":"20px","display":"block","width":"265px","position":"absolute","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
	  </div>
	  <div :style='{"padding":"12px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"0","color":"#666","float":"left","textIndent":"2em","overflow":"hidden","borderRadius":"8px","background":"url(http://codegen.caihongy.cn/20221029/156bf500d9c74e7a831138b6578deb46.png) no-repeat center bottom,#fff","width":"560px","lineHeight":"24px","fontSize":"14px","height":"220px"}' v-html="systemIntroductionDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>


	
<div class="news" :style='{"border":"1px solid #dfdfdf","padding":"20px","boxShadow":"1px 2px 3px #eee","margin":"0 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"49%","height":"660px","order":"2"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat -70px bottom,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 400px bottom"}'>
		<span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>公告信息</span>
	</div>
	
	
	
	
	
	
	
	
	
	<!-- 样式八 -->
	<div v-if="newsList.length" class="list list8 index-pv1" :style='{"cursor":"pointer","padding":"10px","flexWrap":"wrap","background":"none","display":"flex","width":"100%","height":"auto"}'>
	  <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" :style='{"padding":"10px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"0 10px 10px","borderRadius":"8px","background":"#f5f5f5","display":"flex","width":"100%","height":"auto"}' class="list-item animation-box">
	    <div :style='{"width":"400px","padding":"0 10px","height":"auto","order":"2"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"24px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[0].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"48px"}'>{{newsList[0].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[0].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"width":"100px","objectFit":"cover","borderRadius":"8px","height":"100px"}' :src="baseUrl + newsList[0].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" :style='{"padding":"10px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"0 10px 10px","borderRadius":"8px","background":"#f5f5f5","display":"flex","width":"100%","height":"auto"}' class="list-item animation-box">
	    <img :style='{"width":"100px","objectFit":"cover","borderRadius":"8px","height":"100px"}' :src="baseUrl + newsList[1].picture" >
	    <div :style='{"width":"400px","padding":"0 10px","height":"auto"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"24px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[1].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"48px"}'>{{newsList[1].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[1].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	  <div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" :style='{"padding":"10px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"0 10px 10px","borderRadius":"8px","background":"#f5f5f5","display":"flex","width":"100%","height":"auto"}' class="list-item animation-box">
	    <div :style='{"width":"400px","padding":"0 10px","height":"auto","order":"2"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"28px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[2].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"48px"}'>{{newsList[2].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[2].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"width":"100px","objectFit":"cover","borderRadius":"8px","height":"100px"}' :src="baseUrl + newsList[2].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" :style='{"padding":"10px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"0 10px","borderRadius":"8px","background":"#f5f5f5","display":"flex","width":"100%","height":"auto"}' class="list-item animation-box">
	    <img :style='{"width":"100px","objectFit":"cover","borderRadius":"8px","height":"100px"}' :src="baseUrl + newsList[3].picture" >
	    <div :style='{"width":"400px","padding":"0 10px","height":"auto"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"28px","textOverflow":"ellipsis","fontWeight":"bold"}'>{{newsList[3].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"48px"}'>{{newsList[3].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[3].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	</div>
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"42px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"none","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>


<div class="lists" :style='{"border":"1px solid #dfdfdf","padding":"0 12px 20px 12px","boxShadow":"1px 2px 3px #eee","margin":"0 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","height":"auto","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px center,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px center"}'>
	  <span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>科室信息展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listskeshixinxi" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0","cursor":"pointer","fontSize":"0","position":"relative","borderRadius":"4px","background":"#fff"}' v-for="(item,index) in keshixinxiList" :key="index" @click="toDetail('keshixinxiDetail', item)">
					<img :name="item.id" :style='{"border":"1px solid #ddd","width":"216px","borderRadius":"8px","objectFit":"contain","background":"#fff","height":"216px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"1px solid #ddd","width":"216px","borderRadius":"8px","objectFit":"contain","background":"#fff","height":"216px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","textAlign":"center","background":"#f5f5f5","fontSize":"14px","lineHeight":"32px","textOverflow":"ellipsis"}'>{{item.keshimingcheng}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('keshixinxi')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"36px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"#fff","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"border":"1px solid #dfdfdf","padding":"0 12px 20px 12px","boxShadow":"1px 2px 3px #eee","margin":"0 0 80px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"100%","height":"auto","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"24px 0 24px 0","lineHeight":"1.5","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat 240px center,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 760px center"}'>
	  <span :style='{"fontSize":"24px","color":"#005aad","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>导航服务展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listsdaohangfuwu" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0","cursor":"pointer","fontSize":"0","position":"relative","borderRadius":"4px","background":"#fff"}' v-for="(item,index) in daohangfuwuList" :key="index" @click="toDetail('daohangfuwuDetail', item)">
					<img :name="item.id" :style='{"border":"1px solid #ddd","width":"216px","borderRadius":"8px","objectFit":"contain","background":"#fff","height":"216px"}' v-if="preHttp(item.luxiantu)" :src="item.luxiantu.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"1px solid #ddd","width":"216px","borderRadius":"8px","objectFit":"contain","background":"#fff","height":"216px"}' v-else :src="baseUrl + (item.luxiantu?item.luxiantu.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","boxShadow":"1px 1px 1px #ddd","margin":"4px 0 0 0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"8px","textAlign":"center","background":"#f5f5f5","fontSize":"14px","lineHeight":"32px","textOverflow":"ellipsis"}'>{{item.chufadi}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('daohangfuwu')" :style='{"border":"1px solid #89c2f9","cursor":"pointer","boxShadow":"0px 4px 1px #c7d3de,inset 0px 0px 56px 0px #a0cbf7","margin":"36px auto","borderRadius":"30%","textAlign":"center","left":"47%","background":"#fff","display":"block","width":"120px","lineHeight":"36px","position":"absolute"}'>
		<span :style='{"color":"#0583fc","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#0583fc","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>


	<!-- 关于我们 -->
	<div :style='{"border":"1px solid #dfdfdf","padding":"20px","boxShadow":"1px 2px 3px #eee","margin":"0px 0 20px","overflow":"hidden","borderRadius":"16px","background":"#fff","width":"49%","height":"660px","order":"1"}'>
	  <div :style='{"margin":"12px 0 0 0","color":"#005aad","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221027/fc985400d2a2484d8d9e17eb893d2c05.png) no-repeat -70px bottom,url(http://codegen.caihongy.cn/20221027/6602c4fb09df4bd4881cabfef19d2ed3.png) no-repeat 400px bottom","width":"100%","lineHeight":"1.5","fontSize":"24px","textShadow":"2px 4px 2px #eee","fontWeight":"bold"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"width":"100%","margin":"0 0 24px 0","lineHeight":"1.5","fontSize":"14px","color":"#999","textAlign":"center"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"width":"100%","padding":"0px","float":"left","display":"inline-block","height":"auto"}'>
	    <img :style='{"boxShadow":"1px 1px 1px #ddd","margin":"0px","objectFit":"cover","borderRadius":"8px","display":"block","width":"48%","float":"left","height":"170px"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"margin":"0 0px","objectFit":"cover","borderRadius":"8px","display":"block","width":"48%","float":"right","height":"170px"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"padding":"12px","boxShadow":"1px 1px 1px #ddd,inset 0px 0px 56px 0px #eee","margin":"20px 0 0 0","color":"rgb(102, 102, 102)","display":"inline-block","float":"right","textIndent":"2em","overflow":"hidden","borderRadius":"8px","background":"url(http://codegen.caihongy.cn/20221029/2745081538874ed18856d58d8d939868.png) no-repeat center bottom,#fff","width":"100%","lineHeight":"24px","fontSize":"14px","height":"340px"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>
</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        queryList:[
          {
              queryName:"科室名称",
          },
        ],
        queryIndex: 0,
        keshixinxikeshimingcheng: '',
        newsList: [],

        keshixinxiList: [],
        daohangfuwuList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getAboutUs();
      this.getSystemIntroduction();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
      search(tablename) {
        if (this.queryIndex == 0 && this.keshixinxikeshimingcheng) {
          this.$router.push({path: '/index/' + tablename, query: {indexQueryCondition: this.keshixinxikeshimingcheng}});
        }
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 6,
                sort: 'addtime',
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
			
			this.$http.get('keshixinxi/list', {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.keshixinxiList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listskeshixinxi', options)
					})
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('daohangfuwu/list', {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.daohangfuwuList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listsdaohangfuwu', options)
					})
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
