package p000;

/* renamed from: bxfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxfa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxfa f163156c;

    /* renamed from: e */
    private static volatile bxxk f163157e;

    /* renamed from: a */
    public int f163158a;

    /* renamed from: b */
    public int f163159b;

    /* renamed from: d */
    private int f163160d;

    static {
        bxfa bxfa = new bxfa();
        f163156c = bxfa;
        GeneratedMessageLite.m124024a(bxfa.class, bxfa);
    }

    private bxfa() {
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
            return GeneratedMessageLite.m124022a(f163156c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", bxey.f163155a, "b", bxkf.m122797b()});
        } else if (i2 == 3) {
            return new bxfa();
        } else {
            if (i2 == 4) {
                return new bxvd(f163156c);
            }
            if (i2 == 5) {
                return f163156c;
            }
            bxxk bxxk = f163157e;
            if (bxxk == null) {
                synchronized (bxfa.class) {
                    bxxk = f163157e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163156c);
                        f163157e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
