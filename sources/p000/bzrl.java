package p000;

/* renamed from: bzrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzrl f171159b;

    /* renamed from: d */
    private static volatile bxxk f171160d;

    /* renamed from: a */
    public String f171161a = "";

    /* renamed from: c */
    private int f171162c;

    static {
        bzrl bzrl = new bzrl();
        f171159b = bzrl;
        GeneratedMessageLite.m124024a(bzrl.class, bzrl);
    }

    private bzrl() {
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
            return GeneratedMessageLite.m124022a(f171159b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0006", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzrl();
        } else {
            if (i2 == 4) {
                return new bxvd(f171159b);
            }
            if (i2 == 5) {
                return f171159b;
            }
            bxxk bxxk = f171160d;
            if (bxxk == null) {
                synchronized (bzrl.class) {
                    bxxk = f171160d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171159b);
                        f171160d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
