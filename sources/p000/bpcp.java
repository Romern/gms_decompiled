package p000;

/* renamed from: bpcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcp extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpcp f135812j;

    /* renamed from: k */
    private static volatile bxxk f135813k;

    /* renamed from: a */
    public int f135814a;

    /* renamed from: b */
    public String f135815b = "";

    /* renamed from: c */
    public int f135816c;

    /* renamed from: d */
    public int f135817d;

    /* renamed from: e */
    public int f135818e;

    /* renamed from: f */
    public int f135819f;

    /* renamed from: g */
    public String f135820g = "";

    /* renamed from: h */
    public int f135821h;

    /* renamed from: i */
    public int f135822i;

    static {
        bpcp bpcp = new bpcp();
        f135812j = bpcp;
        bxvk.m124024a(bpcp.class, bpcp);
    }

    private bpcp() {
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
            return bxvk.m124022a(f135812j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဋ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bpcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f135812j);
            }
            if (i2 == 5) {
                return f135812j;
            }
            bxxk bxxk = f135813k;
            if (bxxk == null) {
                synchronized (bpcp.class) {
                    bxxk = f135813k;
                    if (bxxk == null) {
                        bxxk = new bxve(f135812j);
                        f135813k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
