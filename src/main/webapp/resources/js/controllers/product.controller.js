'use strict';

angular.module("vraptor").controller('ProductController', ['$scope', 'ProductService', 'ShoppingCartItemService',
	function ($scope, ProductService, ShoppingCartItemService) {
		$scope.products = ProductService.query();
		$scope.commerceItem = {};
        
        $scope.addItem = function(product) {
            $scope.commerceItem = { product : product, quantity : 1, amount : product.price };
            ShoppingCartItemService.save($scope.commerceItem);
        };
	}
]);