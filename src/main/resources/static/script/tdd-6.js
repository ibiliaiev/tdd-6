var url = "http://localhost:8080";

var app = angular.module('TDD-6', []);


app.controller('TDD6Controller', function($scope, $http) {

  $scope.click = function() {
          var response = $http.get(url + "?startDate=" + $scope.startDate
           + "&endDate=" + $scope.endDate);

          response.success(function(data, status, headers, config) {
              $scope.result = data;
          });

          response.error(function(data, status, headers, config) {
              alert("Ca not call API for some reason, please debug :)");
          });

      };

  $scope.init = function () {
    $scope.result = {count: -1};
    $('input[id="daterange"]').daterangepicker();
    $('#daterange').on('apply.daterangepicker', function(ev, picker) {
        $scope.startDate = picker.startDate.format('YYYY-MM-DD');
        $scope.endDate = picker.endDate.format('YYYY-MM-DD');
    });
    $scope.startDate = "2017-01-01";
    $scope.endDate = "2018-01-01";
    $('#daterange').data('daterangepicker').setStartDate('01/01/2017');
    $('#daterange').data('daterangepicker').setEndDate('01/01/2018');
  };

});