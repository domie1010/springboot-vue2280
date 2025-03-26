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
    import zhongzhixinxi from '@/views/modules/zhongzhixinxi/list'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import zhongzhipinggu from '@/views/modules/zhongzhipinggu/list'
    import zhuanjia from '@/views/modules/zhuanjia/list'
    import nongchangxinxi from '@/views/modules/nongchangxinxi/list'
    import guoshuxinxi from '@/views/modules/guoshuxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import systemintro from '@/views/modules/systemintro/list'
    import huidawenti from '@/views/modules/huidawenti/list'
    import shengzhangjihua from '@/views/modules/shengzhangjihua/list'
    import guoshuzhishi from '@/views/modules/guoshuzhishi/list'
    import zixunwenti from '@/views/modules/zixunwenti/list'
    import nongchangzhu from '@/views/modules/nongchangzhu/list'
    import guoshuleixing from '@/views/modules/guoshuleixing/list'
    import config from '@/views/modules/config/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/zhongzhixinxi',
        name: '种植信息',
        component: zhongzhixinxi
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/zhongzhipinggu',
        name: '种植评估',
        component: zhongzhipinggu
      }
      ,{
	path: '/zhuanjia',
        name: '专家',
        component: zhuanjia
      }
      ,{
	path: '/nongchangxinxi',
        name: '农场信息',
        component: nongchangxinxi
      }
      ,{
	path: '/guoshuxinxi',
        name: '果树信息',
        component: guoshuxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏',
        component: storeup
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/huidawenti',
        name: '回答问题',
        component: huidawenti
      }
      ,{
	path: '/shengzhangjihua',
        name: '生长计划',
        component: shengzhangjihua
      }
      ,{
	path: '/guoshuzhishi',
        name: '果树知识',
        component: guoshuzhishi
      }
      ,{
	path: '/zixunwenti',
        name: '咨询问题',
        component: zixunwenti
      }
      ,{
	path: '/nongchangzhu',
        name: '农场主',
        component: nongchangzhu
      }
      ,{
	path: '/guoshuleixing',
        name: '果树类型',
        component: guoshuleixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
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
