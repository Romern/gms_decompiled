package p000;

/* renamed from: bzii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzii extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzii f170183c;

    /* renamed from: d */
    private static volatile bxxk f170184d;

    /* renamed from: a */
    public int f170185a;

    /* renamed from: b */
    public int f170186b;

    static {
        bzii bzii = new bzii();
        f170183c = bzii;
        bxvk.m124024a(bzii.class, bzii);
    }

    private bzii() {
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
            return bxvk.m124022a(f170183c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzii();
        } else {
            if (i2 == 4) {
                return new bxvd(f170183c);
            }
            if (i2 == 5) {
                return f170183c;
            }
            bxxk bxxk = f170184d;
            if (bxxk == null) {
                synchronized (bzii.class) {
                    bxxk = f170184d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170183c);
                        f170184d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
