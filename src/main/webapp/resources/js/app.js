'use strict';

var app = angular.module("vraptor", [ 'ngResource', 'ui.router' ]);

app.config([ '$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');

    $stateProvider.state('index', {
        url : '/',
        templateUrl : 'views/index.html',
        controller: 'ProductController'
    }).state('products', {
        url : '/products',
        templateUrl : 'views/products/list.html',
        controller: 'ProductController'
    }).state('shoppingcart', {
        url : '/shoppingcart/items',
        templateUrl : 'views/shoppingcart/list.html',
        controller: 'ShoppingCartController'
    });

} ]);