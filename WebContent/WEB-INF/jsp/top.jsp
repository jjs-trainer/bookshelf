<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" media="all" />
<title>書籍検索画面</title>
</head>
<body>
  <center>
  <h1>書籍検索</h1>
  <form method="post" action="BookSearchServlet" class="form-inline">
    <input type="text" name="title" placeholder="検索したい本のタイトルを入力してください" size="60" class="form-control" />
    <button type="submit" class="btn btn-default">検索</button>
  </form>
  </center>
</body>
</html>