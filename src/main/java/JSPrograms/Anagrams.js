function isAnagram(a, b) {
  let normalize = str =>
    str.toLowerCase().split("").sort().join("");

  return normalize(a) === normalize(b);
}

console.log(isAnagram("listen", "silent")); // true