package p000;

/* renamed from: bdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdd {

    /* renamed from: a */
    private static final bed f3028a = bed.m2754a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static bas m2722a(bef bef) {
        bef.mo3024c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3028a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                str2 = bef.mo3029h();
            } else if (a == 2) {
                str3 = bef.mo3029h();
            } else if (a != 3) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                bef.mo3031j();
            }
        }
        bef.mo3025d();
        return new bas(str, str2, str3);
    }
}
