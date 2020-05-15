package p000;

/* renamed from: cako */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cako extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cako f175025b;

    /* renamed from: c */
    private static volatile bxxk f175026c;

    /* renamed from: a */
    public int f175027a;

    static {
        cako cako = new cako();
        f175025b = cako;
        bxvk.m124024a(cako.class, cako);
    }

    private cako() {
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
            return bxvk.m124022a(f175025b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cako();
        } else {
            if (i2 == 4) {
                return new bxvd(f175025b);
            }
            if (i2 == 5) {
                return f175025b;
            }
            bxxk bxxk = f175026c;
            if (bxxk == null) {
                synchronized (cako.class) {
                    bxxk = f175026c;
                    if (bxxk == null) {
                        bxxk = new bxve(f175025b);
                        f175026c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
