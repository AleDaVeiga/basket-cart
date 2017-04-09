'use strict';

angular.module("vraptor").controller('ShoppingCartController', ['$scope', 'ShoppingCartService', 'ShoppingCartItemService',
	function ($scope, ShoppingCartService, ShoppingCartItemService) {
		$scope.cart = ShoppingCartService.get();
        
        $scope.removerItemCarrinho = function(id){
        	ShoppingCartItemService.delete(id);
        };
	}
]);