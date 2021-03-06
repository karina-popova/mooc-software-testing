package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
         nf.find(new int[] {0, 25, 7, 19});

        // this crashes
       // nf.find(new int[] {7, 6, 5, 4});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
