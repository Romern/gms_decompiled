package p000;

/* renamed from: bxdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdn extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxdn f163044j;

    /* renamed from: k */
    private static volatile bxxk f163045k;

    /* renamed from: a */
    public int f163046a;

    /* renamed from: b */
    public int f163047b;

    /* renamed from: c */
    public int f163048c;

    /* renamed from: d */
    public long f163049d;

    /* renamed from: e */
    public int f163050e;

    /* renamed from: f */
    public int f163051f;

    /* renamed from: g */
    public double f163052g;

    /* renamed from: h */
    public double f163053h;

    /* renamed from: i */
    public long f163054i;

    static {
        bxdn bxdn = new bxdn();
        f163044j = bxdn;
        GeneratedMessageLite.m124024a(bxdn.class, bxdn);
    }

    private bxdn() {
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
            return GeneratedMessageLite.m124022a(f163044j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006က\u0005\u0007က\u0006\bဂ\u0007", new Object[]{"a", "b", bxdl.f163043a, "c", bxdk.f163042a, "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bxdn();
        } else {
            if (i2 == 4) {
                return new bxvd(f163044j);
            }
            if (i2 == 5) {
                return f163044j;
            }
            bxxk bxxk = f163045k;
            if (bxxk == null) {
                synchronized (bxdn.class) {
                    bxxk = f163045k;
                    if (bxxk == null) {
                        bxxk = new bxve(f163044j);
                        f163045k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
