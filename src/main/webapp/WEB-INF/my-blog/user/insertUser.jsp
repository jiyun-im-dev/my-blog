<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>My Blog: 회원가입</title>
</head>
<body>
  <%@ include file="../layout/header.jsp" %>
  <div class="container mt-3">
    <form action="/action_page.php">
      <div class="mb-3 mt-3">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
      <div class="mb-3 mt-3">
        <label for="username">Username: </label>
        <input type="text" class="form-control" id="username" placeholder="Enter username" name="username">
      </div>
      <div class="mb-3">
        <label for="pwd">Password: </label>
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
      <button type="submit" class="btn btn-primary">회원가입</button>
    </form>
  </div>
<%@ include file="../layout/footer.jsp" %>