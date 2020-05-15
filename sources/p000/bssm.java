package p000;

/* renamed from: bssm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bssm f146877d;

    /* renamed from: e */
    private static volatile bxxk f146878e;

    /* renamed from: a */
    public int f146879a;

    /* renamed from: b */
    public int f146880b;

    /* renamed from: c */
    public bssi f146881c;

    static {
        bssm bssm = new bssm();
        f146877d = bssm;
        GeneratedMessageLite.m124024a(bssm.class, bssm);
    }

    private bssm() {
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
            return GeneratedMessageLite.m124022a(f146877d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0003", new Object[]{"a", "b", bsmx.m115994b(), "c"});
        } else if (i2 == 3) {
            return new bssm();
        } else {
            if (i2 == 4) {
                return new bxvd(f146877d);
            }
            if (i2 == 5) {
                return f146877d;
            }
            bxxk bxxk = f146878e;
            if (bxxk == null) {
                synchronized (bssm.class) {
                    bxxk = f146878e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146877d);
                        f146878e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
