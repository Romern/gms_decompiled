package p000;

/* renamed from: boxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boxn f135262g;

    /* renamed from: i */
    private static volatile bxxk f135263i;

    /* renamed from: a */
    public int f135264a;

    /* renamed from: b */
    public String f135265b = "";

    /* renamed from: c */
    public int f135266c;

    /* renamed from: d */
    public String f135267d = "";

    /* renamed from: e */
    public int f135268e;

    /* renamed from: f */
    public int f135269f;

    /* renamed from: h */
    private boolean f135270h;

    static {
        boxn boxn = new boxn();
        f135262g = boxn;
        bxvk.m124024a(boxn.class, boxn);
    }

    private boxn() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m111642a(boxn boxn) {
        boxn.f135264a |= 2;
        boxn.f135270h = false;
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
            return bxvk.m124022a(f135262g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "h", "c", boxm.f135261a, "d", "e", boxk.f135260a, "f", bpbh.f135598a});
        } else if (i2 == 3) {
            return new boxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f135262g);
            }
            if (i2 == 5) {
                return f135262g;
            }
            bxxk bxxk = f135263i;
            if (bxxk == null) {
                synchronized (boxn.class) {
                    bxxk = f135263i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135262g);
                        f135263i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
