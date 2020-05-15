package p000;

/* renamed from: adia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adia extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final adia f61759b;

    /* renamed from: c */
    private static volatile bxxk f61760c;

    /* renamed from: a */
    public long f61761a;

    static {
        adia adia = new adia();
        f61759b = adia;
        GeneratedMessageLite.m124024a(adia.class, adia);
    }

    private adia() {
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
            return GeneratedMessageLite.m124022a(f61759b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new adia();
        } else {
            if (i2 == 4) {
                return new bxvd(f61759b);
            }
            if (i2 == 5) {
                return f61759b;
            }
            bxxk bxxk = f61760c;
            if (bxxk == null) {
                synchronized (adia.class) {
                    bxxk = f61760c;
                    if (bxxk == null) {
                        bxxk = new bxve(f61759b);
                        f61760c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
