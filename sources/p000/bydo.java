package p000;

/* renamed from: bydo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bydo f165818a;

    /* renamed from: e */
    private static volatile bxxk f165819e;

    /* renamed from: b */
    private int f165820b;

    /* renamed from: c */
    private bydm f165821c;

    /* renamed from: d */
    private byte f165822d = 2;

    static {
        bydo bydo = new bydo();
        f165818a = bydo;
        GeneratedMessageLite.m124024a(bydo.class, bydo);
    }

    private bydo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165822d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165822d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165818a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bydo();
        } else {
            if (i2 == 4) {
                return new bxvd(f165818a);
            }
            if (i2 == 5) {
                return f165818a;
            }
            bxxk bxxk = f165819e;
            if (bxxk == null) {
                synchronized (bydo.class) {
                    bxxk = f165819e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165818a);
                        f165819e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
