package p000;

/* renamed from: bopn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bopn f134145h;

    /* renamed from: i */
    private static volatile bxxk f134146i;

    /* renamed from: a */
    public String f134147a = "";

    /* renamed from: b */
    public String f134148b = "";

    /* renamed from: c */
    public int f134149c;

    /* renamed from: d */
    public long f134150d;

    /* renamed from: e */
    public long f134151e;

    /* renamed from: f */
    public int f134152f;

    /* renamed from: g */
    public int f134153g;

    static {
        bopn bopn = new bopn();
        f134145h = bopn;
        GeneratedMessageLite.m124024a(bopn.class, bopn);
    }

    private bopn() {
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
            return GeneratedMessageLite.m124022a(f134145h, "\u0000\u0007\u0000\u0000\u0002\b\u0007\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u0002\u0006\u0002\u0007\u0004\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bopn();
        } else {
            if (i2 == 4) {
                return new bxvd(f134145h);
            }
            if (i2 == 5) {
                return f134145h;
            }
            bxxk bxxk = f134146i;
            if (bxxk == null) {
                synchronized (bopn.class) {
                    bxxk = f134146i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134145h);
                        f134146i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
