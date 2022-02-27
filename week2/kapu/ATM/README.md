## 1.개요

[https://www.acmicpc.net/problem/11399]

## 2.코드

```js
let c = 5;
let arr2 = [3, 1, 4, 3, 2]; // [1,2,3,3,4]

let result = 0;
let count = 0;
arr2.sort(function (f, s) {
  return f - s;
});
if (c === 1) {
  console.log(arr2[0]);
}
arr2.sort((a, b) => a - b);
for (let i in arr2) {
  count += result + arr2[i]; //count  = 1,4,10,19,32 ,result = 1,3,6,9,13
  result += arr2[i];
}
console.log(count);
```

## 3.설명

백준 짜증난다... 인풋값 바꾸어주는 거 솔직히 아직도 잘못하겟음 일단 이해하는데 쉽지가 않았음 처음에는 뭔소리지하다가
보다보니 앞에서 더한 시간을 계속 저장 하고있어야 한다는걸 깨달앗고 시간순으로 sort함
그후 for in 문으로 count 라는 값안에 저장용 공간인 result와 배열 순서대로 계속 더함

- count = 1,4,10,19,32 ,result = 1,3,6,9,13 이런식으로 계속 더함
