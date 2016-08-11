var app = angular.module("MyApp", []);

app.controller("ChambreCtrl", function ($scope, $http) {

    $scope.chambres = [];
    $scope.valeur = null;

    $scope.charger = function () {
        $http.get("/chambres")
            .success(function (data) {
                $scope.chambres = data;
            });
    };
});