package p000;

/* renamed from: bzjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzjh f170284c;

    /* renamed from: e */
    private static volatile bxxk f170285e;

    /* renamed from: a */
    public bxwc f170286a = bxxn.f165040b;

    /* renamed from: b */
    public int f170287b;

    /* renamed from: d */
    private int f170288d;

    static {
        bzjh bzjh = new bzjh();
        f170284c = bzjh;
        bxvk.m124024a(bzjh.class, bzjh);
    }

    private bzjh() {
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
            return bxvk.m124022a(f170284c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0000\u0002\u001b\u0005ဌ\u0003", new Object[]{"d", "a", bzjj.class, "b", bzjf.f170283a});
        } else if (i2 == 3) {
            return new bzjh();
        } else {
            if (i2 == 4) {
                return new bxvd(f170284c);
            }
            if (i2 == 5) {
                return f170284c;
            }
            bxxk bxxk = f170285e;
            if (bxxk == null) {
                synchronized (bzjh.class) {
                    bxxk = f170285e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170284c);
                        f170285e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
