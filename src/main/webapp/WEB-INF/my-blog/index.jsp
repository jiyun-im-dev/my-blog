<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>My Blog</title>
</head>
<body>
  <%@ include file="layout/header.jsp" %>
  <div class="container mt-3">
    <div class="card">
      <div class="card-body">
        <h4 class="card-title">포스트 제목</h4>
        <p class="card-text">포스트 내용</p>
        <button class="btn btn-secondary" type="button">상세보기</button>
      </div>
    </div>
  </div>
  <%@ include file="layout/footer.jsp" %>
</body>
</html>