package p000;

/* renamed from: brci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brci extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final brci f142378g;

    /* renamed from: h */
    private static volatile bxxk f142379h;

    /* renamed from: a */
    public int f142380a;

    /* renamed from: b */
    public String f142381b = "";

    /* renamed from: c */
    public String f142382c = "";

    /* renamed from: d */
    public String f142383d = "";

    /* renamed from: e */
    public String f142384e = "";

    /* renamed from: f */
    public String f142385f = "";

    static {
        brci brci = new brci();
        f142378g = brci;
        GeneratedMessageLite.m124024a(brci.class, brci);
    }

    private brci() {
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
            return GeneratedMessageLite.m124022a(f142378g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0004\u0004ဈ\u0006\u0006ဈ\u0002\tဈ\u0005", new Object[]{"a", "b", "d", "f", "c", "e"});
        } else if (i2 == 3) {
            return new brci();
        } else {
            if (i2 == 4) {
                return new bxvd(f142378g);
            }
            if (i2 == 5) {
                return f142378g;
            }
            bxxk bxxk = f142379h;
            if (bxxk == null) {
                synchronized (brci.class) {
                    bxxk = f142379h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142378g);
                        f142379h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
