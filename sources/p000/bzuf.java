package p000;

/* renamed from: bzuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzuf f171414c;

    /* renamed from: d */
    private static volatile bxxk f171415d;

    /* renamed from: a */
    public int f171416a = 0;

    /* renamed from: b */
    public Object f171417b;

    static {
        bzuf bzuf = new bzuf();
        f171414c = bzuf;
        GeneratedMessageLite.m124024a(bzuf.class, bzuf);
    }

    private bzuf() {
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
            return GeneratedMessageLite.m124022a(f171414c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", bzue.class});
        } else if (i2 == 3) {
            return new bzuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f171414c);
            }
            if (i2 == 5) {
                return f171414c;
            }
            bxxk bxxk = f171415d;
            if (bxxk == null) {
                synchronized (bzuf.class) {
                    bxxk = f171415d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171414c);
                        f171415d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
