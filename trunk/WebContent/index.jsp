<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Music Me</title>
</head>
<body>
<h1>SingWithMe</h1>

	<form id="search-song-frm"><label>What song are you looking for?</label>
		<fieldset>
			<input type="text" name="keyword" id="keyword" value="Type Keyword Here" onBlur="if(this.value=='') this.value='Type Keyword Here'" onFocus="if(this.value =='Type Keyword Here' ) this.value=''" /> 
			<button>Search</button>
		</fieldset>	
	</form>

</body>
</html>
