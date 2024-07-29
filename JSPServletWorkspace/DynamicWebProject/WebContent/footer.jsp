<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .footer {
            background-color: #f8f9fa;
            padding: 20px 0;
            position: absolute;
            bottom: 0;
            width: 100%;
        }
        .footer a {
            color: #6c757d;
        }
        .footer a:hover {
            color: #343a40;
            text-decoration: none;
        }
        .content-wrap {
            min-height: 100vh;
            position: relative;
            padding-bottom: 60px; /* Height of the footer */
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    <div class="content-wrap">
        <!-- Your page content here -->

        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <h5>About Us</h5>
                        <p>Information about the company.</p>
                    </div>
                    <div class="col-md-4">
                        <h5>Quick Links</h5>
                        <ul class="list-unstyled">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Features</a></li>
                            <li><a href="#">Pricing</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <h5>Contact Us</h5>
                        <address>
                            <strong>My Company, Inc.</strong><br>
                            1234 Main St.<br>
                            Anytown, USA<br>
                            <abbr title="Phone">P:</abbr> (123) 456-7890
                        </address>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 text-center">
                        <p class="text-muted">&copy; 2024 My Company, Inc. All rights reserved.</p>
                    </div>
                </div>
            </div>
        </footer>
    </div>
</body>
</html>
