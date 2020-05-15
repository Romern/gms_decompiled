package p000;

/* renamed from: bzqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzqs f171063c;

    /* renamed from: e */
    private static volatile bxxk f171064e;

    /* renamed from: a */
    public String f171065a = "";

    /* renamed from: b */
    public String f171066b = "";

    /* renamed from: d */
    private int f171067d;

    static {
        bzqs bzqs = new bzqs();
        f171063c = bzqs;
        GeneratedMessageLite.m124024a(bzqs.class, bzqs);
    }

    private bzqs() {
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
            return GeneratedMessageLite.m124022a(f171063c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f171063c);
            }
            if (i2 == 5) {
                return f171063c;
            }
            bxxk bxxk = f171064e;
            if (bxxk == null) {
                synchronized (bzqs.class) {
                    bxxk = f171064e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171063c);
                        f171064e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
