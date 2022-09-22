// //IIFE----.Immediately Invoked Function Expression
// (function(){
//     console.log('in function');
// })();

let app=(function(){
    let carId=123;
    console.log('in function');
    return {};
})();
console.log(app);