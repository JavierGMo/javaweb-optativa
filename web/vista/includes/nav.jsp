<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="/HolaChido/index.jsp">
        <img src="/docs/4.4/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
        Car-Ito
    </a>
    <form class="form-inline">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    <div class="collapse navbar-collapse ml-3" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link text-light" href="#">Inicio</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-light" href="#">Ayuda</a>
          </li>
          <li class="nav-item">
            <div class="dropdown ml-3">
                <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-cart-plus text-light mr-2"></i>
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="#">
                        <div class="d-flex flex-row">
                            <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                            <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                        </div>
                    </a>
                    <a class="dropdown-item" href="#">
                        <div class="d-flex flex-row">
                            <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                            <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                        </div>
                    </a>
                    <a class="dropdown-item" href="#">
                        <div class="d-flex flex-row">
                            <img src="/HolaChido/vista/images/productos/producto.jpg" class="w-25 h-25" />
                            <p class="ml-2"><span id="titulo-producto-cesta">Dron elite</span></p>
                        </div>
                    </a>
                </div>
            </div>
          </li>
          <li class="nav-item">
            <div class="dropdown ml-3">
                <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle text-light mr-1"></i>Sesion
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/login">Iniciar sesion</a>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/registro">Registro</a>
                  <a class="dropdown-item" href="#">Cerrar sesion</a>
                </div>
            </div>
          </li>
        </ul>
    </div>
</nav>
