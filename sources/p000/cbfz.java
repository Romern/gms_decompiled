package p000;

/* renamed from: cbfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cbfz f176993h;

    /* renamed from: i */
    private static volatile bxxk f176994i;

    /* renamed from: a */
    public int f176995a = 0;

    /* renamed from: b */
    public Object f176996b;

    /* renamed from: c */
    public int f176997c;

    /* renamed from: d */
    public int f176998d;

    /* renamed from: e */
    public int f176999e;

    /* renamed from: f */
    public int f177000f;

    /* renamed from: g */
    public int f177001g;

    static {
        cbfz cbfz = new cbfz();
        f176993h = cbfz;
        GeneratedMessageLite.m124024a(cbfz.class, cbfz);
    }

    private cbfz() {
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
            return GeneratedMessageLite.m124022a(f176993h, "\u0000\f\u0001\u0000\u0001k\f\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000", new Object[]{"b", "a", "c", "d", "e", "f", "g", cbgf.class, cbfq.class, cbfx.class, cbfp.class, cbft.class, cbfo.class, cbfn.class});
        } else if (i2 == 3) {
            return new cbfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f176993h);
            }
            if (i2 == 5) {
                return f176993h;
            }
            bxxk bxxk = f176994i;
            if (bxxk == null) {
                synchronized (cbfz.class) {
                    bxxk = f176994i;
                    if (bxxk == null) {
                        bxxk = new bxve(f176993h);
                        f176994i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
