package p000;

/* renamed from: kdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final kdh f23882b;

    /* renamed from: c */
    private static volatile bxxk f23883c;

    /* renamed from: a */
    public bxwc f23884a = bxxn.f165040b;

    static {
        kdh kdh = new kdh();
        f23882b = kdh;
        GeneratedMessageLite.m124024a(kdh.class, kdh);
    }

    private kdh() {
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
            return GeneratedMessageLite.m124022a(f23882b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", kdg.class});
        } else if (i2 == 3) {
            return new kdh();
        } else {
            if (i2 == 4) {
                return new bxvd(f23882b);
            }
            if (i2 == 5) {
                return f23882b;
            }
            bxxk bxxk = f23883c;
            if (bxxk == null) {
                synchronized (kdh.class) {
                    bxxk = f23883c;
                    if (bxxk == null) {
                        bxxk = new bxve(f23882b);
                        f23883c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
