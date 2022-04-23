## 1.개요

[https://www.acmicpc.net/problem/1946]

## 2.코드

```js
let a = [
  [3, 2],
  [1, 4],
  [4, 1],
  [2, 3],
  [5, 5],
];

function solv(input) {
  let arr = input;
  arr.sort(function (a, b) {
    return a[0] - b[0];
  });
  console.log(arr);

  let user = arr[0][1];
  let cnt = 1;

  for (i = 1; i < arr.length; i++) {
    if (user > arr[i][1]) {
      user = arr[i][1];
      cnt += 1;
    }
  }
  console.log(cnt);
}

solv(a);
```

## 3.설명

먼저 성적순으로 나열 해주엇고 그다음 면접 순위를 비교해서 등수가 높다면 다시 다른 등수를 기준으로 잡고 그에 부합하지않는다면 뽑지 않는것으로 구현햇다
