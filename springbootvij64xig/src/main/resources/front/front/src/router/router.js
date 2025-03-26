import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import nongchangzhuList from '../pages/nongchangzhu/list'
import nongchangzhuDetail from '../pages/nongchangzhu/detail'
import nongchangzhuAdd from '../pages/nongchangzhu/add'
import zhuanjiaList from '../pages/zhuanjia/list'
import zhuanjiaDetail from '../pages/zhuanjia/detail'
import zhuanjiaAdd from '../pages/zhuanjia/add'
import nongchangxinxiList from '../pages/nongchangxinxi/list'
import nongchangxinxiDetail from '../pages/nongchangxinxi/detail'
import nongchangxinxiAdd from '../pages/nongchangxinxi/add'
import guoshuzhishiList from '../pages/guoshuzhishi/list'
import guoshuzhishiDetail from '../pages/guoshuzhishi/detail'
import guoshuzhishiAdd from '../pages/guoshuzhishi/add'
import guoshuleixingList from '../pages/guoshuleixing/list'
import guoshuleixingDetail from '../pages/guoshuleixing/detail'
import guoshuleixingAdd from '../pages/guoshuleixing/add'
import guoshuxinxiList from '../pages/guoshuxinxi/list'
import guoshuxinxiDetail from '../pages/guoshuxinxi/detail'
import guoshuxinxiAdd from '../pages/guoshuxinxi/add'
import shengzhangjihuaList from '../pages/shengzhangjihua/list'
import shengzhangjihuaDetail from '../pages/shengzhangjihua/detail'
import shengzhangjihuaAdd from '../pages/shengzhangjihua/add'
import zhongzhixinxiList from '../pages/zhongzhixinxi/list'
import zhongzhixinxiDetail from '../pages/zhongzhixinxi/detail'
import zhongzhixinxiAdd from '../pages/zhongzhixinxi/add'
import zixunwentiList from '../pages/zixunwenti/list'
import zixunwentiDetail from '../pages/zixunwenti/detail'
import zixunwentiAdd from '../pages/zixunwenti/add'
import huidawentiList from '../pages/huidawenti/list'
import huidawentiDetail from '../pages/huidawenti/detail'
import huidawentiAdd from '../pages/huidawenti/add'
import zhongzhipingguList from '../pages/zhongzhipinggu/list'
import zhongzhipingguDetail from '../pages/zhongzhipinggu/detail'
import zhongzhipingguAdd from '../pages/zhongzhipinggu/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

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
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
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
					path: 'nongchangzhu',
					component: nongchangzhuList
				},
				{
					path: 'nongchangzhuDetail',
					component: nongchangzhuDetail
				},
				{
					path: 'nongchangzhuAdd',
					component: nongchangzhuAdd
				},
				{
					path: 'zhuanjia',
					component: zhuanjiaList
				},
				{
					path: 'zhuanjiaDetail',
					component: zhuanjiaDetail
				},
				{
					path: 'zhuanjiaAdd',
					component: zhuanjiaAdd
				},
				{
					path: 'nongchangxinxi',
					component: nongchangxinxiList
				},
				{
					path: 'nongchangxinxiDetail',
					component: nongchangxinxiDetail
				},
				{
					path: 'nongchangxinxiAdd',
					component: nongchangxinxiAdd
				},
				{
					path: 'guoshuzhishi',
					component: guoshuzhishiList
				},
				{
					path: 'guoshuzhishiDetail',
					component: guoshuzhishiDetail
				},
				{
					path: 'guoshuzhishiAdd',
					component: guoshuzhishiAdd
				},
				{
					path: 'guoshuleixing',
					component: guoshuleixingList
				},
				{
					path: 'guoshuleixingDetail',
					component: guoshuleixingDetail
				},
				{
					path: 'guoshuleixingAdd',
					component: guoshuleixingAdd
				},
				{
					path: 'guoshuxinxi',
					component: guoshuxinxiList
				},
				{
					path: 'guoshuxinxiDetail',
					component: guoshuxinxiDetail
				},
				{
					path: 'guoshuxinxiAdd',
					component: guoshuxinxiAdd
				},
				{
					path: 'shengzhangjihua',
					component: shengzhangjihuaList
				},
				{
					path: 'shengzhangjihuaDetail',
					component: shengzhangjihuaDetail
				},
				{
					path: 'shengzhangjihuaAdd',
					component: shengzhangjihuaAdd
				},
				{
					path: 'zhongzhixinxi',
					component: zhongzhixinxiList
				},
				{
					path: 'zhongzhixinxiDetail',
					component: zhongzhixinxiDetail
				},
				{
					path: 'zhongzhixinxiAdd',
					component: zhongzhixinxiAdd
				},
				{
					path: 'zixunwenti',
					component: zixunwentiList
				},
				{
					path: 'zixunwentiDetail',
					component: zixunwentiDetail
				},
				{
					path: 'zixunwentiAdd',
					component: zixunwentiAdd
				},
				{
					path: 'huidawenti',
					component: huidawentiList
				},
				{
					path: 'huidawentiDetail',
					component: huidawentiDetail
				},
				{
					path: 'huidawentiAdd',
					component: huidawentiAdd
				},
				{
					path: 'zhongzhipinggu',
					component: zhongzhipingguList
				},
				{
					path: 'zhongzhipingguDetail',
					component: zhongzhipingguDetail
				},
				{
					path: 'zhongzhipingguAdd',
					component: zhongzhipingguAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
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
