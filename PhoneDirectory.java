/**
Design a Phone Directory which supports the following operations:

 

get: Provide a number which is not assigned to anyone.
check: Check if a number is available or not.
release: Recycle or release a number.
 

Example:

// Init a phone directory containing a total of 3 numbers: 0, 1, and 2.
PhoneDirectory directory = new PhoneDirectory(3);

// It can return any available phone number. Here we assume it returns 0.
directory.get();

// Assume it returns 1.
directory.get();

// The number 2 is available, so return true.
directory.check(2);

// It returns 2, the only number that is left.
directory.get();

// The number 2 is no longer available, so return false.
directory.check(2);

// Release number 2 back to the pool.
directory.release(2);

// Number 2 is available again, return true.
directory.check(2);
 

Constraints:

1 <= maxNumbers <= 10^4
0 <= number < maxNumbers
The total number of call of the methods is between [0 - 20000]

**/


class PhoneDirectory {
    
    boolean directory [];
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        directory = new boolean[maxNumbers];
        for(int i=0; i< directory.length; i++) {
            directory[i] = true;
        }
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        // print(directory);
        for(int i=0; i< directory.length; i++) {
            if(directory[i]) {
                
                directory[i] = false;
                return i;
            }
        }
        
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        
        return directory[number];
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        directory[number] = true;
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */
