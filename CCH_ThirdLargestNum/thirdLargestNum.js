
const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});
 
readline.question('Enter number series: ', (num) => {
  findThirdLargeNum(num)
	readline.close();
})

//Function to sort the number series 
function sort(str){
  //Turn number in to arrar using split method
  var arr = str.split('');
  var tmp;

  //Loop to arrange number in accending order 
  for(var i = 0; i < arr.length; i++){
    for(var j = i + 1; j < arr.length; j++){
      if(arr[i] > arr[j]){
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }
  }
  return arr.join('');
}


function findThirdLargeNum(num){
  //Use sorting function to arrange numbers in accending order 
  let isnum = /^\d+$/.test(num);
  if(isnum){
    var sortedNum = sort(num);
    var arrNum = sortedNum.split('');
    var count = 0;
    var ans = 0; 

    for(var i = 1; i <= arrNum.length; i++){
        if(arrNum[i-1]< arrNum[i]){
          ans = arrNum[i-1];
          count++; 
          if(count == 3){
              console.log("Third largest num: "+ans); 
          }
        }
    }
  }
  else{
      console.log("Please use only numbers(digits). Thank you"); 
  }
    
}
