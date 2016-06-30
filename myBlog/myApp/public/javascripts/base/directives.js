define(['app'], function(app){
	
	app.directive('myloginmodal', function(){
		var directive = {};
	    directive.restrict = 'E'; /* restrict this directive to elements */
	    directive.templateUrl = "/html/common/LoginModal.html";
	    return directive;
	}); 

	app.directive('registermodal', function(){
		var directive = {};
	    directive.restrict = 'E'; /* restrict this directive to elements */
	    directive.templateUrl = "/html/common/RegisterModal.html";
	    return directive;
	}); 

	app.directive('mynav', function(){
		var directive = {};
	    directive.restrict = 'E'; /* restrict this directive to elements */
	    directive.templateUrl = "/html/common/Nav.html";
	    return directive;
	}); 
})