package p000;

/* renamed from: avsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final avsp f93843d;

    /* renamed from: e */
    private static volatile bxxk f93844e;

    /* renamed from: a */
    public String f93845a = "";

    /* renamed from: b */
    public bxwc f93846b = bxxn.f165040b;

    /* renamed from: c */
    public avsq f93847c;

    static {
        avsp avsp = new avsp();
        f93843d = avsp;
        GeneratedMessageLite.m124024a(avsp.class, avsp);
    }

    private avsp() {
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
            return GeneratedMessageLite.m124022a(f93843d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new avsp();
        } else {
            if (i2 == 4) {
                return new avso();
            }
            if (i2 == 5) {
                return f93843d;
            }
            bxxk bxxk = f93844e;
            if (bxxk == null) {
                synchronized (avsp.class) {
                    bxxk = f93844e;
                    if (bxxk == null) {
                        bxxk = new bxve(f93843d);
                        f93844e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
