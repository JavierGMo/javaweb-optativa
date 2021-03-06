<%-- 
    Document   : login
    Created on : 17/04/2020, 02:09:41 PM
    Author     : Javier GMO
--%>

<!--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>-->
        <%@include file="../includes/nav.jsp" %><!--Include del navbar-->
        <div class="d-flex justify-content-center m-5">
            <form method="post" action="${pageContext.request.contextPath}/login" class="mb-5">
                <div class="form-group mt-4 mb-4">
                  <label for="correo-login">Correo</label>
                  <input type="email" class="form-control" id="correo-login" name="correo-login" aria-describedby="emailHelp" placeholder="Correo">
                </div>
                <div class="form-group mt-4 mb-4">
                  <label for="password-login">Contraseņa</label>
                  <input type="password" class="form-control" id="password-login" name="password-login" placeholder="Contraseņa">
                </div>
                <button type="submit" class="btn btn-primary mt-3 mb-3 form-control">Iniciar sesion</button>
            </form>
        </div>
        <!--Scripts-->
        <%@include file="../includes/footer.jsp" %><!--Include del footer-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <!--<script src="../js/loginjquery.js"></script>-->
    </body>
</html>