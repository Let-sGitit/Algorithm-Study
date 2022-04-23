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

