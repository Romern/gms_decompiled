package p000;

/* renamed from: cbjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbjr f177359b;

    /* renamed from: c */
    private static volatile bxxk f177360c;

    /* renamed from: a */
    public cbjp f177361a;

    static {
        cbjr cbjr = new cbjr();
        f177359b = cbjr;
        bxvk.m124024a(cbjr.class, cbjr);
    }

    private cbjr() {
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
            return bxvk.m124022a(f177359b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177359b);
            }
            if (i2 == 5) {
                return f177359b;
            }
            bxxk bxxk = f177360c;
            if (bxxk == null) {
                synchronized (cbjr.class) {
                    bxxk = f177360c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177359b);
                        f177360c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
