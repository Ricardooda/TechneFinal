var pessoaModule = angular.module('pessoaModule', []);

pessoaModule.controller("pessoaControl", function($scope, $http) {
	

	urlPessoa = 'http://localhost:8080/Techne/rs/pessoa';
	
	$scope.pesquisarPessoa = function() {
		$http.get(urlPessoa).success(function(pessoa) {
			$scope.pessoa = pessoa;
		}).error(function(erro) {
			alert(erro);
		});
	}

	

	$scope.salvar = function() {
		if ($scope.pessoa.codigo =="") {
			$http.post(urlPessoa.$scope.pessoa).success(function(pessoa) {
				$scope.pessoa.push($scope.pessoa);
				$scope.novo();
			}).error(function(erro) {
				alert(erro);
			});
		}else{
			$http.put(urlPessoa.$scope.pessoa).success(function(pessoa) {
				Scope.pesquisarPessoa();
				$scope.novo();
			}).error(function(erro) {
				alert(erro);
		});

	}	
	}

	$scope.excluir = function() {	
		if ($scope.pessoa.codigo == ""){
			alert("selecione um produto");
		}else{
			urlExcluir = urlPessoa+"/"+ $scope.pessoa.codigo;
			alert(urlExcluir);
			$http.delete(urlExclir).success(function(){
				Scope.pesquisarPessoa();
				$scope.novo();
			}).error(function (erro){
				alert(erro);
			});
	}
		
	}
	$scope.novo = function() {
		$scope.pessoa = "";
	}
	$scope.selecionaPessoa = function(pessoa) {
        $scope.pessoa = pessoa;
	}
	$scope.pesquisarPessoa();
});