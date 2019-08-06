<!DOCTYPE HTML>
<html>
<head>
    <title>My page</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css">
</head>
    <body>

        <header>
            <div class="container">
                <div> Test

                </div>
            </div>
       </header>
       <h2><span class="text-red"> My  first page </span> </h2>

        <form name="loginForm" method="post" action ="login" accept-charset="UTF-8">
            <div>
                <td><label size="25">Name:</label></td>
                <td><input type="text" name="login" size="25"><br /></td>
                <td><label size="25">Password: </label></td>
                <td><input type="password" name="pass" size="25"><br /></td>
                <button type="submit">Login</button>
            </div>
        </form>
        <form name="ll" method="get" action ="${pageContext.request.contextPath}/registration">
            <button type="submit">Registration</button>
        </form>

    </body>
</html>
