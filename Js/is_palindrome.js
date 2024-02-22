function isPalindrome(s){
    let rev_string = s.split('').reverse().join('');
    if(rev_string == s) return true
    else return false;
}
let str = 'racecar'
console.log(isPalindrome(str))