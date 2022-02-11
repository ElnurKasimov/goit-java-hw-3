public class ATM {

 public int countBanknotes(int sum) {
     int[] bills = new int[9];
     
     if (sum >=500) {
         bills[8]=sum/500;
         sum-=bills[8]*500;
        }

     if (sum >=200) {
         bills[7]=sum/200;
         sum-=bills[7]*200;
     }

     if (sum >=100) {
         bills[6]=sum/100;
         sum-=bills[6]*100;
     }

     if (sum >=50) {
         bills[5]=sum/50;
         sum-=bills[5]*50;
     }

     if (sum >=20) {
         bills[4]=sum/20;
         sum-=bills[4]*20;
     }

     if (sum >=10) {
         bills[3]=sum/10;
         sum-=bills[3]*10;
     }

     if (sum >=5) {
         bills[2]=sum/5;
         sum-=bills[2]*5;
     }

     if (sum >=2) {
         bills[1]=sum/2;
         sum-=bills[1]*2;
     }
     if (sum == 1) {bills[0]=1;}
     else {bills[0]=0;}

     int min = 0;
     int i = 0;
     while (i <9 ) {
       min+=bills[i];
       i++;
     }
     return min;
    }

}