package p000;

/* renamed from: bpkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkf extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpkf f137938j;

    /* renamed from: k */
    private static volatile bxxk f137939k;

    /* renamed from: a */
    public int f137940a;

    /* renamed from: b */
    public String f137941b = "";

    /* renamed from: c */
    public int f137942c;

    /* renamed from: d */
    public int f137943d;

    /* renamed from: e */
    public String f137944e = "";

    /* renamed from: f */
    public int f137945f;

    /* renamed from: g */
    public int f137946g;

    /* renamed from: h */
    public int f137947h;

    /* renamed from: i */
    public int f137948i;

    static {
        bpkf bpkf = new bpkf();
        f137938j = bpkf;
        bxvk.m124024a(bpkf.class, bpkf);
    }

    private bpkf() {
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
            return bxvk.m124022a(f137938j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", bpkc.f137935a, "h", bpke.f137937a, "i", bpkd.f137936a});
        } else if (i2 == 3) {
            return new bpkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f137938j);
            }
            if (i2 == 5) {
                return f137938j;
            }
            bxxk bxxk = f137939k;
            if (bxxk == null) {
                synchronized (bpkf.class) {
                    bxxk = f137939k;
                    if (bxxk == null) {
                        bxxk = new bxve(f137938j);
                        f137939k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
