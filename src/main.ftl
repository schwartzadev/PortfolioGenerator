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
  <!-- Font Awesome -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <!-- Custom CSS -->
  <link href="src/styles.css" rel="stylesheet">
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
      <p class="lead text-muted"><i class="fa fa-compass" aria-hidden="true"></i>  ${location}</p>
      <p>
        <a href="${githuburl}" class="btn btn-primary"><i class="fa fa-github" aria-hidden="true"></i>  See me on Github</a>
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
            <p class="language"><#if repo.language?has_content><i class="fa fa-code" aria-hidden="true"></i>  ${repo.language}<#else></#if></p>
            <a href="${repo.html_url}"><h3>${repo.name}</h3></a>
            <p class="card-text"><#if repo.description?has_content>${repo.description}<#else>(no description provided)</#if></p>
          </div>
       </#list>
      </div>
    </div>
  </div>
</body>
</html>