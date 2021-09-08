/**
 * 
 */
 
 function fn1() {
	alert('fn1');
}


let fn2 = function() {
	alert("익명함수");
	fn1();
	
	
let d3 = document.getElementById("d3");
d3.onmouseenter=fn2;
}