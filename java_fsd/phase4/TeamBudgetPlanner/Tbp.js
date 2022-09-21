// var pn=document.getElementById('pn');
// var pp=document.getElementById('pp');
// console.log(pp);
console.log("yes");

var cost=0;
 function myfunction(){
    var li1=document.getElementById('l1');
    var li2=document.getElementById('l2');
    var n=document.getElementById('pn').value;
    document.getElementById('pn').innerHTML = n;
    console.log(n);
    var x = document.createElement('li');
    x.appendChild(document.createTextNode(n));
    console.log(x);
    //var li1=document.getElementById('l1');
    li1.appendChild(x);


     var pp=document.getElementById('pp').value;
     document.getElementById('pp').innerHTML = pp;
     var x = document.createElement("li");
     x.appendChild(document.createTextNode(pp));
     
     li2.appendChild(x);

     var price=document.getElementById('pp').value;
        cost=cost+parseInt(price);
        document.getElementById('tprice').innerHTML=cost;
 }





//  console.log("yes");
//  var li1=document.getElementById('l1');
//  var li2=document.getElementById('l2');
//  var cost=0;
//   function myfunction(){
//      console.log("yes");
//      var name=document.getElementById('pn').value;
//      document.getElementById('pn').innerHTML = name;
//      var x = document.createElement('li');
//      x.appendChild(document.createTextNode(name));
//      li1.appendChild(x);
 
 
//       var pp=document.getElementById('pp').value;
//       document.getElementById('pp').innerHTML = price;
//       var x = document.createElement('li');
//       x.appendChild(document.createTextNode(price));
//       li2.appendChild(x);
 
//       var price=document.getElementById('pp').value;
//          cost=cost+parseInt(price);
//          document.getElementById('tprice').innerHTML=cost;
//   } 