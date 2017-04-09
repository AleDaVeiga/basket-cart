'use strict';

angular.module("vraptor").service("ShoppingCartService", ['$resource',
	function($resource) {
		return $resource("shoppingcart", {}, {});
	}
]);