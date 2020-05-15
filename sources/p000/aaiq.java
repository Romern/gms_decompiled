package p000;

/* renamed from: aaiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final aaiq f28214c;

    /* renamed from: d */
    private static volatile bxxk f28215d;

    /* renamed from: a */
    public int f28216a;

    /* renamed from: b */
    public String f28217b = "";

    static {
        aaiq aaiq = new aaiq();
        f28214c = aaiq;
        GeneratedMessageLite.m124024a(aaiq.class, aaiq);
    }

    private aaiq() {
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
            return GeneratedMessageLite.m124022a(f28214c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aaiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f28214c);
            }
            if (i2 == 5) {
                return f28214c;
            }
            bxxk bxxk = f28215d;
            if (bxxk == null) {
                synchronized (aaiq.class) {
                    bxxk = f28215d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28214c);
                        f28215d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
