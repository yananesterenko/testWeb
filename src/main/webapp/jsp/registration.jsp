<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head >
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/style.css">

</head>
    <body>
       <h2> New User Registration </h2>

        <form name="registrationForm" method="post" action ="../registration" accept-charset="UTF-8">
            <div>
                <label size="25">First name:</label>
                <input type="text" name="firstName" size="25"><br />
                <label size="25">Second name:</label>
                <input type="text" name="secondName" size="25"><br />
                <label size="25">Name:</label>
                    <input type="text" name="login" size="25"><br />
                <label size="25">Password: </label>
                    <input type="password" name="pass" size="25"><br />
                <button type="submit">Add new user</button>

            </div>
        </form>
    </body>
</html>
