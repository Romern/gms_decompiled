package p000;

/* renamed from: cact */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cact extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cact f172620b;

    /* renamed from: c */
    private static volatile bxxk f172621c;

    /* renamed from: a */
    public bxwc f172622a = bxxn.f165040b;

    static {
        cact cact = new cact();
        f172620b = cact;
        GeneratedMessageLite.m124024a(cact.class, cact);
    }

    private cact() {
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
            return GeneratedMessageLite.m124022a(f172620b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cacl.class});
        } else if (i2 == 3) {
            return new cact();
        } else {
            if (i2 == 4) {
                return new bxvd(f172620b);
            }
            if (i2 == 5) {
                return f172620b;
            }
            bxxk bxxk = f172621c;
            if (bxxk == null) {
                synchronized (cact.class) {
                    bxxk = f172621c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172620b);
                        f172621c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
