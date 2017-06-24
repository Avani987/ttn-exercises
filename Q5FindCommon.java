public class Q5FindCommon {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,7,8,0};
        int[] arr2={2,5,7,12,32,90,9};
        System.out.println("First Array : ");
        for(int k=0;k<arr1.length;k++)
            System.out.print(" " + arr1[k]);
        System.out.println("\nSecond Array : ");
        for(int l=0;l<arr1.length;l++)
            System.out.print(" " + arr2[l]);

        System.out.println("\nCommon Elements are:");
        for(int i=0;i<arr1.length;i++)
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                    System.out.print(" "+arr1[i]);
            }
    }
}
