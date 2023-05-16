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
    import doctor from '@/views/modules/doctor/list'
    import news from '@/views/modules/news/list'
    import patient from '@/views/modules/patient/list'
    import druginformation from '@/views/modules/druginformation/list'
    import nurse from '@/views/modules/nurse/list'
    import bedinformation from '@/views/modules/bedinformation/list'
    import nursinginformation from '@/views/modules/nursinginformation/list'
    import dischargeinformation from '@/views/modules/dischargeinformation/list'
    import inpatientregistration from '@/views/modules/inpatientregistration/list'
    import config from '@/views/modules/config/list'
    import medicationinformation from '@/views/modules/medicationinformation/list'


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
	path: '/doctor',
        name: 'doctor',
        component: doctor
      }
      ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
      ,{
	path: '/patient',
        name: 'patient',
        component: patient
      }
      ,{
	path: '/druginformation',
        name: 'druginformation',
        component: druginformation
      }
      ,{
	path: '/nurse',
        name: 'nurse',
        component: nurse
      }
      ,{
	path: '/bedinformation',
        name: 'bedinformation',
        component: bedinformation
      }
      ,{
	path: '/nursinginformation',
        name: 'nursinginformation',
        component: nursinginformation
      }
      ,{
	path: '/dischargeinformation',
        name: 'dischargeinformation',
        component: dischargeinformation
      }
      ,{
	path: '/inpatientregistration',
        name: 'inpatientregistration',
        component: inpatientregistration
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/medicationinformation',
        name: 'medicationinformation',
        component: medicationinformation
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
