package p000;

/* renamed from: bydc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bydc f165756b;

    /* renamed from: c */
    private static volatile bxxk f165757c;

    /* renamed from: a */
    public bxwc f165758a = bxxn.f165040b;

    static {
        bydc bydc = new bydc();
        f165756b = bydc;
        GeneratedMessageLite.m124024a(bydc.class, bydc);
    }

    private bydc() {
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
            return GeneratedMessageLite.m124022a(f165756b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bydc();
        } else {
            if (i2 == 4) {
                return new bydb();
            }
            if (i2 == 5) {
                return f165756b;
            }
            bxxk bxxk = f165757c;
            if (bxxk == null) {
                synchronized (bydc.class) {
                    bxxk = f165757c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165756b);
                        f165757c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
