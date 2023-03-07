<template>
  <nav>
    <router-link class="menubar" to="/baeminselfservice">배민셀프서비스 |</router-link>
    <router-link class="menubar" to="/baeminsanghoe">배민상회 |</router-link>
    <router-link class="menubar" to="/baeminAcademy">배민아카데미 |</router-link>
    <router-link class="menubar" to="/baeminjangbu">배민장부 |</router-link>
    <router-link class="menubar" to="/baeminlobos">배민로봇</router-link>
    <router-link class="menubar2" to="/join">회원가입</router-link>
    <router-link class="menubar2" to="/login">로그인 |</router-link>
    <router-link class="menubar2" to="/csc">고객센터 |</router-link>  <!--customer service center = csc 로 만듬-->
    <router-link class="menubar2" to="/announcement">공지사항 |</router-link>
  </nav>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.menubar {
  display: block;
  font-size: 12px;
  font-weight: lighter;
  font-family: cursive;
  float: left;
}

.menubar2 {
  display: inline-block;
  font-size: 12px;
  font-weight: lighter;
  font-family: cursive;
  float: right;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
