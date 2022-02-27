## 1.개요

[https://www.acmicpc.net/problem/1541]

## 2.코드

```js
let input = "55-50+40"; // 더하기를 먼저 하면 되지않나?
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
```

## 3.설명

1.받은 인풋값중 - 를 먼저 제거하여 +먼저 시도[[55],[90]] 이상태를 만들어주엇음 그리고 나서 이값을 reduce를 통해 서로 더해주게 되면 145가 되어 버림 거기서 55\*2 해서 110-145 로 답을 도출하엿음
