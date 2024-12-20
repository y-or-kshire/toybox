import pkgA.PkgTest2;
import pkgA.pkgB.PkgTest3;

class PkgTest1 {
    public static void main(String[] args) {
        PkgTest2 o2 = new PkgTest2();
        PkgTest3 o3 = new PkgTest3();
        o2.test();
        o3.test();
    }
}
