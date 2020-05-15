package p000;

/* renamed from: btbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btbq f148199c;

    /* renamed from: d */
    private static volatile bxxk f148200d;

    /* renamed from: a */
    public String f148201a = "";

    /* renamed from: b */
    public int f148202b;

    static {
        btbq btbq = new btbq();
        f148199c = btbq;
        GeneratedMessageLite.m124024a(btbq.class, btbq);
    }

    private btbq() {
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
            return GeneratedMessageLite.m124022a(f148199c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f148199c);
            }
            if (i2 == 5) {
                return f148199c;
            }
            bxxk bxxk = f148200d;
            if (bxxk == null) {
                synchronized (btbq.class) {
                    bxxk = f148200d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148199c);
                        f148200d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
