package p000;

/* renamed from: bwqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwqs f160717b;

    /* renamed from: c */
    public static final bxvj f160718c;

    /* renamed from: d */
    private static volatile bxxk f160719d;

    /* renamed from: a */
    public bxwc f160720a = bxxn.f165040b;

    static {
        bwqs bwqs = new bwqs();
        f160717b = bwqs;
        GeneratedMessageLite.m124024a(bwqs.class, bwqs);
        bwog bwog = bwog.f160437f;
        bwqs bwqs2 = f160717b;
        f160718c = GeneratedMessageLite.m124006a(bwog, bwqs2, bwqs2, 280087160, bxzf.MESSAGE);
    }

    private bwqs() {
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
            return GeneratedMessageLite.m124022a(f160717b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwqs();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f160717b;
            }
            bxxk bxxk = f160719d;
            if (bxxk == null) {
                synchronized (bwqs.class) {
                    bxxk = f160719d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160717b);
                        f160719d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
