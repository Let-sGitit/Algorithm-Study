const input1 = 11;

const input2 = [
  [1, 4],
  [3, 5],
  [0, 6],
  [5, 7],
  [3, 8],
  [5, 9],
  [6, 10],
  [8, 11],
  [8, 12],
  [2, 13],
  [12, 14],
];

//회의의수 11개 중에서 가장 많이 들어갈수있는 회의의 개수 를 구하는것
// 생각 1
//  첫회의가 끝나는 시간 보다 큰수를 모아 놓고 그중에서 가장작은수, 끝나는 시간이 가장 빠른 것으로 로 시작 하는 것
function solv(input1, input2) {
  let answer = 1; // [1,4] 가 제일 좋아보임 그렇기떄문에 1을 줌
  let Box = input2[0][1];
  for (i = 0; i < input1; i++) {
    if (Box <= input2[i][0]) {
      Box = input2[i][1];
      answer += 1;
    }
  }
  console.log(answer);
}
solv(input1, input2);
