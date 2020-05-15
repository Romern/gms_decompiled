package p000;

/* renamed from: bucb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bucb f153316e;

    /* renamed from: f */
    private static volatile bxxk f153317f;

    /* renamed from: a */
    public int f153318a;

    /* renamed from: b */
    public int f153319b;

    /* renamed from: c */
    public int f153320c;

    /* renamed from: d */
    public int f153321d;

    static {
        bucb bucb = new bucb();
        f153316e = bucb;
        bxvk.m124024a(bucb.class, bucb);
    }

    private bucb() {
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
            return bxvk.m124022a(f153316e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", buce.m119319b(), "c", bucs.m119337b(), "d"});
        } else if (i2 == 3) {
            return new bucb();
        } else {
            if (i2 == 4) {
                return new bxvd(f153316e);
            }
            if (i2 == 5) {
                return f153316e;
            }
            bxxk bxxk = f153317f;
            if (bxxk == null) {
                synchronized (bucb.class) {
                    bxxk = f153317f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153316e);
                        f153317f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
