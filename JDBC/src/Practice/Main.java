package Practice;

public class Main {
    public static void main(String[] args) {
        String s="babad";
       int l=s.length();
       Pair<Integer,Pair<Integer,Integer>>ans=new Pair<>(1,new Pair<>(0,0));
       for(int i=0;i<l;i++){
           int k=i-1,j=i+1;
           while(k>=0 && j<l && s.charAt(k)==s.charAt(j)){
               k--;
               j++;
           }
           k++;
           j--;
           if(ans.getFirst()<(j-k+1)){
               ans.setFirst(j-k+1);
               ans.setSecond(new Pair<>(j,k));
           }
            k=i;
            j=i+1;
           while(k>=0 && j<l && s.charAt(k)==s.charAt(j)){
               k--;
               j++;
           }
           k++;
           j--;
           if(ans.getFirst()<(j-k+1)){
               ans.setFirst(j-k+1);
               ans.setSecond(new Pair<>(j,k));
           }
       }
       System.out.println(ans.getFirst());
       int ins=ans.getSecond().getSecond();
       int inen=ans.getSecond().getFirst();
       System.out.println(s.substring(ins,inen+1));
    }
}
