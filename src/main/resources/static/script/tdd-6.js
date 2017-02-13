var url = "http://localhost:8080";

var app = angular.module('TDD-6', ['ngResource']);

app.factory("tdd", function($resource) {
  return $resource(url);
});

app.controller('TDD6Controller', function($scope, tdd) {
  tdd.get(function(data) {
         $scope.result = data;
  });
});