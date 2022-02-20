## 1.개요

[https://www.acmicpc.net/problem/2839]

## 2.코드

```js
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
```

## 3.설명

3킬로 설탕 봉지와 5킬로 설탕봉지를 최소로 사용하여 그값을 구하는 문제
코드에 짜여진 순서대로 5로 나누어 진다면 가장 좋은 상황이도
그렇지 않을때 다시한번 3으로 나눈다. 나누기가 불가한 상황에서 5보다 크다면 5를 빼주엇다.
