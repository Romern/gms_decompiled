package p000;

/* renamed from: aqai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqai extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqai f85385e;

    /* renamed from: f */
    private static volatile bxxk f85386f;

    /* renamed from: a */
    public int f85387a;

    /* renamed from: b */
    public long f85388b;

    /* renamed from: c */
    public long f85389c;

    /* renamed from: d */
    public long f85390d;

    static {
        aqai aqai = new aqai();
        f85385e = aqai;
        GeneratedMessageLite.m124024a(aqai.class, aqai);
    }

    private aqai() {
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
            return GeneratedMessageLite.m124022a(f85385e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqai();
        } else {
            if (i2 == 4) {
                return new bxvd(f85385e);
            }
            if (i2 == 5) {
                return f85385e;
            }
            bxxk bxxk = f85386f;
            if (bxxk == null) {
                synchronized (aqai.class) {
                    bxxk = f85386f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85385e);
                        f85386f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
