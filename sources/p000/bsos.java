package p000;

/* renamed from: bsos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsos extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsos f146416g;

    /* renamed from: h */
    private static volatile bxxk f146417h;

    /* renamed from: a */
    public int f146418a;

    /* renamed from: b */
    public String f146419b = "";

    /* renamed from: c */
    public int f146420c;

    /* renamed from: d */
    public int f146421d;

    /* renamed from: e */
    public int f146422e;

    /* renamed from: f */
    public bspi f146423f;

    static {
        bsos bsos = new bsos();
        f146416g = bsos;
        bxvk.m124024a(bsos.class, bsos);
    }

    private bsos() {
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
            return bxvk.m124022a(f146416g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", bsoq.f146415a, "f"});
        } else if (i2 == 3) {
            return new bsos();
        } else {
            if (i2 == 4) {
                return new bxvd(f146416g);
            }
            if (i2 == 5) {
                return f146416g;
            }
            bxxk bxxk = f146417h;
            if (bxxk == null) {
                synchronized (bsos.class) {
                    bxxk = f146417h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146416g);
                        f146417h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
