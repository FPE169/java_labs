package Lab_32;

public class JonsonTrotter {
    public static boolean any(boolean[] a){
        boolean k = false;
        for(boolean i: a){
            k = k | i;
        }
        return k;
    }

    public static boolean[] mob(int[] a, int[] b){
        boolean[] c = new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(i+b[i]>=0 & i+b[i]<a.length){
                c[i]= a[i]>a[i+b[i]];
            }
        }
        return c;
    }
    public static int max(int[] a, boolean[] b){
        int mm = 0;
        for(int j=0;j<b.length;j++){
            if(b[j]){
                mm = j;
            }
        }
        for(int i=0;i<a.length;i++){
            if(b[i] & a[i]>a[mm]){
                mm = i;
            }
        }
        return mm;
    }

    public static String viv(int[] a){
        String b = "";
        for(int i: a){
            b += i+" ";
        }
        return b;
    }

    public static String viv1(boolean[] a){
        String b = "";
        for(boolean i: a){
            b += i+" ";
        }
        return b;
    }

    public static void perm(int n){
        int[] a = new int[n];
        int[] b = new int[n];
        boolean[]c;
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
            b[i]=-1;
        }
        viv(a);
        c = mob(a, b);
        System.out.println(viv(a));
        System.out.println(viv(b));
        System.out.println(viv1(c));
        while (any(c)) {
            int mm = max(a, c);
            int k = a[mm];
            int r = b[mm];
            int u = mm+b[mm];
            a[mm] = a[u];
            a[u] = k;
            b[mm] = b[u];
            b[u] = r;
            for(int i=0;i<a.length;i++){
                if(a[i]>k){
                    b[i] = b[i]*(-1);
                }
            }
            c = mob(a, b);
            System.out.println(viv(a));
            System.out.println(viv(b));
            System.out.println(viv1(c));
        }
    }

    public static void main(String arg[]){

        perm(3);
    }
}