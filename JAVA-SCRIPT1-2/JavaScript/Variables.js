// let, var, const

//using const
const n = 5.5;
//n = "n";
console.log(n);
console.log("------------");
// usin let
{
    let n = "let1st"
    n = "let2nd"
    console.log(n);
}
console.log(n);

// 1
function emp(id, name, address, salary){
    this.id = id;
    this.name = name;
    this.address = address;
    this.salary = salary;
}

let e = new emp(1, 'Ram', 'Indore', 5000);
console.log(e.id, e.name, e.address, e.salary);

// 2
let student = {id:1, name:'ram'}

console.log(student.id);