import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/join',
    name: 'joinView',
    component: () => import(/* webpackChunkName: "home" */ '../views/home/joinView.vue')
  },
  {
    path: '/login',
    name: 'loginView',
    component: () => import(/* webpackChunkName: "home" */ '../views/home/loginView.vue')
  },
  {
    path: '/csc',
    name: 'cscView',
    component: () => import(/* webpackChunkName: "home" */ '../views/home/cscView.vue')
  },
  {
    path: '/announcement',
    name: 'announcementView',
    component: () => import(/* webpackChunkName: "home" */ '../views/home/announcementView.vue')
  },
  {
    path: '/baemin_Academy',
    name: 'baemin_Academy',
    component: () => import(/* webpackChunkName: "baeminMenubar" */ '../components/baeminMenubar/baemin_Academy.vue')
  },
  {
    path: '/baemin_selfservice',
    name: 'baemin_selfservice',
    component: () => import(/* webpackChunkName: "baeminMenubar" */ '../components/baeminMenubar/baemin_selfservice.vue')
  },
  {
    path: '/baemin_sanghoe',
    name: 'baemin_sanghoe',
    component: () => import(/* webpackChunkName: "baeminMenubar" */ '../components/baeminMenubar/baemin_sanghoe.vue')
  },
  {
    path: '/baemin_jangbu',
    name: 'baemin_jangbu',
    component: () => import(/* webpackChunkName: "baeminMenubar" */ '../components/baeminMenubar/baemin_jangbu.vue')
  },
  {
    path: '/baemin_lobos',
    name: 'baemin_lobos',
    component: () => import(/* webpackChunkName: "baeminMenubar" */ '../components/baeminMenubar/baemin_lobos.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
