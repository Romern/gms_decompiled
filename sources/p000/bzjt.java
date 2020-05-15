package p000;

/* renamed from: bzjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzjt f170345c;

    /* renamed from: d */
    private static volatile bxxk f170346d;

    /* renamed from: a */
    public bxwc f170347a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f170348b = bxxn.f165040b;

    static {
        bzjt bzjt = new bzjt();
        f170345c = bzjt;
        bxvk.m124024a(bzjt.class, bzjt);
    }

    private bzjt() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f170345c, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0000\u0005\u001b\u0006\u001b", new Object[]{"a", bzjs.class, "b", bzjs.class});
        } else if (i2 == 3) {
            return new bzjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f170345c);
            }
            if (i2 == 5) {
                return f170345c;
            }
            bxxk bxxk = f170346d;
            if (bxxk == null) {
                synchronized (bzjt.class) {
                    bxxk = f170346d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170345c);
                        f170346d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
