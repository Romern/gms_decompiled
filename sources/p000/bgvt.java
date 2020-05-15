package p000;

/* renamed from: bgvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bgvt f117740e;

    /* renamed from: f */
    private static volatile bxxk f117741f;

    /* renamed from: a */
    public int f117742a;

    /* renamed from: b */
    public String f117743b = "";

    /* renamed from: c */
    public long f117744c;

    /* renamed from: d */
    public bgvs f117745d;

    static {
        bgvt bgvt = new bgvt();
        f117740e = bgvt;
        bxvk.m124024a(bgvt.class, bgvt);
    }

    private bgvt() {
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
            return bxvk.m124022a(f117740e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bgvt();
        } else {
            if (i2 == 4) {
                return new bxvd(f117740e);
            }
            if (i2 == 5) {
                return f117740e;
            }
            bxxk bxxk = f117741f;
            if (bxxk == null) {
                synchronized (bgvt.class) {
                    bxxk = f117741f;
                    if (bxxk == null) {
                        bxxk = new bxve(f117740e);
                        f117741f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
