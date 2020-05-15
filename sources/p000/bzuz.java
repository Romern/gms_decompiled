package p000;

/* renamed from: bzuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzuz f171486b;

    /* renamed from: c */
    private static volatile bxxk f171487c;

    /* renamed from: a */
    public int f171488a;

    static {
        bzuz bzuz = new bzuz();
        f171486b = bzuz;
        GeneratedMessageLite.m124024a(bzuz.class, bzuz);
    }

    private bzuz() {
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
            return GeneratedMessageLite.m124022a(f171486b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171486b);
            }
            if (i2 == 5) {
                return f171486b;
            }
            bxxk bxxk = f171487c;
            if (bxxk == null) {
                synchronized (bzuz.class) {
                    bxxk = f171487c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171486b);
                        f171487c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
