package p000;

/* renamed from: bzjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzjl f170304b;

    /* renamed from: c */
    private static volatile bxxk f170305c;

    /* renamed from: a */
    public bxwc f170306a = bxxn.f165040b;

    static {
        bzjl bzjl = new bzjl();
        f170304b = bzjl;
        bxvk.m124024a(bzjl.class, bzjl);
    }

    private bzjl() {
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
            return bxvk.m124022a(f170304b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bzjk.class});
        } else if (i2 == 3) {
            return new bzjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f170304b);
            }
            if (i2 == 5) {
                return f170304b;
            }
            bxxk bxxk = f170305c;
            if (bxxk == null) {
                synchronized (bzjl.class) {
                    bxxk = f170305c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170304b);
                        f170305c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
