<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="author" content="Andrew Schwartz">

  <title>${name}</title>

  <!-- Bootstrap core CSS -->
  <link href="https://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="https://v4-alpha.getbootstrap.com/examples/album/album.css" rel="stylesheet">
</head>

<body>
  <div class="navbar navbar-inverse bg-inverse">
    <div class="container d-flex justify-content-between">
      <a href="#" class="navbar-brand">${handle}</a>
    </div>
  </div>

  <section class="jumbotron text-center">
    <div class="container">
      <h1 class="jumbotron-heading">${name}</h1>
      <p class="lead text-muted">${bio}</p>
      <p>
        <a href="${githuburl}" class="btn btn-primary">See me on Github</a>
        <a href="#" class="btn btn-secondary">Secondary action</a>
      </p>
    </div>
  </section>



  <div class="album text-muted">
    <h2 class="text-center">My Github Repositories:</h2>
    <div class="container">
      <div class="row">
        <#list reposList as repo>
          <div class="card">
            <h3>${repo.name}</h3>
            <p class="card-text"><#if repo.description?has_content>${repo.description}<#else>(no description provided)</#if></p>
          </div>
       </#list>
        <div class="card">
          <img src="https://placeholdit.imgix.net/~text?txtsize=28&txt=300%C3%97300&w=300&h=300" alt="Card image cap">
          <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
        </div>
      </div>
    </div>
  </div>
</body>
</html>