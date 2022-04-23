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
