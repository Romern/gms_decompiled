package p000;

/* renamed from: bqyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqyf f141935c;

    /* renamed from: d */
    private static volatile bxxk f141936d;

    /* renamed from: a */
    public int f141937a;

    /* renamed from: b */
    public String f141938b = "";

    static {
        bqyf bqyf = new bqyf();
        f141935c = bqyf;
        GeneratedMessageLite.m124024a(bqyf.class, bqyf);
    }

    private bqyf() {
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
            return GeneratedMessageLite.m124022a(f141935c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f141935c);
            }
            if (i2 == 5) {
                return f141935c;
            }
            bxxk bxxk = f141936d;
            if (bxxk == null) {
                synchronized (bqyf.class) {
                    bxxk = f141936d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141935c);
                        f141936d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
