# Interfaces
Running, Interfaces, File Structure, Etc.
 
 ----------
 ```
  public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }

        return isRinging;
    }


Output:
No action taken, desk phone does not have a power button
Ring ring
Answering the desk phone
Mobile phone is powered up.
Melody Ring.
Answering the mobile phone.

