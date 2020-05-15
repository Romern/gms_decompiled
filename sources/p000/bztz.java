package p000;

/* renamed from: bztz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bztz f171387c;

    /* renamed from: d */
    private static volatile bxxk f171388d;

    /* renamed from: a */
    public int f171389a;

    /* renamed from: b */
    public bzua f171390b;

    static {
        bztz bztz = new bztz();
        f171387c = bztz;
        GeneratedMessageLite.m124024a(bztz.class, bztz);
    }

    private bztz() {
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
            return GeneratedMessageLite.m124022a(f171387c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bztz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171387c);
            }
            if (i2 == 5) {
                return f171387c;
            }
            bxxk bxxk = f171388d;
            if (bxxk == null) {
                synchronized (bztz.class) {
                    bxxk = f171388d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171387c);
                        f171388d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
