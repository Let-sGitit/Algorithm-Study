var fs = require("fs");
var input = fs.readFileSync("/dev/stdin").toString();

let changer = 1000 - input;
let money = [500, 100, 50, 10, 5, 1];

function coninChanger(changer, money) {
  let count = 0;
  while (changer !== 0) {
    if (changer < money[0]) money.shift();
    else {
      changer -= money[0];
      count++;
    }
  }
  console.log(count);
}

coninChanger(changer, money);
