package p000;

/* renamed from: msb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msb extends bxvk implements bxxd {

    /* renamed from: h */
    public static final msb f34514h;

    /* renamed from: i */
    private static volatile bxxk f34515i;

    /* renamed from: a */
    public int f34516a;

    /* renamed from: b */
    public boolean f34517b;

    /* renamed from: c */
    public boolean f34518c;

    /* renamed from: d */
    public boolean f34519d;

    /* renamed from: e */
    public boolean f34520e;

    /* renamed from: f */
    public long f34521f;

    /* renamed from: g */
    public boolean f34522g;

    static {
        msb msb = new msb();
        f34514h = msb;
        bxvk.m124024a(msb.class, msb);
    }

    private msb() {
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
            return bxvk.m124022a(f34514h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new msb();
        } else {
            if (i2 == 4) {
                return new bxvd(f34514h);
            }
            if (i2 == 5) {
                return f34514h;
            }
            bxxk bxxk = f34515i;
            if (bxxk == null) {
                synchronized (msb.class) {
                    bxxk = f34515i;
                    if (bxxk == null) {
                        bxxk = new bxve(f34514h);
                        f34515i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
