angular.module('app', []);
angular.module('app')
    .controller('ValidatorController', function ($scope, $http) {
      var serverUrl = 'http://localhost:8081/rest/ssn/validation/';

      $scope.validate = function() {
        console.log("Validating ssn: " + $scope.ssn);

        $scope.serverError = false;
        $http.get(serverUrl + $scope.ssn).
            success(responseCallback).
            error(errorCallback);

        function errorCallback(data) {
          console.log("Error from server");
          $scope.serverError = true;
        }

        function responseCallback(data) {
          console.log("Server responses OK");
          $scope.submitted = true;
          $scope.validSsn = data.valid;
          $scope.country = data.country;
        }
      };
    });
