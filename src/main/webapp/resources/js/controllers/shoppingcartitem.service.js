'use strict';

angular.module("vraptor").service("ShoppingCartItemService", ['$resource',
	function($resource) {
		return $resource("shoppingcart/items/:id", {}, {});
	}
]);