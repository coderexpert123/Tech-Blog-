
# Tech Blog

A Technical blog is a discussion or informational website published on the World Wide Web consisting of Different differnt programming informal diary-style text entries. Posts are typically displayed in  code and the card fromat .


## Portfelio

This project is used as show the skills in:

- Product Based Company .
- Service based Comopany .



## Appendix

Any additional information goes here


## Authors

- [@Nishant Singh ](https://github.com/nishu9162306344)


## Tech Stack

**Frontend:** Html, Css, Bootstrap , JSP ,Javascript , jQuery ,Ajax

**Backend:**  Java , Servlet , JDBC

**Build Tool:**  Ant 

**Database:**   MySql

**Code version:** Git


## Support

For support, email nishantsingh2jan1998@gmail.com 

## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
|  Success| #00FF00
| Danger|  #FF0000

## Contributing

Contributions are always welcome!

make a pull request 

Please adhere to this project's `code of conduct`.


## Badges

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## Documentation

[Documentation | Code Review ](https://github.com/nishu9162306344/Tech-Blog-.git)


## Feedback

If you have any feedback, please reach out to us at nishantsingh2jan1998@gmail.com


## web.xml

To deploy this project run

```bash
 <?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.1" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd">
    <servlet>
        <servlet-name>SignupServlet</servlet-name>
        <servlet-class>com.tech.blog.servlets.SignupServlet</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>LoginServlet</servlet-name>
        <servlet-class>com.tech.blog.servlets.LoginServlet</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>Logout</servlet-name>
        <servlet-class>com.tech.blog.servlets.Logout</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>EditServlet</servlet-name>
        <servlet-class>com.tech.blog.servlets.EditServlet</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>ContactUs</servlet-name>
        <servlet-class>com.tech.blog.servlets.ContactUs</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>AboutsUs</servlet-name>
        <servlet-class>com.tech.blog.servlets.AboutsUs</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>AddPostServlet</servlet-name>
        <servlet-class>com.tech.blog.servlets.AddPostServlet</servlet-class>
    </servlet>
    <servlet>
        <servlet-name>LikeServlet</servlet-name>
        <servlet-class>com.tech.blog.servlets.LikeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>SignupServlet</servlet-name>
        <url-pattern>/SignupServlet</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>LoginServlet</servlet-name>
        <url-pattern>/LoginServlet</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>Logout</servlet-name>
        <url-pattern>/Logout</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>EditServlet</servlet-name>
        <url-pattern>/EditServlet</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>ContactUs</servlet-name>
        <url-pattern>/ContactUs</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>AboutsUs</servlet-name>
        <url-pattern>/AboutsUs</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>AddPostServlet</servlet-name>
        <url-pattern>/AddPostServlet</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>LikeServlet</servlet-name>
        <url-pattern>/LikeServlet</url-pattern>
    </servlet-mapping>
    <session-config>
        <session-timeout>
            30
        </session-timeout>
    </session-config>
</web-app>

```


## Run Locally

Clone the project

```bash
  git clone https://github.com/nishu9162306344/Tech-Blog-
```

Fire the URL

```bash
  http://localhost:8080/TechBlog/
```

 

## Related

Here are some related projects

[Github](https://github.com/nishu9162306344/Full-User-Management-System)

