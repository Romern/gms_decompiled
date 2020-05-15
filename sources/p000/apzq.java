package p000;

/* renamed from: apzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final apzq f85282d;

    /* renamed from: e */
    private static volatile bxxk f85283e;

    /* renamed from: a */
    public int f85284a;

    /* renamed from: b */
    public String f85285b = "";

    /* renamed from: c */
    public int f85286c;

    static {
        apzq apzq = new apzq();
        f85282d = apzq;
        GeneratedMessageLite.m124024a(apzq.class, apzq);
    }

    private apzq() {
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
            return GeneratedMessageLite.m124022a(f85282d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f85282d);
            }
            if (i2 == 5) {
                return f85282d;
            }
            bxxk bxxk = f85283e;
            if (bxxk == null) {
                synchronized (apzq.class) {
                    bxxk = f85283e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85282d);
                        f85283e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
