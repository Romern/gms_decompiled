package p000;

/* renamed from: blwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwa extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final blwa f127905j;

    /* renamed from: k */
    private static volatile bxxk f127906k;

    /* renamed from: a */
    public int f127907a;

    /* renamed from: b */
    public int f127908b;

    /* renamed from: c */
    public long f127909c;

    /* renamed from: d */
    public bwgu f127910d;

    /* renamed from: e */
    public int f127911e;

    /* renamed from: f */
    public int f127912f;

    /* renamed from: g */
    public int f127913g;

    /* renamed from: h */
    public String f127914h = "";

    /* renamed from: i */
    public int f127915i = -1;

    static {
        blwa blwa = new blwa();
        f127905j = blwa;
        GeneratedMessageLite.m124024a(blwa.class, blwa);
    }

    private blwa() {
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
            return GeneratedMessageLite.m124022a(f127905j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဈ\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", blvy.f127904a, "h", "i"});
        } else if (i2 == 3) {
            return new blwa();
        } else {
            if (i2 == 4) {
                return new bxvd(f127905j);
            }
            if (i2 == 5) {
                return f127905j;
            }
            bxxk bxxk = f127906k;
            if (bxxk == null) {
                synchronized (blwa.class) {
                    bxxk = f127906k;
                    if (bxxk == null) {
                        bxxk = new bxve(f127905j);
                        f127906k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
