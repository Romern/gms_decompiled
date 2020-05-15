package p000;

/* renamed from: bupo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bupo f154659c;

    /* renamed from: d */
    private static volatile bxxk f154660d;

    /* renamed from: a */
    public bynx f154661a;

    /* renamed from: b */
    public bupy f154662b;

    static {
        bupo bupo = new bupo();
        f154659c = bupo;
        GeneratedMessageLite.m124024a(bupo.class, bupo);
    }

    private bupo() {
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
            return GeneratedMessageLite.m124022a(f154659c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bupo();
        } else {
            if (i2 == 4) {
                return new bxvd(f154659c);
            }
            if (i2 == 5) {
                return f154659c;
            }
            bxxk bxxk = f154660d;
            if (bxxk == null) {
                synchronized (bupo.class) {
                    bxxk = f154660d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154659c);
                        f154660d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
