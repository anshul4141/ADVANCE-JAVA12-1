let no = 152;
let sum = 0;
let r = 0;
let temp = no;

while(temp > 0){

    r = temp % 10;
    sum += r*r*r;
    temp = parseInt(temp / 10);
}

console.log(sum);

if(sum == no){

    console.log('this is armstrongNo')

} else {
    console.log('not armstrongNo');
}


