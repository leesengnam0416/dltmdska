const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave:false
})

// vue.config.js
const MiniCssExtractPlugin = require('mini-css-extract-plugin')

module.exports = {
  configureWebpack: {
    plugins: [new MiniCssExtractPlugin()]
  }
}

module.exports = {
  chainWebpack: config => {
    config
      .plugin('mini-css-extract')
      .use(MiniCssExtractPlugin, [{
        filename: '[name].[contenthash].css'
      }]);
  }
};

