package p000;

/* renamed from: cabn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabn f172454c;

    /* renamed from: e */
    private static volatile bxxk f172455e;

    /* renamed from: a */
    public caae f172456a;

    /* renamed from: b */
    public bxwc f172457b = bxxn.f165040b;

    /* renamed from: d */
    private int f172458d;

    static {
        cabn cabn = new cabn();
        f172454c = cabn;
        GeneratedMessageLite.m124024a(cabn.class, cabn);
    }

    private cabn() {
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
            return GeneratedMessageLite.m124022a(f172454c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", caaa.class});
        } else if (i2 == 3) {
            return new cabn();
        } else {
            if (i2 == 4) {
                return new bxvd(f172454c);
            }
            if (i2 == 5) {
                return f172454c;
            }
            bxxk bxxk = f172455e;
            if (bxxk == null) {
                synchronized (cabn.class) {
                    bxxk = f172455e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172454c);
                        f172455e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
