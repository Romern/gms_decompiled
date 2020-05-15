package p000;

/* renamed from: byvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byvw f168523e;

    /* renamed from: f */
    private static volatile bxxk f168524f;

    /* renamed from: a */
    public int f168525a;

    /* renamed from: b */
    public int f168526b;

    /* renamed from: c */
    public int f168527c;

    /* renamed from: d */
    public int f168528d;

    static {
        byvw byvw = new byvw();
        f168523e = byvw;
        GeneratedMessageLite.m124024a(byvw.class, byvw);
    }

    private byvw() {
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
            return GeneratedMessageLite.m124022a(f168523e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bzau.m125595b(), "d"});
        } else if (i2 == 3) {
            return new byvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f168523e);
            }
            if (i2 == 5) {
                return f168523e;
            }
            bxxk bxxk = f168524f;
            if (bxxk == null) {
                synchronized (byvw.class) {
                    bxxk = f168524f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168523e);
                        f168524f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
