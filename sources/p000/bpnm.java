package p000;

/* renamed from: bpnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpnm f138421e;

    /* renamed from: f */
    private static volatile bxxk f138422f;

    /* renamed from: a */
    public int f138423a;

    /* renamed from: b */
    public int f138424b;

    /* renamed from: c */
    public boolean f138425c;

    /* renamed from: d */
    public long f138426d;

    static {
        bpnm bpnm = new bpnm();
        f138421e = bpnm;
        GeneratedMessageLite.m124024a(bpnm.class, bpnm);
    }

    private bpnm() {
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
            return GeneratedMessageLite.m124022a(f138421e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bpnl.f138420a, "c", "d"});
        } else if (i2 == 3) {
            return new bpnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f138421e);
            }
            if (i2 == 5) {
                return f138421e;
            }
            bxxk bxxk = f138422f;
            if (bxxk == null) {
                synchronized (bpnm.class) {
                    bxxk = f138422f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138421e);
                        f138422f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
