package p000;

/* renamed from: bzfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzfi f169812d;

    /* renamed from: e */
    public static final bxvj f169813e;

    /* renamed from: f */
    private static volatile bxxk f169814f;

    /* renamed from: a */
    public int f169815a;

    /* renamed from: b */
    public bzex f169816b;

    /* renamed from: c */
    public bzgm f169817c;

    static {
        bzfi bzfi = new bzfi();
        f169812d = bzfi;
        GeneratedMessageLite.m124024a(bzfi.class, bzfi);
        blbz blbz = blbz.f125890a;
        bzfi bzfi2 = f169812d;
        f169813e = GeneratedMessageLite.m124006a(blbz, bzfi2, bzfi2, 71464407, bxzf.MESSAGE);
    }

    private bzfi() {
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
            return GeneratedMessageLite.m124022a(f169812d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzfi();
        } else {
            if (i2 == 4) {
                return new bxvd(f169812d);
            }
            if (i2 == 5) {
                return f169812d;
            }
            bxxk bxxk = f169814f;
            if (bxxk == null) {
                synchronized (bzfi.class) {
                    bxxk = f169814f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169812d);
                        f169814f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
