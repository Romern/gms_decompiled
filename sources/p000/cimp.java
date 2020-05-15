package p000;

/* renamed from: cimp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cimp f190758e;

    /* renamed from: f */
    private static volatile bxxk f190759f;

    /* renamed from: a */
    public int f190760a;

    /* renamed from: b */
    public bxwc f190761b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f190762c = bxxn.f165040b;

    /* renamed from: d */
    public cimn f190763d;

    static {
        cimp cimp = new cimp();
        f190758e = cimp;
        GeneratedMessageLite.m124024a(cimp.class, cimp);
    }

    private cimp() {
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
            return GeneratedMessageLite.m124022a(f190758e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", cims.class, "c", cimm.class, "d"});
        } else if (i2 == 3) {
            return new cimp();
        } else {
            if (i2 == 4) {
                return new cimo();
            }
            if (i2 == 5) {
                return f190758e;
            }
            bxxk bxxk = f190759f;
            if (bxxk == null) {
                synchronized (cimp.class) {
                    bxxk = f190759f;
                    if (bxxk == null) {
                        bxxk = new bxve(f190758e);
                        f190759f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
