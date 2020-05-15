package p000;

/* renamed from: bpnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpnp f138429f;

    /* renamed from: g */
    private static volatile bxxk f138430g;

    /* renamed from: a */
    public int f138431a;

    /* renamed from: b */
    public int f138432b;

    /* renamed from: c */
    public int f138433c;

    /* renamed from: d */
    public int f138434d;

    /* renamed from: e */
    public int f138435e;

    static {
        bpnp bpnp = new bpnp();
        f138429f = bpnp;
        GeneratedMessageLite.m124024a(bpnp.class, bpnp);
    }

    private bpnp() {
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
            return GeneratedMessageLite.m124022a(f138429f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", bpnn.f138427a, "c", bpno.f138428a, "d", bpnq.f138436a, "e"});
        } else if (i2 == 3) {
            return new bpnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f138429f);
            }
            if (i2 == 5) {
                return f138429f;
            }
            bxxk bxxk = f138430g;
            if (bxxk == null) {
                synchronized (bpnp.class) {
                    bxxk = f138430g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138429f);
                        f138430g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
