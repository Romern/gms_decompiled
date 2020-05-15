package p000;

/* renamed from: byzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byzd f169059d;

    /* renamed from: e */
    private static volatile bxxk f169060e;

    /* renamed from: a */
    public int f169061a;

    /* renamed from: b */
    public int f169062b;

    /* renamed from: c */
    public int f169063c;

    static {
        byzd byzd = new byzd();
        f169059d = byzd;
        GeneratedMessageLite.m124024a(byzd.class, byzd);
    }

    private byzd() {
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
            return GeneratedMessageLite.m124022a(f169059d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byzd();
        } else {
            if (i2 == 4) {
                return new bxvd(f169059d);
            }
            if (i2 == 5) {
                return f169059d;
            }
            bxxk bxxk = f169060e;
            if (bxxk == null) {
                synchronized (byzd.class) {
                    bxxk = f169060e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169059d);
                        f169060e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
