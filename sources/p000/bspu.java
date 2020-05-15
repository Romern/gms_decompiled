package p000;

/* renamed from: bspu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bspu f146587f;

    /* renamed from: g */
    private static volatile bxxk f146588g;

    /* renamed from: a */
    public int f146589a;

    /* renamed from: b */
    public int f146590b;

    /* renamed from: c */
    public int f146591c;

    /* renamed from: d */
    public String f146592d = "";

    /* renamed from: e */
    public String f146593e = "";

    static {
        bspu bspu = new bspu();
        f146587f = bspu;
        GeneratedMessageLite.m124024a(bspu.class, bspu);
    }

    private bspu() {
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
            return GeneratedMessageLite.m124022a(f146587f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", bspt.f146586a, "d", "e"});
        } else if (i2 == 3) {
            return new bspu();
        } else {
            if (i2 == 4) {
                return new bxvd(f146587f);
            }
            if (i2 == 5) {
                return f146587f;
            }
            bxxk bxxk = f146588g;
            if (bxxk == null) {
                synchronized (bspu.class) {
                    bxxk = f146588g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146587f);
                        f146588g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
