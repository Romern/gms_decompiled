package p000;

/* renamed from: btan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btan extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btan f148012d;

    /* renamed from: e */
    private static volatile bxxk f148013e;

    /* renamed from: a */
    public String f148014a = "";

    /* renamed from: b */
    public btau f148015b;

    /* renamed from: c */
    public bszs f148016c;

    static {
        btan btan = new btan();
        f148012d = btan;
        GeneratedMessageLite.m124024a(btan.class, btan);
    }

    private btan() {
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
            return GeneratedMessageLite.m124022a(f148012d, "\u0000\u0003\u0000\u0000\u0001?\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t?\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btan();
        } else {
            if (i2 == 4) {
                return new bxvd(f148012d);
            }
            if (i2 == 5) {
                return f148012d;
            }
            bxxk bxxk = f148013e;
            if (bxxk == null) {
                synchronized (btan.class) {
                    bxxk = f148013e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148012d);
                        f148013e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
