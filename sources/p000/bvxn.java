package p000;

/* renamed from: bvxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxn extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvxn f158064j;

    /* renamed from: k */
    private static volatile bxxk f158065k;

    /* renamed from: a */
    public int f158066a;

    /* renamed from: b */
    public long f158067b;

    /* renamed from: c */
    public boolean f158068c;

    /* renamed from: d */
    public boolean f158069d;

    /* renamed from: e */
    public int f158070e;

    /* renamed from: f */
    public int f158071f;

    /* renamed from: g */
    public int f158072g = 1;

    /* renamed from: h */
    public bxwc f158073h = bxxn.f165040b;

    /* renamed from: i */
    public bvwg f158074i;

    static {
        bvxn bvxn = new bvxn();
        f158064j = bvxn;
        GeneratedMessageLite.m124024a(bvxn.class, bvxn);
    }

    private bvxn() {
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
            return GeneratedMessageLite.m124022a(f158064j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0007ဌ\u0006\n\u001b\fဉ\b", new Object[]{"a", "b", "c", "d", "e", bvxl.f158063a, "f", bvxj.f158062a, "g", bvxh.f158061a, "h", bvwc.class, "i"});
        } else if (i2 == 3) {
            return new bvxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f158064j);
            }
            if (i2 == 5) {
                return f158064j;
            }
            bxxk bxxk = f158065k;
            if (bxxk == null) {
                synchronized (bvxn.class) {
                    bxxk = f158065k;
                    if (bxxk == null) {
                        bxxk = new bxve(f158064j);
                        f158065k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
