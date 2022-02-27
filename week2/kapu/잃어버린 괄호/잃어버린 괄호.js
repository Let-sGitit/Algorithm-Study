let input = "10+20+30+40"; // 더하기를 먼저 하면 되지않나?
function sol(input) {
  const number = input.split("-").map((str) =>
    str
      .split("+")
      .map(Number)
      .reduce((x, z) => x + z, 0)
  );

  let result = number[0] * 2 - number.reduce((z, x) => z + x, 0); //  reduce 먼저 55+90 이 되면 145 가됨  거기서 이미 55란 숫자를 한번 더햇기때문에 *2 110 - 145가되는것임

  return result;
}

require("readline")
  .createInterface(process.stdin, process.stdout)
  .on("line", (line) => {
    console.log(sol(line));
  })
  .on("close", () => {
    process.exit();
  });
