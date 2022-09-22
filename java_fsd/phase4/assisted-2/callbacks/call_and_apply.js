let o={
    carId:123,
    getId: function(){
        return this.carId;
    }
};
let newCar={carId: 456};
console.log(o.getId.call(newCar));
console.log(o.getId.apply(newCar,['ID: ']));