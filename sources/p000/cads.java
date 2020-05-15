package p000;

/* renamed from: cads */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cads extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cads f172724b;

    /* renamed from: c */
    private static volatile bxxk f172725c;

    /* renamed from: a */
    public bxwc f172726a = bxxn.f165040b;

    static {
        cads cads = new cads();
        f172724b = cads;
        bxvk.m124024a(cads.class, cads);
    }

    private cads() {
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
            return bxvk.m124022a(f172724b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cadr.class});
        } else if (i2 == 3) {
            return new cads();
        } else {
            if (i2 == 4) {
                return new bxvd(f172724b);
            }
            if (i2 == 5) {
                return f172724b;
            }
            bxxk bxxk = f172725c;
            if (bxxk == null) {
                synchronized (cads.class) {
                    bxxk = f172725c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172724b);
                        f172725c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
