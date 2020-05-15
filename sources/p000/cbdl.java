package p000;

/* renamed from: cbdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbdl f176754d;

    /* renamed from: e */
    private static volatile bxxk f176755e;

    /* renamed from: a */
    public int f176756a = 0;

    /* renamed from: b */
    public Object f176757b;

    /* renamed from: c */
    public int f176758c;

    static {
        cbdl cbdl = new cbdl();
        f176754d = cbdl;
        GeneratedMessageLite.m124024a(cbdl.class, cbdl);
    }

    private cbdl() {
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
            return GeneratedMessageLite.m124022a(f176754d, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000fȻ\u0000g<\u0000", new Object[]{"b", "a", "c", cbea.class, cbdi.class});
        } else if (i2 == 3) {
            return new cbdl();
        } else {
            if (i2 == 4) {
                return new bxvd(f176754d);
            }
            if (i2 == 5) {
                return f176754d;
            }
            bxxk bxxk = f176755e;
            if (bxxk == null) {
                synchronized (cbdl.class) {
                    bxxk = f176755e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176754d);
                        f176755e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
