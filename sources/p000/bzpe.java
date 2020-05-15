package p000;

/* renamed from: bzpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpe extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzpe f170904b;

    /* renamed from: d */
    private static volatile bxxk f170905d;

    /* renamed from: a */
    public String f170906a = "";

    /* renamed from: c */
    private int f170907c;

    static {
        bzpe bzpe = new bzpe();
        f170904b = bzpe;
        bxvk.m124024a(bzpe.class, bzpe);
    }

    private bzpe() {
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
            return bxvk.m124022a(f170904b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f170904b);
            }
            if (i2 == 5) {
                return f170904b;
            }
            bxxk bxxk = f170905d;
            if (bxxk == null) {
                synchronized (bzpe.class) {
                    bxxk = f170905d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170904b);
                        f170905d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
