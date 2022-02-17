let input = 6; //require("fs").readFileSync("/dev/stdin");

let count = 0;

while (input > 0) {
  if (input % 5 === 0) {
    input = input - 5;
    count++;
  } else if (input % 3 === 0) {
    input = input - 3;
    count++;
  } else if (input > 5) {
    input = input - 5;
    count++;
  } else {
    count = -1;
    break;
  }
}
console.log(count);
