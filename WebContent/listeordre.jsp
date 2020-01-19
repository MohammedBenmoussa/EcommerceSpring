<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Pixel</title>
	<meta charset="utf-8" >
	
		<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
		<link rel="stylesheet" href="css/bootstrap.min.css">
	<style type="text/css">
	body
{
		margin: 0;
	padding: 0;

}
.tete
{
	background-color: #000;

}
.taille{
	width:800px;

	margin-left:200px;
	padding-top: 15px;

}
.rech
{
cursor:pointer;
margin-left:-25px;
width:36px;
height:33px;
background-color: transparent;
border:none;
border-left:1px solid black;
padding-left:5px;
 
}

header {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	background-color: black;
	
}

li,a,button{
	font-family: 'Montserrat' , sans-serif;
	font-weight: 500;
	font-size: 16px;
	color: #edf0f1;
	text-decoration: none;
}
header{
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 7px 0%;
}
.logo{
	cursor: pointer;
	margin-left: 40px;
	margin-top: -115px;
	
}
.nav_links{
	list-style: none;
}
.nav_links li ul{
	display: block;

	list-style: none;
}
.nav_links li{
	float: left;
	padding: 0px 20px;
	padding-bottom: 25px;

}
.nav_link li a{
	 display:block;
 width:100px;
 color:white;
 text-decoration:none;
 padding:0px;
	transition: all 0.3s ease 0s;
}
.nav_link li a:hover{
	color: #0088a9;

}
button{
	padding: 9px 25px;
	background-color: rgba(0,136,169,1);
	border:none;
	border-radius: 50px;
	cursor: pointer;
	transition: all 0.3s ease 0s;
}
button:hover{
	background-color: rgba(0,136,169,0.8);
}
.linav:hover{
	color: rgba(0,136,169,1); 	
}
.shopicon{

margin-right: 80px;

}

.shop:hover{
	color: #FF8F8F;
}
.lisea{
	margin-left: 0px;
}

.search{

	background-color: #fff;
	padding-left: 10px;
	border-radius:10px;
	font-size: 16px;
	width: 700px;
	height: 25px;
	color: black;	
	
	
}
.search-form input::placehoder{
color: #000;

}
#ss{
	cursor: pointer;
	margin-left: -32px;
}


.nav_links li ul {
 display:none;
 transition: 2s;
 }

  .nav_links  li:hover ul {

display: flex;
margin-left: -20px;
padding-left: 0px;

 }
 .sub-menu{
 		color: black;
 	margin-bottom: -17px;

 	
 }
 .sub-menu a:hover{
 	color: red;
 }
 .sub{

 	background-color: black;
 	position: absolute;
 	padding-top:20px; 
 	margin-top: -20px;

 }
 

/*Fin Menu*/
.slider-holder
        {
            width: 800px;
            height: 400px;
            background-color: yellow;
            margin-left: auto;
            margin-right: auto;
            margin-top: 0px;
            text-align: center;
            overflow: hidden;
        }
       section{
       	margin-top: 0px;

       }
              @import url(https://fonts.googleapis.com/css?family=Varela+Round);

html, body { background: #fff  }

.slides {
    padding: 0;
    width: 100%;
    height: 550px;;
    display: block;
    margin: 0 auto;
    position: relative;
}

.slides * {
    user-select: none;
    -ms-user-select: none;
    -moz-user-select: none;
    -khtml-user-select: none;
    -webkit-user-select: none;
    -webkit-touch-callout: none;
}

.slides input { display: none; }

.slide-container { display: block; }

.slide {
    top: 0;
    opacity: 0;
    width: 100%;
    height: 550px;
    display: block;
    position: absolute;

    transform: scale(0);

    transition: all .7s ease-in-out;
}

.slide img {
    width: 100%;
    height: 100%;
}

.nav label {
    width: 100px;
    height: 100%;
    display: none;
    position: absolute;

	  opacity: 0;
    z-index: 9;
    cursor: pointer;

    transition: opacity .2s;

    color: #FFF;
    font-size: 156pt;
    text-align: center;
    line-height: 380px;
    font-family: "Varela Round", sans-serif;
    background-color: rgba(255, 255, 255, .3);
    text-shadow: 0px 0px 15px rgb(119, 119, 119);
}

.slide:hover + .nav label { opacity: 0.5; }

.nav label:hover { opacity: 1; }

.nav .next { right: 0; }

input:checked + .slide-container  .slide {
    opacity: 1;

    transform: scale(1);

    transition: opacity 1s ease-in-out;
}

input:checked + .slide-container .nav label { display: block; }

.nav-dots {
	width: 100%;
	bottom: 9px;
	height: 11px;
	display: block;
	position: absolute;
	text-align: center;
}

.nav-dots .nav-dot {
	top: -5px;
	width: 11px;
	height: 11px;
	margin: 0 4px;
	position: relative;
	border-radius: 100%;
	display: inline-block;
	background-color: rgba(0, 0, 0, 0.6);
}

.nav-dots .nav-dot:hover {
	cursor: pointer;
	background-color: rgba(0, 0, 0, 0.8);
}

input#img-1:checked ~ .nav-dots label#img-dot-1,
input#img-2:checked ~ .nav-dots label#img-dot-2,
input#img-3:checked ~ .nav-dots label#img-dot-3,
input#img-4:checked ~ .nav-dots label#img-dot-4,
input#img-5:checked ~ .nav-dots label#img-dot-5,
input#img-6:checked ~ .nav-dots label#img-dot-6 {
	background: rgba(0, 0, 0, 0.8);
}
.footer-distributed{
	background-color: #000;
	box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);
	box-sizing: border-box;
	width: 100%;
	text-align: left;
	font: bold 16px sans-serif;

	padding: 55px 50px;
	margin-top:100px;
}

.footer-distributed .footer-left,
.footer-distributed .footer-center,
.footer-distributed .footer-right{
	display: inline-block;
	vertical-align: top;
}

/* Footer left */

.footer-distributed .footer-left{
	width: 40%;
}

/* The company logo */

.footer-distributed h3{
	color:  #ffffff;
	font: normal 36px 'Cookie', cursive;
	margin: 0;
}

.footer-distributed h3 span{
	color:  #5383d3;
}

/* Footer links */

.footer-distributed .footer-links{
	color:  #ffffff;
	margin: 20px 0 12px;
	padding: 0;
}

.footer-distributed .footer-links a{
	display:inline-block;
	line-height: 1.8;
	text-decoration: none;
	color:  inherit;
}

.footer-distributed .footer-company-name{
	color:  #8f9296;
	font-size: 14px;
	font-weight: normal;
	margin: 0;
}

/* Footer Center */

.footer-distributed .footer-center{
	width: 35%;
}

.footer-distributed .footer-center i{
	background-color:  #33383b;
	color: #ffffff;
	font-size: 25px;
	width: 38px;
	height: 38px;
	border-radius: 50%;
	text-align: center;
	line-height: 42px;
	margin: 10px 15px;
	vertical-align: middle;
}

.footer-distributed .footer-center i.fa-envelope{
	font-size: 17px;
	line-height: 38px;
}

.footer-distributed .footer-center p{
	display: inline-block;
	color: #ffffff;
	vertical-align: middle;
	margin:0;
}

.footer-distributed .footer-center p span{
	display:block;
	font-weight: normal;
	font-size:14px;
	line-height:2;
}
.tdinf{
color:black;
}
 
table.design {
		font-family: verdana, arial, sans-serif;
		font-size: 11px;
		color: #333333;
		border-width: 1px;
		border-color: #3A3A3A;
		border-collapse: collapse;
		width:70%;
		margin:auto;
	}

	table.design th {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #517994;
		background-color: #B2CFD8;
	}
 
	table.design tr:hover td {
		background-color: #DFEBF1;
	}
	.lab{
font-size:20px;
font-family:'Tahoma';

}
.inp{
border-radius:5px;
}
.tableau{
	margin: auto;
}
 
	table.design td {
		border-width: 1px;
		padding: 8px;
		border-style: solid;
		border-color: #517994;
		background-color: #ffffff;
	}
	table.design caption
	{
	font-size:20pt;
	font-family:'comic sans ms';
	}

/* Footer Right */

.footer-distributed .footer-right{
	width: 20%;
}

.footer-distributed .footer-company-about{
	line-height: 20px;
	color:  #92999f;
	font-size: 13px;
	font-weight: normal;
	margin: 0;
}

.footer-distributed .footer-company-about span{
	display: block;
	color:  #ffffff;
	font-size: 14px;
	font-weight: bold;
	margin-bottom: 20px;
}

.footer-distributed .footer-icons{
	margin-top: 25px;
}

.footer-distributed .footer-icons a{
	display: inline-block;
	width: 35px;
	height: 35px;
	cursor: pointer;
	background-color:  #33383b;
	border-radius: 2px;

	font-size: 20px;
	color: #ffffff;
	text-align: center;
	line-height: 35px;

	margin-right: 3px;
	margin-bottom: 5px;
}

.logo a {
margin-top:-60px;
}
/* If you don't want the footer to be responsive, remove these media queries */

@media (max-width: 880px) {

	.footer-distributed{
		font: bold 14px sans-serif;
	}

	.footer-distributed .footer-left,
	.footer-distributed .footer-center,
	.footer-distributed .footer-right{
		display: block;
		width: 100%;
		margin-bottom: 40px;
		text-align: center;
	}

	.footer-distributed .footer-center i{
		margin-left: 0;
	}

}
 a .ss{
 color:black;}
 
 /*Flex grid*/
 .cards {
    display: flex;
    flex-wrap: wrap;
    align-items: stretch;
  }
  .card {
    flex: 0 0 200px;
    margin: 10px;
    border: 1px solid #ccc;
    box-shadow: 2px 2px 6px 0px  rgba(0,0,0,0.3);
  } 
 .picture{
 width:100px;
 height:100px;
 }
 
 
 
	</style>
</head>
<body>
	<div class="tete">

		<div class="taille">
		<form action="search.aspx" method="post">
		<input placeholder="Comment pouvons-nous vous aider ?" class="search" type="text" name="search">
		
<span id="ss"><i class="fa fa-search"></i></span>
<input type="submit"  value="" class="rech">
</form>
	</div>
</div>
	<header>
<img  class="logo" src="https://fontmeme.com/permalink/190712/eb30e27ba1819e5e7730309214656ec4.png" alt="pixel-fonts" border="0">
		<nav>
			<ul class="nav_links">
				
				<sw:if test="${empty sessionScope.admin }">
				<li ><a href="index.aspx" class="linav">Acceuil</a></li>
				</sw:if>
				<sw:if test="${!empty sessionScope.admin }">
				<li ><a href="profil.aspx" class="linav">Profil</a></li>
				</sw:if>
				
				<sw:if test="${!empty sessionScope.admin }">
				<li ><a href="#" class="linav">Operation</a>
				
						<ul class="sub">
      <li class="sub-menu"><a   href="categorie.aspx">Categorie</a></li>
      <li class="sub-menu"><a   href="produit.aspx">Produit</a></li>
      <li class="sub-menu"><a   href="client.aspx">Client</a></li>
       <li class="sub-menu"><a   href="#">Ordre</a></li>
    	</ul>
				</li>
				</sw:if>
				<li ><a href="#" class="linav">Categorie</a>

		<ul class="sub">
      <sw:forEach items="${listCat}" var="u" >
	      <li class="sub-menu"><a href="#"> ${u.nom_cat }</a></li>
	      </sw:forEach>
	    </ul>

				</li>
				

				<sw:if test="${empty sessionScope.email }">
				<li ><a href="connexion.aspx" class="linav">Identifiez-vous</a></li>
				</sw:if>
				<sw:if test="${!empty sessionScope.email}">
				<li ><a href="deconnexion.aspx" class="linav">Se déconnecter</a></li>
				</sw:if>
			</ul>

		</nav>
 <a href="#" class="ct"><button>Contactez-nous</button></a>
		<div class="shopicon"><a href="#" class="shop"><i class="fa fa-shopping-basket"></i></a></div>
	</header>

<table class="design" width="70%" border="1" cellpadding="0" cellspacing="0">
<br/><br/><br/>
<h1 style="text-align: center">Liste des ordres </h1>
<tr>
	<th>Id ordre </th>
	<th>ID client </th>
	<th>Date ordre</th>
	<th>statuts</th>
	<th>operation</th>
</tr>

		<sw:forEach items="${sessionScope.listeordre}" var="u" >
			<tr>
			
				<td>${u.id_ord }</td>
				<td>${u.id_client_ord }</td>
				<td>${u.date_ord }</td>		
				<td>${u.status_ord }</td>			
				<td><a class="btn btn-info" href="listedetailordre.aspx?ido=${u.id_ord }">detail</a></td>
				
			</tr>
		</sw:forEach>

</table>
<footer class="footer-distributed">

			<div class="footer-left">

				<a ><img src="https://fontmeme.com/permalink/190713/ab357759710ddfcad63eb6856c3a0bd7.png" alt="pixel-fonts" border="0"></a>

				<p class="footer-links">
					<a href="#">Acceuil</a>
					<br/>
					<a href="#">Faq</a>
					<br/>
					<a href="#">Contact</a>
				</p>
				<br/>
					
				<p class="footer-company-name">PIXEL &copy; 2019</p>
			</div>

			<div class="footer-center">

				<div>
					<i class="fa fa-map-marker"></i>
					<p><span>Marche Couvert</span> Oujda, Maroc</p>
				</div>

				<div>
					<i class="fa fa-phone"></i>
					<p>+212 6 32 63 62 26</p>
				</div>

				<div>
					<i class="fa fa-envelope"></i>
					<p><a href="mailto:bnmsmohammed@gmail.com">bnmsmohammed@gmail.com</a></p>
				</div>

			</div>

			<div class="footer-right">

				<p class="footer-company-about">
					<span>À propos de nous </span>
					La boutique propose à ses clients une sélection de produits innovants et astucieux ses 3 univers (Image et son, Multimédia)
				</p>

				<div class="footer-icons">

					<a href="#"><i class="fa fa-facebook"></i></a>
					<a href="#"><i class="fa fa-twitter"></i></a>
					<a href="#"><i class="fa fa-linkedin"></i></a>
					<a href="#"><i class="fa fa-github"></i></a>

				</div>

			</div>

		</footer>

</body>
</html>