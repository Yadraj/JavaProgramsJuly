let str = "javascript";
let count = {};

for (let ch of str) {
  if (count[ch]) {
    count[ch]++;
  } else {
    count[ch] = 1;
  }
}

console.log(count);

//===============//

let str2 = "hello";
let count2 = {};

for (let char of str2) {
  count2[char] = (count2[char] || 0) + 1;
}

console.log(count);
