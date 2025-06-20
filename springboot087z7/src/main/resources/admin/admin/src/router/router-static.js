import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xiangmumingcheng from '@/views/modules/xiangmumingcheng/list'
    import aboutus from '@/views/modules/aboutus/list'
    import yuyuetijian from '@/views/modules/yuyuetijian/list'
    import jiuzhenkachongzhi from '@/views/modules/jiuzhenkachongzhi/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import daohangfuwu from '@/views/modules/daohangfuwu/list'
    import tijianbaogao from '@/views/modules/tijianbaogao/list'
    import zhinengdaozhen from '@/views/modules/zhinengdaozhen/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import zaixianguahao from '@/views/modules/zaixianguahao/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import chufangxinxi from '@/views/modules/chufangxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import binglixinxi from '@/views/modules/binglixinxi/list'
    import yaopinleixing from '@/views/modules/yaopinleixing/list'
    import keshifenlei from '@/views/modules/keshifenlei/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/xiangmumingcheng',
        name: '项目名称',
        component: xiangmumingcheng
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/yuyuetijian',
        name: '预约体检',
        component: yuyuetijian
      }
      ,{
	path: '/jiuzhenkachongzhi',
        name: '就诊卡充值',
        component: jiuzhenkachongzhi
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/daohangfuwu',
        name: '导航服务',
        component: daohangfuwu
      }
      ,{
	path: '/tijianbaogao',
        name: '体检报告',
        component: tijianbaogao
      }
      ,{
	path: '/zhinengdaozhen',
        name: '智能导诊',
        component: zhinengdaozhen
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/zaixianguahao',
        name: '在线挂号',
        component: zaixianguahao
      }
      ,{
	path: '/jiaofeixinxi',
        name: '交费信息',
        component: jiaofeixinxi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/chufangxinxi',
        name: '处方信息',
        component: chufangxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '我的消息',
        component: chat
      }
      ,{
	path: '/binglixinxi',
        name: '病历信息',
        component: binglixinxi
      }
      ,{
	path: '/yaopinleixing',
        name: '药品类型',
        component: yaopinleixing
      }
      ,{
	path: '/keshifenlei',
        name: '科室分类',
        component: keshifenlei
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
