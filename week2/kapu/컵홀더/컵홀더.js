let a = 9;
let b = "SLLLLSSLL";

let count = 1;
for (let i = 0; i < a; i++) {
  if (b[i] === "S") {
    count += 1;
  } else if (b[i] === "L") {
    count += 1;
    i++;
  }
}

console.log(count > a ? a : count);
