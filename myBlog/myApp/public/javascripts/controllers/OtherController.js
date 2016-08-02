define(["controllers"], function(controllers){
	controllers.controller("otherController", function(TipService){
		TipService.showTip("只是很想你")
	})
});