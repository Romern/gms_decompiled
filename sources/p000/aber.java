package p000;

/* renamed from: aber */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aber extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aber f57284b;

    /* renamed from: c */
    private static volatile bxxk f57285c;

    /* renamed from: a */
    public bxwc f57286a = bxxn.f165040b;

    static {
        aber aber = new aber();
        f57284b = aber;
        GeneratedMessageLite.m124024a(aber.class, aber);
    }

    private aber() {
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
            return GeneratedMessageLite.m124022a(f57284b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abep.class});
        } else if (i2 == 3) {
            return new aber();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57284b;
            }
            bxxk bxxk = f57285c;
            if (bxxk == null) {
                synchronized (aber.class) {
                    bxxk = f57285c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57284b);
                        f57285c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
