define(["controllers"], function(controllers) {
	controllers.controller('indexController', function($scope) {
		$scope.aaa="yes!!!";
		//$scope.lists = [1,2,3,4,5,6,7,8,9];
		$scope.lists = [1,2,3];
		$scope.test = function(){
			$scope.lists = [1,2,3];
		}
	});
});