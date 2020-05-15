package p000;

/* renamed from: bkjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkjw f124477d;

    /* renamed from: e */
    private static volatile bxxk f124478e;

    /* renamed from: a */
    public int f124479a;

    /* renamed from: b */
    public int f124480b;

    /* renamed from: c */
    public long f124481c;

    static {
        bkjw bkjw = new bkjw();
        f124477d = bkjw;
        GeneratedMessageLite.m124024a(bkjw.class, bkjw);
    }

    private bkjw() {
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
            return GeneratedMessageLite.m124022a(f124477d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bkjx.f124482a, "c"});
        } else if (i2 == 3) {
            return new bkjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f124477d);
            }
            if (i2 == 5) {
                return f124477d;
            }
            bxxk bxxk = f124478e;
            if (bxxk == null) {
                synchronized (bkjw.class) {
                    bxxk = f124478e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124477d);
                        f124478e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
