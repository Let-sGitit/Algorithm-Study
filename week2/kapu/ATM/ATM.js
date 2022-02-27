let c = 5;
let arr2 = [3, 1, 4, 3, 2]; // [1,2,3,3,4]

//만약 1번 보다 뒤에가 작다면 result 값으로 모두 더해 놓는다 그리고 그다음부터 시작할려면 shift 를써서 맨앞 을 없애 버리면 되는가? 아니다 솔트를 쓰자
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
