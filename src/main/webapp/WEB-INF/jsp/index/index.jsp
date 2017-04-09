<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Shopping cart</title>
        <!-- define a view port -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">

        <!-- adicionar CSS Boostratp -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body ng-app="vraptor">
        <div class="container">
            Carregando...
        </div>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Shopping</a>
                </div>
                <div class="container">
                    <ul class="nav navbar-nav">
                        <li><a ui-sref="products">Lista de produtos</a></li>
                        <li><a ui-sref="shoppingcart">Itens do carrinho</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <br /><br /><br />
        <div class="container" ui-view></div>

        <script type="text/javascript" src="resources/js/jquery-3.2.0.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.3/angular.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.18/angular-ui-router.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.3/angular-resource.min.js"></script>        
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <script type="text/javascript" src="resources/js/app.js"></script>
        <script type="text/javascript" src="resources/js/controllers/product.controller.js"></script>
        <script type="text/javascript" src="resources/js/controllers/product.service.js"></script>
        <script type="text/javascript" src="resources/js/controllers/shoppingcart.controller.js"></script>
        <script type="text/javascript" src="resources/js/controllers/shoppingcart.service.js"></script>
        <script type="text/javascript" src="resources/js/controllers/shoppingcartitem.service.js"></script>
    </body>
</html>