package p000;

/* renamed from: bumz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bumz f154283e;

    /* renamed from: f */
    private static volatile bxxk f154284f;

    /* renamed from: a */
    public int f154285a;

    /* renamed from: b */
    public int f154286b = 1;

    /* renamed from: c */
    public int f154287c = 1;

    /* renamed from: d */
    public int f154288d;

    static {
        bumz bumz = new bumz();
        f154283e = bumz;
        GeneratedMessageLite.m124024a(bumz.class, bumz);
    }

    private bumz() {
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
            return GeneratedMessageLite.m124022a(f154283e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", bumx.f154282a, "c", bumv.f154281a, "d"});
        } else if (i2 == 3) {
            return new bumz();
        } else {
            if (i2 == 4) {
                return new bxvd(f154283e);
            }
            if (i2 == 5) {
                return f154283e;
            }
            bxxk bxxk = f154284f;
            if (bxxk == null) {
                synchronized (bumz.class) {
                    bxxk = f154284f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154283e);
                        f154284f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
