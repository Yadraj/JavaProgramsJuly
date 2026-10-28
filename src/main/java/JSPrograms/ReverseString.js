let str = "java";
let rev = "";
for (let i = str.length - 1; i >= 0; i--) {
  rev = rev + str.charAt(i);
}
console.log(rev);

//============//

let str2 = "hello";
let reversed = "";

for (let i = str2.length - 1; i >= 0; i--) {
  reversed += str2[i];
}

console.log(reversed); // olleh
