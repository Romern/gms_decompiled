package p000;

/* renamed from: dmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final dmm f13541g;

    /* renamed from: h */
    private static volatile bxxk f13542h;

    /* renamed from: a */
    public int f13543a;

    /* renamed from: b */
    public int f13544b = 0;

    /* renamed from: c */
    public Object f13545c;

    /* renamed from: d */
    public String f13546d = "";

    /* renamed from: e */
    public int f13547e;

    /* renamed from: f */
    public int f13548f;

    static {
        dmm dmm = new dmm();
        f13541g = dmm;
        bxvk.m124024a(dmm.class, dmm);
    }

    private dmm() {
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
            return bxvk.m124022a(f13541g, "\u0001\b\u0001\u0001\u0001d\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003့\u0000\u0004ဴ\u0000\u0005်\u0000\u0006ျ\u0000\u0007ွ\u0000dင\u0007", new Object[]{"c", "b", "a", "d", "e", dmk.f13540a, "f"});
        } else if (i2 == 3) {
            return new dmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f13541g);
            }
            if (i2 == 5) {
                return f13541g;
            }
            bxxk bxxk = f13542h;
            if (bxxk == null) {
                synchronized (dmm.class) {
                    bxxk = f13542h;
                    if (bxxk == null) {
                        bxxk = new bxve(f13541g);
                        f13542h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
