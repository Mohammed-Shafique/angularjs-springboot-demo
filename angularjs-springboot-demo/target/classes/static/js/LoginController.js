var app = angular.module("myApp");

app.controller("login", function ($scope, $http, $location) {

        $scope.login = function () {

            var data = {
                fName: $scope.username,
                lName: $scope.password
            };


            $http.post('/login', data)
            .success(function (data) {
                if(data.loginStatus === true){
                    $location.path('/home');
                 }else{
                    $location.path('/');
                 }
                //$scope.PostDataResponse = data;
            })
            .error(function (data, status, header, config) {
            });
        };



    });

