package p000;

/* renamed from: bfxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bfxq f115602g;

    /* renamed from: h */
    private static volatile bxxk f115603h;

    /* renamed from: a */
    public int f115604a;

    /* renamed from: b */
    public int f115605b;

    /* renamed from: c */
    public int f115606c;

    /* renamed from: d */
    public long f115607d;

    /* renamed from: e */
    public boolean f115608e;

    /* renamed from: f */
    public boolean f115609f;

    static {
        bfxq bfxq = new bfxq();
        f115602g = bfxq;
        GeneratedMessageLite.m124024a(bfxq.class, bfxq);
    }

    private bfxq() {
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
            return GeneratedMessageLite.m124022a(f115602g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0002\u0005\u0007\u0006\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bfxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f115602g);
            }
            if (i2 == 5) {
                return f115602g;
            }
            bxxk bxxk = f115603h;
            if (bxxk == null) {
                synchronized (bfxq.class) {
                    bxxk = f115603h;
                    if (bxxk == null) {
                        bxxk = new bxve(f115602g);
                        f115603h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
