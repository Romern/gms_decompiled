package p000;

/* renamed from: bzrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzrg f171125c;

    /* renamed from: d */
    private static volatile bxxk f171126d;

    /* renamed from: a */
    public int f171127a;

    /* renamed from: b */
    public int f171128b;

    static {
        bzrg bzrg = new bzrg();
        f171125c = bzrg;
        GeneratedMessageLite.m124024a(bzrg.class, bzrg);
    }

    private bzrg() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f171125c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f171125c);
            }
            if (i2 == 5) {
                return f171125c;
            }
            bxxk bxxk = f171126d;
            if (bxxk == null) {
                synchronized (bzrg.class) {
                    bxxk = f171126d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171125c);
                        f171126d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
