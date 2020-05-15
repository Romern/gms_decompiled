package p000;

/* renamed from: bzoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzoh f170810c;

    /* renamed from: d */
    private static volatile bxxk f170811d;

    /* renamed from: a */
    public bzoa f170812a;

    /* renamed from: b */
    public long f170813b;

    static {
        bzoh bzoh = new bzoh();
        f170810c = bzoh;
        GeneratedMessageLite.m124024a(bzoh.class, bzoh);
    }

    private bzoh() {
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
            return GeneratedMessageLite.m124022a(f170810c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f170810c);
            }
            if (i2 == 5) {
                return f170810c;
            }
            bxxk bxxk = f170811d;
            if (bxxk == null) {
                synchronized (bzoh.class) {
                    bxxk = f170811d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170810c);
                        f170811d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
