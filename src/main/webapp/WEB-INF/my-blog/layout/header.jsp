<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
<script src="/webjars/bootstrap/5.3.2/js/bootstrap.bundle.min.js"></script>
<script src="/webjars/jquery/3.7.1/jquery.min.js"></script>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Main</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link" href="/auth/login">로그인</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/auth/insertUser">회원가입</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="text" placeholder="Search">
        <button class="btn btn-primary" type="button">Search</button>
      </form>
    </div>
  </div>
</nav>