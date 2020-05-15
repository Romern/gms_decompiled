package p000;

/* renamed from: blqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blqc f127316f;

    /* renamed from: g */
    private static volatile bxxk f127317g;

    /* renamed from: a */
    public int f127318a;

    /* renamed from: b */
    public blrk f127319b;

    /* renamed from: c */
    public long f127320c;

    /* renamed from: d */
    public int f127321d;

    /* renamed from: e */
    public boolean f127322e;

    static {
        blqc blqc = new blqc();
        f127316f = blqc;
        GeneratedMessageLite.m124024a(blqc.class, blqc);
    }

    private blqc() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f127316f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဃ\u0001\u0005ဌ\u0003\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", blqb.f127315a, "e"});
        } else if (i2 == 3) {
            return new blqc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127316f);
            }
            if (i2 == 5) {
                return f127316f;
            }
            bxxk bxxk = f127317g;
            if (bxxk == null) {
                synchronized (blqc.class) {
                    bxxk = f127317g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127316f);
                        f127317g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
