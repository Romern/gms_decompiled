package p000;

/* renamed from: cbio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbio extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbio f177277c;

    /* renamed from: d */
    private static volatile bxxk f177278d;

    /* renamed from: a */
    public cbhy f177279a;

    /* renamed from: b */
    public int f177280b;

    static {
        cbio cbio = new cbio();
        f177277c = cbio;
        GeneratedMessageLite.m124024a(cbio.class, cbio);
    }

    private cbio() {
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
            return GeneratedMessageLite.m124022a(f177277c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbio();
        } else {
            if (i2 == 4) {
                return new bxvd(f177277c);
            }
            if (i2 == 5) {
                return f177277c;
            }
            bxxk bxxk = f177278d;
            if (bxxk == null) {
                synchronized (cbio.class) {
                    bxxk = f177278d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177277c);
                        f177278d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
