class Solution {
    // defanging means change to non-clickable or non-functionable dut to virus.
    public String defangIPaddr(String address) {
       String addressa=address.replace(".","[.]");
       return addressa;
       /*String arr[]=address.split(".");
        String ans="";
        for(int i=0;i<arr.length-1;i++){
            ans+=(arr[i]+"[.]");  //1[.]1[.]1[.]
        }
        ans+=(arr[arr.length-1]); //1
        return ans;*/
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String address = "192.168.0.1";
        String defangedAddress = solution.defangIPaddr(address);
        
        System.out.println("Original address: " + address);
        System.out.println("Defanged address: " + defangedAddress);
   }
}