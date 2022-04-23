## 1.개요

[https://www.acmicpc.net/problem/13305]

## 2.코드

```js
const input = [[4], [3, 3, 4], [1, 1, 1, 1]];

const [city, distance, oil] = input;
//현재 위치 포함 앞으로 가야할 수 3
//처음에서 2 만큼의 거리를 리터당 5 원에가야함
// 다음 도시에 도착 한다음 기름 가격이 전 도시보다 싸다면 여기서 다시 기름 을 넣습니다
// 그것 을 반복

function solv(distance, oil) {
  let answer = 0;
  let oilprice = oil[0];
  for (i = 0; i < distance.length; i++) {
    answer += oilprice * distance[i];
    if (oilprice > oil[i + 1]) oilprice = oil[i + 1];
  }
  console.log(answer);
}

solv(distance, oil);
```

## 3.설명

간단한 그리디 문제 첫 마을에서는 기름을 넣을 수 밖에 없기때문에 처음 기름을 다음 마을 거리만큼 넣어준뒤
그 뒤마을에서부턴 기름 가격을 계속 비교해서 싼 기름 으로 넣는것이다
