package p000;

/* renamed from: bzxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzxn f171778c;

    /* renamed from: d */
    private static volatile bxxk f171779d;

    /* renamed from: a */
    public int f171780a;

    /* renamed from: b */
    public camb f171781b;

    static {
        bzxn bzxn = new bzxn();
        f171778c = bzxn;
        GeneratedMessageLite.m124024a(bzxn.class, bzxn);
    }

    private bzxn() {
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
            return GeneratedMessageLite.m124022a(f171778c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f171778c);
            }
            if (i2 == 5) {
                return f171778c;
            }
            bxxk bxxk = f171779d;
            if (bxxk == null) {
                synchronized (bzxn.class) {
                    bxxk = f171779d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171778c);
                        f171779d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
