function isPalindrome(s){
    let rev_string = s.split('').reverse().join('');
    if(rev_string == s) return true
    else return false;
}
let str = 'racecar'
console.log(isPalindrome(str))

// second without using built in 

function isPalindromewihout(){
    for (let i = 0; i < Math.floor(s.length / 2); i++) {
        if (s[i] !== s[s.length - 1 - i]) {
            return false;
        }
    }
    return true;
}

console.log(isPalindromewihout(str))