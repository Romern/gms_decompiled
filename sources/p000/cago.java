package p000;

/* renamed from: cago */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cago extends bxvg implements bxvh {

    /* renamed from: f */
    public static final cago f174485f;

    /* renamed from: h */
    private static volatile bxxk f174486h;

    /* renamed from: a */
    public int f174487a;

    /* renamed from: b */
    public long f174488b = -1;

    /* renamed from: c */
    public cahb f174489c;

    /* renamed from: d */
    public cags f174490d;

    /* renamed from: e */
    public bxwc f174491e = bxxn.f165040b;

    /* renamed from: g */
    private byte f174492g = 2;

    static {
        cago cago = new cago();
        f174485f = cago;
        bxvk.m124024a(cago.class, cago);
    }

    private cago() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174492g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174492g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f174485f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", cagr.class});
        } else if (i2 == 3) {
            return new cago();
        } else {
            if (i2 == 4) {
                return new bxvf(f174485f);
            }
            if (i2 == 5) {
                return f174485f;
            }
            bxxk bxxk = f174486h;
            if (bxxk == null) {
                synchronized (cago.class) {
                    bxxk = f174486h;
                    if (bxxk == null) {
                        bxxk = new bxve(f174485f);
                        f174486h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
