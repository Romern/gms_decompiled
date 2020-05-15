package p000;

/* renamed from: bzxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzxj f171758c;

    /* renamed from: d */
    private static volatile bxxk f171759d;

    /* renamed from: a */
    public int f171760a;

    /* renamed from: b */
    public bzxl f171761b;

    static {
        bzxj bzxj = new bzxj();
        f171758c = bzxj;
        bxvk.m124024a(bzxj.class, bzxj);
    }

    private bzxj() {
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
            return bxvk.m124022a(f171758c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171758c);
            }
            if (i2 == 5) {
                return f171758c;
            }
            bxxk bxxk = f171759d;
            if (bxxk == null) {
                synchronized (bzxj.class) {
                    bxxk = f171759d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171758c);
                        f171759d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
