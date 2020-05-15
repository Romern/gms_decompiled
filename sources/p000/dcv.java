package p000;

/* renamed from: dcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dcv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final dcv f12886e;

    /* renamed from: f */
    private static volatile bxxk f12887f;

    /* renamed from: a */
    public int f12888a;

    /* renamed from: b */
    public int f12889b;

    /* renamed from: c */
    public int f12890c;

    /* renamed from: d */
    public String f12891d = "";

    static {
        dcv dcv = new dcv();
        f12886e = dcv;
        GeneratedMessageLite.m124024a(dcv.class, dcv);
    }

    private dcv() {
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
            return GeneratedMessageLite.m124022a(f12886e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dcu.f12885a, "c", dcy.f12905a, "d"});
        } else if (i2 == 3) {
            return new dcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f12886e);
            }
            if (i2 == 5) {
                return f12886e;
            }
            bxxk bxxk = f12887f;
            if (bxxk == null) {
                synchronized (dcv.class) {
                    bxxk = f12887f;
                    if (bxxk == null) {
                        bxxk = new bxve(f12886e);
                        f12887f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
