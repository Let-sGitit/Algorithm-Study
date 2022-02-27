## 1.개요

[https://www.acmicpc.net/problem/5585]

## 2.코드

```js
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
```

## 3.설명

전에 풀엇던 코인문제와 다를것없이 가장좋은수인 큰수부터 비교해가며 문제에 접근햇고 배열의 첫번째 를 지우는 .shift()를 사용하여 풀엇습니다 다른점이라곤 배열의 순서 뿐 어려운것이 없엇던 문제.
