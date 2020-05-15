package p000;

/* renamed from: bpwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpwd f139463b;

    /* renamed from: c */
    private static volatile bxxk f139464c;

    /* renamed from: a */
    public bxwc f139465a = bxxn.f165040b;

    static {
        bpwd bpwd = new bpwd();
        f139463b = bpwd;
        GeneratedMessageLite.m124024a(bpwd.class, bpwd);
    }

    private bpwd() {
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
            return GeneratedMessageLite.m124022a(f139463b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpwc.class});
        } else if (i2 == 3) {
            return new bpwd();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f139463b;
            }
            bxxk bxxk = f139464c;
            if (bxxk == null) {
                synchronized (bpwd.class) {
                    bxxk = f139464c;
                    if (bxxk == null) {
                        bxxk = new bxve(f139463b);
                        f139464c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
