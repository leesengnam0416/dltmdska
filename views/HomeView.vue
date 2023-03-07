<template>
  <div class="home">
    <img class="logo" alt="Vue logo" src="../assets/baeminlogo.png">
    <HelloWorld msg="어서오세요"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  }
}
</script>

<style>
.logo {
  width: 160px;
  height: 70px;
  float: left;
}
</style>
