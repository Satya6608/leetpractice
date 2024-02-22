// using revese a string 
function revString(s){
    let rev = s.split('').reverse().join('');
   return rev;
}
let st = 'racecar'
console.log(revString(st));

// reverse giveing number 

function reverseNumber(n){
    let reverse = 0;
    while(n > 0){
        reverse = (reverse * 10) + (n%10);
        n = Math.floor(n/10);
        // n = parseInt(n/10);
    }
    return reverse
}
var n = 12345678909
console.log(reverseNumber(n))