package p000;

/* renamed from: qoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoi extends bxvk implements bxxd {

    /* renamed from: m */
    public static final qoi f41846m;

    /* renamed from: n */
    private static volatile bxxk f41847n;

    /* renamed from: a */
    public int f41848a;

    /* renamed from: b */
    public long f41849b;

    /* renamed from: c */
    public String f41850c = "";

    /* renamed from: d */
    public String f41851d = "";

    /* renamed from: e */
    public int f41852e;

    /* renamed from: f */
    public boolean f41853f;

    /* renamed from: g */
    public int f41854g;

    /* renamed from: h */
    public long f41855h;

    /* renamed from: i */
    public boolean f41856i;

    /* renamed from: j */
    public long f41857j;

    /* renamed from: k */
    public int f41858k;

    /* renamed from: l */
    public boolean f41859l;

    static {
        qoi qoi = new qoi();
        f41846m = qoi;
        bxvk.m124024a(qoi.class, qoi);
    }

    private qoi() {
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
            return bxvk.m124022a(f41846m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nင\t\u000bဇ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new qoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f41846m);
            }
            if (i2 == 5) {
                return f41846m;
            }
            bxxk bxxk = f41847n;
            if (bxxk == null) {
                synchronized (qoi.class) {
                    bxxk = f41847n;
                    if (bxxk == null) {
                        bxxk = new bxve(f41846m);
                        f41847n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
