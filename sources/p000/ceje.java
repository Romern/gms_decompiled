package p000;

/* renamed from: ceje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceje extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ceje f182754c;

    /* renamed from: e */
    private static volatile bxxk f182755e;

    /* renamed from: a */
    public boolean f182756a;

    /* renamed from: b */
    public int f182757b;

    /* renamed from: d */
    private int f182758d;

    static {
        ceje ceje = new ceje();
        f182754c = ceje;
        GeneratedMessageLite.m124024a(ceje.class, ceje);
    }

    private ceje() {
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
            return GeneratedMessageLite.m124022a(f182754c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new ceje();
        } else {
            if (i2 == 4) {
                return new bxvd(f182754c);
            }
            if (i2 == 5) {
                return f182754c;
            }
            bxxk bxxk = f182755e;
            if (bxxk == null) {
                synchronized (ceje.class) {
                    bxxk = f182755e;
                    if (bxxk == null) {
                        bxxk = new bxve(f182754c);
                        f182755e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
