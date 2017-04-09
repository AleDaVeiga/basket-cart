'use strict';

angular.module("vraptor").service("ProductService", ['$resource',
	function($resource) {
		return $resource("products", {}, {});
	}
]);