package p000;

/* renamed from: tns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tns extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final tns f46340l;

    /* renamed from: m */
    private static volatile bxxk f46341m;

    /* renamed from: a */
    public int f46342a;

    /* renamed from: b */
    public String f46343b = "";

    /* renamed from: c */
    public bxvt f46344c = bxvm.f164965b;

    /* renamed from: d */
    public long f46345d;

    /* renamed from: e */
    public long f46346e;

    /* renamed from: f */
    public long f46347f;

    /* renamed from: g */
    public long f46348g;

    /* renamed from: h */
    public long f46349h;

    /* renamed from: i */
    public long f46350i;

    /* renamed from: j */
    public long f46351j;

    /* renamed from: k */
    public long f46352k;

    static {
        tns tns = new tns();
        f46340l = tns;
        GeneratedMessageLite.m124024a(tns.class, tns);
    }

    private tns() {
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
            return GeneratedMessageLite.m124022a(f46340l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new tns();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f46340l;
            }
            bxxk bxxk = f46341m;
            if (bxxk == null) {
                synchronized (tns.class) {
                    bxxk = f46341m;
                    if (bxxk == null) {
                        bxxk = new bxve(f46340l);
                        f46341m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
