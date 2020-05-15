package p000;

/* renamed from: bxjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxjd f163616c;

    /* renamed from: e */
    private static volatile bxxk f163617e;

    /* renamed from: a */
    public bxjl f163618a;

    /* renamed from: b */
    public bxik f163619b;

    /* renamed from: d */
    private int f163620d;

    static {
        bxjd bxjd = new bxjd();
        f163616c = bxjd;
        GeneratedMessageLite.m124024a(bxjd.class, bxjd);
    }

    private bxjd() {
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
            return GeneratedMessageLite.m124022a(f163616c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxjd();
        } else {
            if (i2 == 4) {
                return new bxvd(f163616c);
            }
            if (i2 == 5) {
                return f163616c;
            }
            bxxk bxxk = f163617e;
            if (bxxk == null) {
                synchronized (bxjd.class) {
                    bxxk = f163617e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163616c);
                        f163617e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
