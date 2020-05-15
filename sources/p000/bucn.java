package p000;

/* renamed from: bucn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bucn f153382e;

    /* renamed from: g */
    private static volatile bxxk f153383g;

    /* renamed from: a */
    public int f153384a;

    /* renamed from: b */
    public long f153385b;

    /* renamed from: c */
    public int f153386c;

    /* renamed from: d */
    public int f153387d;

    /* renamed from: f */
    private int f153388f;

    static {
        bucn bucn = new bucn();
        f153382e = bucn;
        bxvk.m124024a(bucn.class, bucn);
    }

    private bucn() {
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
            return bxvk.m124022a(f153382e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"f", "a", bucl.f153381a, "b", "c", bucf.f153341a, "d", buce.m119319b()});
        } else if (i2 == 3) {
            return new bucn();
        } else {
            if (i2 == 4) {
                return new bxvd(f153382e);
            }
            if (i2 == 5) {
                return f153382e;
            }
            bxxk bxxk = f153383g;
            if (bxxk == null) {
                synchronized (bucn.class) {
                    bxxk = f153383g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153382e);
                        f153383g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
