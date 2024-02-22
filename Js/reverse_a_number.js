var num = String(12345);
var new_num = num.split('').reverse();
/* console.log(new_num); */

var rev_num = '';
rev_num = new_num.join('')
console.log(+rev_num)

var num = 123456789;
var rev_num = 0;
while(num > 0){
rev_num = (rev_num * 10) + (num%10);
 num = parseInt(num/10);
}
console.log(rev_num)