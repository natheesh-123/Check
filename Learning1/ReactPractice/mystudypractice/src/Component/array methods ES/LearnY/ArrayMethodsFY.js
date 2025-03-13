


import React from 'react'

function ArrayMethodsFY() {

//map
let num=[10,20,30,40];
let num1= num.map(val=>val*2);

//
const fruits=["apple","banana","mango"];


const fruitList = fruits.join(', ');
// console.log(num1);

const fruitListarr = fruitList.split(",");

const name = "Alice";
const age = 30;
// console.log("My name is ".concat(name).concat(" and I am ").concat(age).concat(" years old."));

// const arr = ['Hello', 'World', '!'];
// const str = arr.toString();
// console.log(str); // "Hello,World,!;"

// const str1 = "Hello";
// const arr1 = Array.from(str1);
// console.log(arr1); // ["H", "e", "l", "l", "o"]


const arr6 = ['Hello',  'World',       '!'];
const str6 = arr6.join(','); // Join with a space
console.log(str6); // "Hello World !"


const str7 = "Hello,   World,   !";
const arr7 = str7.split(",   "); // Splits based on the comma and space
console.log(arr7); // ["Hello", "World!"]


const arr8 = [
    { name: 'Alice', age: 25 },
    { name: 'Bob', age: 30 }
];
const str8 = JSON.stringify(arr8);
console.log(str8); // '[{"name":"Alice","age":25},{"name":"Bob","age":30}]'

    return (
        <div>
            {/* <h1>{num1}</h1>
            
            { console.log(num1)} */}
{/* 
            <ul>
                {
                    fruits.map((fruit,index)=>(<li >{` i ma a ${fruit}`}</li>))
                }

                {
                    
                <div>{`Fruits available are: ${fruitList}`} <br></br></div>
                }
            </ul> */}


                    {/* <p>
                    {fruits.map((fruit, index) => (
                        <span key={index}>
                        {` ${fruit}`}<br />
                        </span>
                    ))}
                    </p> */}

                    
                    <p>
                    {fruitListarr.map((fruitList1, index) => (
                        <span key={index}>
                        {` block element ${fruitList1}`}<br />
                        </span>
                    ))}
                    </p>



                    
            <ul>
                {
                    fruitListarr.map((fruit,index)=>(
                    <li >{` using list ${fruit}`}</li>
                ))}
            </ul>

                    {/* {console.log("My name is ".concat(name).concat(" and I am ").concat(age).concat(" years old."))} */}
        </div>
    )
}

export default ArrayMethodsFY
