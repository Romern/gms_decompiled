package p000;

/* renamed from: boms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boms extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boms f133709d;

    /* renamed from: e */
    private static volatile bxxk f133710e;

    /* renamed from: a */
    public int f133711a;

    /* renamed from: b */
    public boolean f133712b;

    /* renamed from: c */
    public boolean f133713c;

    static {
        boms boms = new boms();
        f133709d = boms;
        GeneratedMessageLite.m124024a(boms.class, boms);
    }

    private boms() {
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
            return GeneratedMessageLite.m124022a(f133709d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boms();
        } else {
            if (i2 == 4) {
                return new bxvd(f133709d);
            }
            if (i2 == 5) {
                return f133709d;
            }
            bxxk bxxk = f133710e;
            if (bxxk == null) {
                synchronized (boms.class) {
                    bxxk = f133710e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133709d);
                        f133710e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
