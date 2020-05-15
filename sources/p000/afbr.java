package p000;

/* renamed from: afbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbr {

    /* renamed from: a */
    public final bxxc f64155a;

    /* renamed from: b */
    public final int f64156b;

    public afbr(bxxc bxxc) {
        int i;
        sdo.m34959a(bxxc);
        this.f64155a = bxxc;
        if (bxxc instanceof afbj) {
            i = 2;
        } else if (bxxc instanceof afbm) {
            i = 3;
        } else if (bxxc instanceof afbb) {
            i = 4;
        } else if (bxxc instanceof afbe) {
            i = 5;
        } else if (bxxc instanceof afbg) {
            i = 6;
        } else if (bxxc instanceof afbh) {
            i = 7;
        } else if (bxxc instanceof afbi) {
            i = 8;
        } else {
            throw new afbq(0);
        }
        this.f64156b = i;
    }
}
