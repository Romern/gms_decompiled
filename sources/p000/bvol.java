package p000;

/* renamed from: bvol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvol extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvol f157047d;

    /* renamed from: e */
    private static volatile bxxk f157048e;

    /* renamed from: a */
    public int f157049a;

    /* renamed from: b */
    public bvok f157050b;

    /* renamed from: c */
    public bvok f157051c;

    static {
        bvol bvol = new bvol();
        f157047d = bvol;
        bxvk.m124024a(bvol.class, bvol);
    }

    private bvol() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f157047d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvol();
        } else {
            if (i2 == 4) {
                return new bxvd(f157047d);
            }
            if (i2 == 5) {
                return f157047d;
            }
            bxxk bxxk = f157048e;
            if (bxxk == null) {
                synchronized (bvol.class) {
                    bxxk = f157048e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157047d);
                        f157048e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
