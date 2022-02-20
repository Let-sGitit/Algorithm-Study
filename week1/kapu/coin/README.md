## 1.개요

[https://www.acmicpc.net/problem/11047](https://www.acmicpc.net/problem/11047)

## 2.코드

```js
let n = 10;
let k = 4790;
let price = [1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000];

function coinchanger(n, k, price) {
  //가장큰 동전부터 비교 해서 최솟값을 알아내야함
  let index = n - 1; //가장큰수임 50000원의 인덱스는 9번
  let count = 0; // 답이될값
  while (k !== 0) {
    if (k < price[index]) index -= 1;
    else {
      k = k - price[index];
      count = count + 1;
    }
  }
  console.log(count);
}

coinchanger(n, k, price);
```

## 3.설명

문제에 첫 접근으로 사용가능한 동전 중 가장큰 동전보다 크냐,작냐를 먼저 비교 했다.
크다면 가장 큰동전만큼 빼고 Count 수를 1증가시킨다.
