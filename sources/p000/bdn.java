package p000;

/* renamed from: bdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdn {

    /* renamed from: a */
    private static final bed f3048a = bed.m2754a("nm", "mm", "hd");

    /* renamed from: a */
    static bbt m2738a(bef bef) {
        int i = 0;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3048a);
            if (a == 0) {
                bef.mo3029h();
            } else if (a == 1) {
                int k = bef.mo3032k();
                if (k != 1) {
                    if (k == 2) {
                        i = 2;
                    } else if (k == 3) {
                        i = 3;
                    } else if (k == 4) {
                        i = 4;
                    } else if (k == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (a != 2) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                z = bef.mo3030i();
            }
        }
        return new bbt(i, z);
    }
}
