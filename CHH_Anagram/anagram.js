const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });
   
  readline.question('Enter two letters using comma(","): ', (word1) => {
    var arr = word1.split(',');
    checkAnagram(arr[0],arr[1]);
      readline.close();
  })

  function sortString(str){
    var arr = str.split('');
    var tmp;
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

  function checkAnagram(str1, str2){
      var word1 = sortString(str1.toLowerCase());
      var word2 = sortString(str2.toLowerCase());

      if(word1 == word2){
          console.log("These two words are anagram");
      }
      else {
        console.log("This is not anagram");
      }
  }
