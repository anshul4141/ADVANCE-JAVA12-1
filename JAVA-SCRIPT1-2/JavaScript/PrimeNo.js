let no = 4;
let count = 0;

for(let i = 2; i < no; i++){

    if (no % i == 0) {

        count++;
        
    }

}

if (count != 0) {

    console.log('not prime no');
    
} else {
    
    console.log('prime no');

}