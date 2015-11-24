var express = require('express');
var path = require('path');
var router = express.Router();
var myZone = require('../service/myZone');


/* GET home page. */
router.get('/', function(req, res, next) {
	console.log(path.posix.basename());
  	res.sendfile('C:/gitbase/myBlog/myApp/views/index.html');
});


router.get('/test', function(req, res, next) {
	console.log(myZone);
	myZone.test();
});
module.exports = router;
