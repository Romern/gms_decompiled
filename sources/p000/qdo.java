package p000;

/* renamed from: qdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final qdo f40992c;

    /* renamed from: d */
    private static volatile bxxk f40993d;

    /* renamed from: a */
    public int f40994a;

    /* renamed from: b */
    public String f40995b = "";

    static {
        qdo qdo = new qdo();
        f40992c = qdo;
        GeneratedMessageLite.m124024a(qdo.class, qdo);
    }

    private qdo() {
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
            return GeneratedMessageLite.m124022a(f40992c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new qdo();
        } else {
            if (i2 == 4) {
                return new bxvd(f40992c);
            }
            if (i2 == 5) {
                return f40992c;
            }
            bxxk bxxk = f40993d;
            if (bxxk == null) {
                synchronized (qdo.class) {
                    bxxk = f40993d;
                    if (bxxk == null) {
                        bxxk = new bxve(f40992c);
                        f40993d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
