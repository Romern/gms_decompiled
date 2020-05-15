package p000;

/* renamed from: brau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brau extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brau f142188c;

    /* renamed from: d */
    private static volatile bxxk f142189d;

    /* renamed from: a */
    public int f142190a;

    /* renamed from: b */
    public brak f142191b;

    static {
        brau brau = new brau();
        f142188c = brau;
        GeneratedMessageLite.m124024a(brau.class, brau);
    }

    private brau() {
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
            return GeneratedMessageLite.m124022a(f142188c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brau();
        } else {
            if (i2 == 4) {
                return new bxvd(f142188c);
            }
            if (i2 == 5) {
                return f142188c;
            }
            bxxk bxxk = f142189d;
            if (bxxk == null) {
                synchronized (brau.class) {
                    bxxk = f142189d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142188c);
                        f142189d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
