<?php

	$mensaje=$_GET['mensaje'];
	echo $mensaje;
	if($mensaje==""){
		echo "No se ha recibido el mensaje...";
	}
	
?>
