import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import keshifenleiList from '../pages/keshifenlei/list'
import keshifenleiDetail from '../pages/keshifenlei/detail'
import keshifenleiAdd from '../pages/keshifenlei/add'
import keshixinxiList from '../pages/keshixinxi/list'
import keshixinxiDetail from '../pages/keshixinxi/detail'
import keshixinxiAdd from '../pages/keshixinxi/add'
import zaixianguahaoList from '../pages/zaixianguahao/list'
import zaixianguahaoDetail from '../pages/zaixianguahao/detail'
import zaixianguahaoAdd from '../pages/zaixianguahao/add'
import yuyuetijianList from '../pages/yuyuetijian/list'
import yuyuetijianDetail from '../pages/yuyuetijian/detail'
import yuyuetijianAdd from '../pages/yuyuetijian/add'
import tijianbaogaoList from '../pages/tijianbaogao/list'
import tijianbaogaoDetail from '../pages/tijianbaogao/detail'
import tijianbaogaoAdd from '../pages/tijianbaogao/add'
import yaopinleixingList from '../pages/yaopinleixing/list'
import yaopinleixingDetail from '../pages/yaopinleixing/detail'
import yaopinleixingAdd from '../pages/yaopinleixing/add'
import yaopinxinxiList from '../pages/yaopinxinxi/list'
import yaopinxinxiDetail from '../pages/yaopinxinxi/detail'
import yaopinxinxiAdd from '../pages/yaopinxinxi/add'
import chufangxinxiList from '../pages/chufangxinxi/list'
import chufangxinxiDetail from '../pages/chufangxinxi/detail'
import chufangxinxiAdd from '../pages/chufangxinxi/add'
import jiaofeixinxiList from '../pages/jiaofeixinxi/list'
import jiaofeixinxiDetail from '../pages/jiaofeixinxi/detail'
import jiaofeixinxiAdd from '../pages/jiaofeixinxi/add'
import binglixinxiList from '../pages/binglixinxi/list'
import binglixinxiDetail from '../pages/binglixinxi/detail'
import binglixinxiAdd from '../pages/binglixinxi/add'
import zhinengdaozhenList from '../pages/zhinengdaozhen/list'
import zhinengdaozhenDetail from '../pages/zhinengdaozhen/detail'
import zhinengdaozhenAdd from '../pages/zhinengdaozhen/add'
import daohangfuwuList from '../pages/daohangfuwu/list'
import daohangfuwuDetail from '../pages/daohangfuwu/detail'
import daohangfuwuAdd from '../pages/daohangfuwu/add'
import jiuzhenkachongzhiList from '../pages/jiuzhenkachongzhi/list'
import jiuzhenkachongzhiDetail from '../pages/jiuzhenkachongzhi/detail'
import jiuzhenkachongzhiAdd from '../pages/jiuzhenkachongzhi/add'
import xiangmumingchengList from '../pages/xiangmumingcheng/list'
import xiangmumingchengDetail from '../pages/xiangmumingcheng/detail'
import xiangmumingchengAdd from '../pages/xiangmumingcheng/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'keshifenlei',
					component: keshifenleiList
				},
				{
					path: 'keshifenleiDetail',
					component: keshifenleiDetail
				},
				{
					path: 'keshifenleiAdd',
					component: keshifenleiAdd
				},
				{
					path: 'keshixinxi',
					component: keshixinxiList
				},
				{
					path: 'keshixinxiDetail',
					component: keshixinxiDetail
				},
				{
					path: 'keshixinxiAdd',
					component: keshixinxiAdd
				},
				{
					path: 'zaixianguahao',
					component: zaixianguahaoList
				},
				{
					path: 'zaixianguahaoDetail',
					component: zaixianguahaoDetail
				},
				{
					path: 'zaixianguahaoAdd',
					component: zaixianguahaoAdd
				},
				{
					path: 'yuyuetijian',
					component: yuyuetijianList
				},
				{
					path: 'yuyuetijianDetail',
					component: yuyuetijianDetail
				},
				{
					path: 'yuyuetijianAdd',
					component: yuyuetijianAdd
				},
				{
					path: 'tijianbaogao',
					component: tijianbaogaoList
				},
				{
					path: 'tijianbaogaoDetail',
					component: tijianbaogaoDetail
				},
				{
					path: 'tijianbaogaoAdd',
					component: tijianbaogaoAdd
				},
				{
					path: 'yaopinleixing',
					component: yaopinleixingList
				},
				{
					path: 'yaopinleixingDetail',
					component: yaopinleixingDetail
				},
				{
					path: 'yaopinleixingAdd',
					component: yaopinleixingAdd
				},
				{
					path: 'yaopinxinxi',
					component: yaopinxinxiList
				},
				{
					path: 'yaopinxinxiDetail',
					component: yaopinxinxiDetail
				},
				{
					path: 'yaopinxinxiAdd',
					component: yaopinxinxiAdd
				},
				{
					path: 'chufangxinxi',
					component: chufangxinxiList
				},
				{
					path: 'chufangxinxiDetail',
					component: chufangxinxiDetail
				},
				{
					path: 'chufangxinxiAdd',
					component: chufangxinxiAdd
				},
				{
					path: 'jiaofeixinxi',
					component: jiaofeixinxiList
				},
				{
					path: 'jiaofeixinxiDetail',
					component: jiaofeixinxiDetail
				},
				{
					path: 'jiaofeixinxiAdd',
					component: jiaofeixinxiAdd
				},
				{
					path: 'binglixinxi',
					component: binglixinxiList
				},
				{
					path: 'binglixinxiDetail',
					component: binglixinxiDetail
				},
				{
					path: 'binglixinxiAdd',
					component: binglixinxiAdd
				},
				{
					path: 'zhinengdaozhen',
					component: zhinengdaozhenList
				},
				{
					path: 'zhinengdaozhenDetail',
					component: zhinengdaozhenDetail
				},
				{
					path: 'zhinengdaozhenAdd',
					component: zhinengdaozhenAdd
				},
				{
					path: 'daohangfuwu',
					component: daohangfuwuList
				},
				{
					path: 'daohangfuwuDetail',
					component: daohangfuwuDetail
				},
				{
					path: 'daohangfuwuAdd',
					component: daohangfuwuAdd
				},
				{
					path: 'jiuzhenkachongzhi',
					component: jiuzhenkachongzhiList
				},
				{
					path: 'jiuzhenkachongzhiDetail',
					component: jiuzhenkachongzhiDetail
				},
				{
					path: 'jiuzhenkachongzhiAdd',
					component: jiuzhenkachongzhiAdd
				},
				{
					path: 'xiangmumingcheng',
					component: xiangmumingchengList
				},
				{
					path: 'xiangmumingchengDetail',
					component: xiangmumingchengDetail
				},
				{
					path: 'xiangmumingchengAdd',
					component: xiangmumingchengAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
