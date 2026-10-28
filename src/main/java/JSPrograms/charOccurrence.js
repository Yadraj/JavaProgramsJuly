let str = "javascript";
let ch = 'a';
let count=0;

for(let i=0;i<str.length;i++){

    if(str[i]===ch){
        count++;
    }

}

console.log(`character '${ch}' occurs ${count} times`);