package p000;

/* renamed from: bywb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bywb f168551c;

    /* renamed from: d */
    private static volatile bxxk f168552d;

    /* renamed from: a */
    public int f168553a;

    /* renamed from: b */
    public int f168554b;

    static {
        bywb bywb = new bywb();
        f168551c = bywb;
        GeneratedMessageLite.m124024a(bywb.class, bywb);
    }

    private bywb() {
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
            return GeneratedMessageLite.m124022a(f168551c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bywb();
        } else {
            if (i2 == 4) {
                return new bxvd(f168551c);
            }
            if (i2 == 5) {
                return f168551c;
            }
            bxxk bxxk = f168552d;
            if (bxxk == null) {
                synchronized (bywb.class) {
                    bxxk = f168552d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168551c);
                        f168552d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
