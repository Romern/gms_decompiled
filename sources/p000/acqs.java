package p000;

/* renamed from: acqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final acqs f60532b;

    /* renamed from: d */
    private static volatile bxxk f60533d;

    /* renamed from: a */
    public acqn f60534a;

    /* renamed from: c */
    private int f60535c;

    static {
        acqs acqs = new acqs();
        f60532b = acqs;
        GeneratedMessageLite.m124024a(acqs.class, acqs);
    }

    private acqs() {
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
            return GeneratedMessageLite.m124022a(f60532b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new acqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f60532b);
            }
            if (i2 == 5) {
                return f60532b;
            }
            bxxk bxxk = f60533d;
            if (bxxk == null) {
                synchronized (acqs.class) {
                    bxxk = f60533d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60532b);
                        f60533d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
