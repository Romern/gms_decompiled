package p000;

/* renamed from: bmdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmdx f128886d;

    /* renamed from: g */
    private static volatile bxxk f128887g;

    /* renamed from: a */
    public int f128888a = 0;

    /* renamed from: b */
    public Object f128889b;

    /* renamed from: c */
    public boolean f128890c;

    /* renamed from: e */
    private int f128891e;

    /* renamed from: f */
    private byte f128892f = 2;

    static {
        bmdx bmdx = new bmdx();
        f128886d = bmdx;
        GeneratedMessageLite.m124024a(bmdx.class, bmdx);
    }

    private bmdx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128892f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128892f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128886d, "\u0001\u000f\u0001\u0001\u0001\u0011\u000f\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဇ\u000e\u0007ြ\u0000\bြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ᐼ\u0000", new Object[]{"b", "a", "e", bmqf.class, bmbr.class, bmnr.class, bmds.class, bmji.class, "c", bmdu.class, bmbt.class, bmdb.class, bwhm.class, bmno.class, bmoh.class, bmnj.class, bmel.class, bmcb.class});
        } else if (i2 == 3) {
            return new bmdx();
        } else {
            if (i2 == 4) {
                return new bxvd(f128886d);
            }
            if (i2 == 5) {
                return f128886d;
            }
            bxxk bxxk = f128887g;
            if (bxxk == null) {
                synchronized (bmdx.class) {
                    bxxk = f128887g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128886d);
                        f128887g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
