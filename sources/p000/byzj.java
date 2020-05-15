package p000;

/* renamed from: byzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byzj f169108b;

    /* renamed from: c */
    private static volatile bxxk f169109c;

    /* renamed from: a */
    public bxwc f169110a = bxxn.f165040b;

    static {
        byzj byzj = new byzj();
        f169108b = byzj;
        GeneratedMessageLite.m124024a(byzj.class, byzj);
    }

    private byzj() {
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
            return GeneratedMessageLite.m124022a(f169108b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new byzj();
        } else {
            if (i2 == 4) {
                return new bxvd(f169108b);
            }
            if (i2 == 5) {
                return f169108b;
            }
            bxxk bxxk = f169109c;
            if (bxxk == null) {
                synchronized (byzj.class) {
                    bxxk = f169109c;
                    if (bxxk == null) {
                        bxxk = new bxve(f169108b);
                        f169109c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
