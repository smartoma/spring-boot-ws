angular.module('app', []);
angular.module('app')
    .controller('ValidatorController', function ($scope, $http) {
      var serverUrl = 'http://localhost:8081/rest/ssn/validation/';

      $scope.validate = function() {
        $scope.serverError = false;

        console.log("Validating ssn: " + $scope.ssn);

        $http.get(serverUrl + $scope.ssn).
            success(handleOK).
            error(handleError);

        function handleError(data) {
          console.log("Error from server");
          $scope.serverError = true;
        }

        function handleOK(data) {
          console.log("Server responses OK");
          $scope.valid = data.valid;
          $scope.country = data.country;
        }
      };
    });
