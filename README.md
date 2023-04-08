# LabWork1 🚀

Laboratory work for assignment 1 in AITU. 10 Problems about recursion. The program allows users to choose from a menu of different algorithms to solve a specific problem. Users enter a number to choose which algorithm they want to use. The program then prompts the user to enter any necessary input for the chosen algorithm. Finally, the program outputs the result of the chosen algorithm. 🎯


## Task 1 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/MinFinder.java)

📜 **Description**: *This task is about finding the minimum value in an array of integers using recursion.* 🎯

  💡 **Explanation**: The `findMin` method takes an array of integers `arr` and its length `n` as parameters. The method uses recursion to compute the minimum value in the array. The base case is when `n=1`, in which case the minimum value is the first element of the array. In the recursive case, the method compares the last element of the array `arr[n-1]` with the minimum value of the first `n-1` elements of the array `findMin(arr, n-1)`, and returns the smaller value.

   🎉 **Solution**: 

### `findMin` Method 📈

```java
public int findMin(int[] arr, int n) {

    if (n == 1) { // Base case: If n is 1, the minimum value is arr[0]
        return arr[0];
    } else {
    
        // Recursive case: Compute the minimum 
        //of arr[n-1] and the minimum of the first n-1 elements of arr
        return Math.min(arr[n-1], findMin(arr, n-1)); 
    }
}
```
## Task 2 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/AverageFinder.java)

📜 **Description**: *This task is about finding the average of an array of integers using recursion.* 🎯

  💡 **Explanation**: The `findAverage` method takes an array of integers `arr` and its length `n` as parameters. The method uses recursion to compute the average of the values in the array. The base case is when `n=0`, in which case the method returns 0. In the recursive case, the method computes the average of the first `n-1`elements of the array recursively, and then computes the average of all `n` elements using the formula: `(prev * (n-1) + arr[n-1]) / n`, where `prev` is the average of the first `n-1` elements of the array.

   🎉 **Solution**: 

### `findAverage` Method 📈

```java
public double findAverage(int[] arr, int n) {

    if (n == 0) { // Check if there are any elements in the array
    
        return 0; // Base case: if n or length of array is equal to 0, return 0
    } else {
    
        double prev = findAverage(arr, n-1); // Compute the average of the first n-1 elements recursively
        
        return (prev * (n-1) + arr[n-1]) / n; // Returns the result of this calculations
    }
}
```
## Task 3 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/PrimeChecker.java)

📜 **Description**: *This task is about checking whether a given number is prime using recursion.* 🎯

  💡 **Explanation**: The `isPrime` method takes a number `n` and a current divisor `i` as parameters. The method uses recursion to check whether `n` is prime or not. The base cases are when `n=0|1`, in which case the method returns false, and when `n=i`, in which case the method returns true. In the recursive case, the method checks if `n` is divisible by `i`, if yes then `n` is not a prime number and the method returns false. Otherwise, the method recursively checks if `n` is divisible by any other divisor between `i+1` and `n/2`.

   🎉 **Solution**: 

### `isPrime` Method 📈

```java
public boolean isPrime(int n, int i) {

    if (n == 1 || n == 0) { // Base cases: 0 and 1 are not prime numbers
        return false;
    }

    if (n == i) { // Base case: n is prime if the current divisor i is equal to n
        return true;
    }

    if (n % i == 0) { // Check if n is divisible by i, if yes then n is not a prime number
        return false;
    }

    return isPrime(n, i+1); // Recursively check if n is divisible by any other divisor between i and n/2

}
```
## Task 4 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/FactCalc.java)

📜 **Description**: *This task is about computing the factorial of a given number using recursion.* 🎯

  💡 **Explanation**: The `findFct` method first checks if `n=0|1`, and returns 1 in that case, as the factorial of `0 or 1 = 1`. Otherwise, it recursively calls itself with `n-1` as the argument, and multiplies the result by `n` to compute the `n!`. This recursion continues until the base case is reached.

   🎉 **Solution**: 

### `findFct` Method 📈

```java
public int findFct(int n){

    if (n == 0 || n == 1) {  // Base case: if n is 0 or 1, the result is 1
        return 1;
    } else {
        return n * findFct(n - 1); // Recursive case: Compute n * findFct(n - 1)
    }
}
```
## Task 5 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/FibonacciSeq.java)

📜 **Description**: *This task is about computing the n-th number in the Fibonacci sequence using recursion. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.* 🎯

  💡 **Explanation**: The `findFib` method is implemented using recursion. The base case is when `n=0|1`, in which case the method returns `n`. In the recursive case, the method computes the `n-th` number in the Fibonacci sequence as the sum of the `(n-1)th` and `(n-2)th` numbers in the sequence, which are computed recursively using `findFib(n-1)` and `findFib(n-2)`, respectively.

   🎉 **Solution**: 

### `findFib` Method 📈

```java
public int findFib(int n){

    if (n <= 1) { // Base case: if n is 0 or 1, the result is n
        return n;
    } else {
        return findFib(n-1) + findFib(n-2); // Recursive case: Compute findFib(n-1) + findFib(n-2)
    }
}
```
## Task 6 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/ExponentFinder.java)

📜 **Description**: *This task is about computing the value of a to the power of n using recursion.* 🎯

  💡 **Explanation**: The `findExp` method takes two integers `a` and `n` as parameters. The method uses recursion to compute the value of a to the power of `n`. The base case is when `n=0`, in which case the method returns 1. In the recursive case, the method multiplies the base value `a` with the value of `a` to the power of `n-1`, which is computed recursively by calling the method `findExp(a, n-1)`.

   🎉 **Solution**: 

### `findExp` Method 📈

```java
public int findExp(int a, int n){

    if (n == 0) {  // Base case: if n is 0, the result is 1
        return 1;
    } else {
        return a * findExp(a, n-1);  // Recursive case: Compute a * findExp(a, n-1)
    }
}
```
## Task 7 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/ReverseArray.java)

📜 **Description**: *This task is about reversing an array of integers using recursion and two pointers.* 🎯

  💡 **Explanation**: The `reverseArr` method takes an array of integers `arr`, and the indices of the `first` and `last` elements of the array as parameters. The method uses recursion and two pointers to reverse the elements of the array. The base case is when the `first` index is greater than or equal to the `last` index, which means the array is already reversed. In the recursive case, the method swaps the `first` and `last` elements of the array using a temporary variable, and then calls itself recursively with the next pair of indices, `first+1` and `last-1`.

   🎉 **Solution**: 

### `reverseArr` Method 📈

```java
public void reverseArr(int[] arr, int first, int last){

    // base case: if first index is greater than or equal to the last index, the array is already reversed
    if (first >= last) return;

    // swap the first and last elements
    int temp = arr[first];
    arr[first] = arr[last];
    arr[last] = temp;

    // recursively call the function with the next pair of indices
    reverseArr(arr, first+1, last-1);
}
```
## Task 8 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/DigitChecker.java)

📜 **Description**: *This task is about checking whether a given string contains only digits using recursion.* 🎯

  💡 **Explanation**: The `isDigit` method takes a string `str` as a parameter. The base case is when the string is `empty`, which means it contains only `digits`. In the recursive case, the method checks the `first` character of the string to see if it is a digit. If it is not a digit, the method returns false. If it is a digit, the method calls itself recursively with the rest of the string, `str.substring(1)`, until the string is empty or a non-digit character is encountered.

   🎉 **Solution**: 

### `isDigit` Method 📈

```java
public boolean isDigit(String str){

    // Base case: if the string is empty, it contains only digits
    if (str.isEmpty()) {
        return true;
    }

    // Check if the first character in the string is a digit
    char ch = str.charAt(0);
    if (ch < '0' || ch > '9') {
        return false;
    }

    // Recursive case: check the rest of the string for digits
    return isDigit(str.substring(1));
}
```
## Task 9 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/BinomialCoefficientFinder.java)

📜 **Description**: *This task is about computing the binomial coefficient C(n,k) using recursion.* 🎯

  💡 **Explanation**: The `findBinomCoeff` method takes two integers `n` and `k` as parameters and computes the binomial coefficient `C(n,k)`. The base case is when `k=0` or `k=n`, in which case the result is 1. In the recursive case, the method uses the formula `C(n-1, k-1) + C(n-1, k)` to compute the value of `C(n,k)` by recursively calling itself with smaller values of `n` and `k`.

   🎉 **Solution**: 

### `findBinomCoeff` Method 📈

```java
public int findBinomCoeff(int n, int k){

    // Base case: If k is 0 or k equals n, return 1
    if (k == 0 || k == n) {
        return 1;
    } else {
        // Recursive case: Compute C(n-1, k-1) + C(n-1, k)
        return findBinomCoeff(n-1, k-1) + findBinomCoeff(n-1, k);
    }
}
```
## Task 10 [module src](https://github.com/Andn1ght/LabWork1/blob/master/src/algorithms/GCDFinder.java)

📜 **Description**: *This task is about finding the greatest common divisor (GCD) of two integers using recursion.* 🎯

  💡 **Explanation**: The `findGCD` method takes two integers `a` and `b` as parameters and uses the `Euclidean algorithm` to find their `GCD`. The base case is when `b=0`, which means that the `GCD=a`. In the recursive case, the method calls itself with `b` as the first parameter and the remainder of `a` divided by `b` as the second parameter.

   🎉 **Solution**: 

### `findGCD` Method 📈

```java
public int findGCD(int a, int b) {

    if (b == 0) {       // Base case: if b is 0, the GCD is a
        return a;
    } else {
        return findGCD(b, a % b); // Recursive case: Compute GCD(b, a % b)
    }
}
```
