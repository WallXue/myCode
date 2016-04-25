var express = require('express');
var path = require('path');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
	// console.log(path.posix.basename());
  	res.sendfile('E:/gitbase/myBlog/myApp/views/index.html');
});

module.exports = router;
