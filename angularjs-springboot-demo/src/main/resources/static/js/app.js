var app = angular.module("myApp", ["ngRoute"]);

app.config(function($routeProvider){
    $routeProvider.
        when("/", {
            templateUrl:"/views/login.html",
            controller:"login"
        }).
        when("/search", {
            templateUrl:"/views/search.html"
        }).
        when("/home", {
            templateUrl:"/views/home.html"
        }).
        when("/signup", {
            templateUrl:"/views/SignUP.html",
            controller:"signup"
        })


});