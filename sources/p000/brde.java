package p000;

/* renamed from: brde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brde extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brde f142493e;

    /* renamed from: g */
    private static volatile bxxk f142494g;

    /* renamed from: a */
    public bral f142495a;

    /* renamed from: b */
    public String f142496b = "";

    /* renamed from: c */
    public String f142497c = "";

    /* renamed from: d */
    public String f142498d = "";

    /* renamed from: f */
    private int f142499f;

    static {
        brde brde = new brde();
        f142493e = brde;
        GeneratedMessageLite.m124024a(brde.class, brde);
    }

    private brde() {
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
            return GeneratedMessageLite.m124022a(f142493e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brde();
        } else {
            if (i2 == 4) {
                return new bxvd(f142493e);
            }
            if (i2 == 5) {
                return f142493e;
            }
            bxxk bxxk = f142494g;
            if (bxxk == null) {
                synchronized (brde.class) {
                    bxxk = f142494g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142493e);
                        f142494g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
