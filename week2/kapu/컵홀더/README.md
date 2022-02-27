## 1.개요

[https://www.acmicpc.net/problem/2810]

## 2.코드

```js
let a = 9;
let b = "SLLLLSSLL";
/0 1 3 5 6 7 9
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

```

## 3.설명

이게 뭐라고 개빡쳣다 왜자꾸 안되는건지 다른 방법은 크게 생각나지않앗고 L을 만낫을때 카운트를 하나만 세는 동시에 i도 하나올리는것으로 해결햇다 다른 예제까지 더많앗으면 이코드가 될지는 모르겟지만
테스트 케이스를 통과하는 것이 목적이였기에 이런식으로 접근하여 풀수있었음
