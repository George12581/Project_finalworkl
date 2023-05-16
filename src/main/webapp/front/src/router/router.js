import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import patientList from '../pages/patient/list'
import patientDetail from '../pages/patient/detail'
import patientAdd from '../pages/patient/add'
import doctorList from '../pages/doctor/list'
import doctorDetail from '../pages/doctor/detail'
import doctorAdd from '../pages/doctor/add'
import nurseList from '../pages/nurse/list'
import nurseDetail from '../pages/nurse/detail'
import nurseAdd from '../pages/nurse/add'
import inpatientregistrationList from '../pages/inpatientregistration/list'
import inpatientregistrationDetail from '../pages/inpatientregistration/detail'
import inpatientregistrationAdd from '../pages/inpatientregistration/add'
import bedinformationList from '../pages/bedinformation/list'
import bedinformationDetail from '../pages/bedinformation/detail'
import bedinformationAdd from '../pages/bedinformation/add'
import nursinginformationList from '../pages/nursinginformation/list'
import nursinginformationDetail from '../pages/nursinginformation/detail'
import nursinginformationAdd from '../pages/nursinginformation/add'
import dischargeinformationList from '../pages/dischargeinformation/list'
import dischargeinformationDetail from '../pages/dischargeinformation/detail'
import dischargeinformationAdd from '../pages/dischargeinformation/add'
import druginformationList from '../pages/druginformation/list'
import druginformationDetail from '../pages/druginformation/detail'
import druginformationAdd from '../pages/druginformation/add'
import medicationinformationList from '../pages/medicationinformation/list'
import medicationinformationDetail from '../pages/medicationinformation/detail'
import medicationinformationAdd from '../pages/medicationinformation/add'

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
					path: 'patient',
					component: patientList
				},
				{
					path: 'patientDetail',
					component: patientDetail
				},
				{
					path: 'patientAdd',
					component: patientAdd
				},
				{
					path: 'doctor',
					component: doctorList
				},
				{
					path: 'doctorDetail',
					component: doctorDetail
				},
				{
					path: 'doctorAdd',
					component: doctorAdd
				},
				{
					path: 'nurse',
					component: nurseList
				},
				{
					path: 'nurseDetail',
					component: nurseDetail
				},
				{
					path: 'nurseAdd',
					component: nurseAdd
				},
				{
					path: 'inpatientregistration',
					component: inpatientregistrationList
				},
				{
					path: 'inpatientregistrationDetail',
					component: inpatientregistrationDetail
				},
				{
					path: 'inpatientregistrationAdd',
					component: inpatientregistrationAdd
				},
				{
					path: 'bedinformation',
					component: bedinformationList
				},
				{
					path: 'bedinformationDetail',
					component: bedinformationDetail
				},
				{
					path: 'bedinformationAdd',
					component: bedinformationAdd
				},
				{
					path: 'nursinginformation',
					component: nursinginformationList
				},
				{
					path: 'nursinginformationDetail',
					component: nursinginformationDetail
				},
				{
					path: 'nursinginformationAdd',
					component: nursinginformationAdd
				},
				{
					path: 'dischargeinformation',
					component: dischargeinformationList
				},
				{
					path: 'dischargeinformationDetail',
					component: dischargeinformationDetail
				},
				{
					path: 'dischargeinformationAdd',
					component: dischargeinformationAdd
				},
				{
					path: 'druginformation',
					component: druginformationList
				},
				{
					path: 'druginformationDetail',
					component: druginformationDetail
				},
				{
					path: 'druginformationAdd',
					component: druginformationAdd
				},
				{
					path: 'medicationinformation',
					component: medicationinformationList
				},
				{
					path: 'medicationinformationDetail',
					component: medicationinformationDetail
				},
				{
					path: 'medicationinformationAdd',
					component: medicationinformationAdd
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
