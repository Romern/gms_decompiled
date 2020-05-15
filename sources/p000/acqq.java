package p000;

/* renamed from: acqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final acqq f60521f;

    /* renamed from: g */
    private static volatile bxxk f60522g;

    /* renamed from: a */
    public int f60523a;

    /* renamed from: b */
    public boolean f60524b;

    /* renamed from: c */
    public bxwc f60525c = bxxn.f165040b;

    /* renamed from: d */
    public int f60526d;

    /* renamed from: e */
    public boolean f60527e;

    static {
        acqq acqq = new acqq();
        f60521f = acqq;
        GeneratedMessageLite.m124024a(acqq.class, acqq);
    }

    private acqq() {
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
            return GeneratedMessageLite.m124022a(f60521f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003င\u0001\u0004ဇ\u0002", new Object[]{"a", "b", "c", acqp.class, "d", "e"});
        } else if (i2 == 3) {
            return new acqq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f60521f;
            }
            bxxk bxxk = f60522g;
            if (bxxk == null) {
                synchronized (acqq.class) {
                    bxxk = f60522g;
                    if (bxxk == null) {
                        bxxk = new bxve(f60521f);
                        f60522g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
