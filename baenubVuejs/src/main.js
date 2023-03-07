import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
// 아래 두줄만 넣으면 된다.
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

createApp(App).use(store).use(router).mount('#app')
