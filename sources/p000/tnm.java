package p000;

/* renamed from: tnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final tnm f46298e;

    /* renamed from: f */
    private static volatile bxxk f46299f;

    /* renamed from: a */
    public int f46300a;

    /* renamed from: b */
    public long f46301b;

    /* renamed from: c */
    public String f46302c = "";

    /* renamed from: d */
    public int f46303d;

    static {
        tnm tnm = new tnm();
        f46298e = tnm;
        GeneratedMessageLite.m124024a(tnm.class, tnm);
    }

    private tnm() {
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
            return GeneratedMessageLite.m124022a(f46298e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", tnk.f46297a});
        } else if (i2 == 3) {
            return new tnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f46298e);
            }
            if (i2 == 5) {
                return f46298e;
            }
            bxxk bxxk = f46299f;
            if (bxxk == null) {
                synchronized (tnm.class) {
                    bxxk = f46299f;
                    if (bxxk == null) {
                        bxxk = new bxve(f46298e);
                        f46299f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
