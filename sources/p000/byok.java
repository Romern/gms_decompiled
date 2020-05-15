package p000;

/* renamed from: byok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byok extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byok f167216c;

    /* renamed from: d */
    private static volatile bxxk f167217d;

    /* renamed from: a */
    public int f167218a;

    /* renamed from: b */
    public int f167219b;

    static {
        byok byok = new byok();
        f167216c = byok;
        GeneratedMessageLite.m124024a(byok.class, byok);
    }

    private byok() {
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
            return GeneratedMessageLite.m124022a(f167216c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byok();
        } else {
            if (i2 == 4) {
                return new bxvd(f167216c);
            }
            if (i2 == 5) {
                return f167216c;
            }
            bxxk bxxk = f167217d;
            if (bxxk == null) {
                synchronized (byok.class) {
                    bxxk = f167217d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167216c);
                        f167217d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
