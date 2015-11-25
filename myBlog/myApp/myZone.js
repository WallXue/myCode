var express = require('express');
var url = require('url'); //解析操作url
var superagent = require('superagent'); //这三个外部依赖不要忘记npm install
var cheerio = require('cheerio');
var eventproxy = require('eventproxy');
var targetUrl = 'https://cnodejs.org/';

// exports.test = function() {
// superagent.get('http://top.baidu.com/?fr=mhd_card').set('Accept-Language', 'zh-CN,zh;q=0.8')
    //     .end(function(err, res) {
    //     	console.log(res.header)
    //         var $ = cheerio.load(res.text);
    //         // 获取首页所有的链接
    //         // $('#hot-list > li').each(function (idx, element) {
    //         //     var $element = $(element);
    //         //     console.log($element);
    //         // });
    //         var a = $($('#hot-list > li')).text();
    //         console.log(a);
    //     });


    var gbk = require('iconv-lite');

gbk.fetch('http://top.baidu.com/?fr=mhd_card').to('string', function(err, string){
  if (err) 
    return console.log(err);

  console.log(string)

  return console.log('fetch done!');
});

// }
