package p000;

/* renamed from: bytb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bytb f167639f;

    /* renamed from: h */
    private static volatile bxxk f167640h;

    /* renamed from: a */
    public int f167641a;

    /* renamed from: b */
    public int f167642b = 1;

    /* renamed from: c */
    public bysy f167643c;

    /* renamed from: d */
    public bytl f167644d;

    /* renamed from: e */
    public bysx f167645e;

    /* renamed from: g */
    private byte f167646g = 2;

    static {
        bytb bytb = new bytb();
        f167639f = bytb;
        GeneratedMessageLite.m124024a(bytb.class, bytb);
    }

    private bytb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167646g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167646g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167639f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", bytg.f167670a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bytb();
        } else {
            if (i2 == 4) {
                return new bxvd(f167639f);
            }
            if (i2 == 5) {
                return f167639f;
            }
            bxxk bxxk = f167640h;
            if (bxxk == null) {
                synchronized (bytb.class) {
                    bxxk = f167640h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167639f);
                        f167640h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
