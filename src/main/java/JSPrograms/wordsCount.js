let str = "I am Human";
let words = str.trim().split(/\s+/);
console.log(str.trim()?words.length:0);
