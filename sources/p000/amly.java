package p000;

/* renamed from: amly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amly extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amly f75240d;

    /* renamed from: e */
    private static volatile bxxk f75241e;

    /* renamed from: a */
    public int f75242a;

    /* renamed from: b */
    public int f75243b;

    /* renamed from: c */
    public boolean f75244c;

    static {
        amly amly = new amly();
        f75240d = amly;
        GeneratedMessageLite.m124024a(amly.class, amly);
    }

    private amly() {
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
            return GeneratedMessageLite.m124022a(f75240d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", amju.f75015a, "c"});
        } else if (i2 == 3) {
            return new amly();
        } else {
            if (i2 == 4) {
                return new bxvd(f75240d);
            }
            if (i2 == 5) {
                return f75240d;
            }
            bxxk bxxk = f75241e;
            if (bxxk == null) {
                synchronized (amly.class) {
                    bxxk = f75241e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75240d);
                        f75241e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
