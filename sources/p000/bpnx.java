package p000;

/* renamed from: bpnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnx extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpnx f138442j;

    /* renamed from: k */
    private static volatile bxxk f138443k;

    /* renamed from: a */
    public int f138444a;

    /* renamed from: b */
    public int f138445b;

    /* renamed from: c */
    public int f138446c;

    /* renamed from: d */
    public int f138447d;

    /* renamed from: e */
    public int f138448e;

    /* renamed from: f */
    public bpoj f138449f;

    /* renamed from: g */
    public bpoi f138450g;

    /* renamed from: h */
    public int f138451h;

    /* renamed from: i */
    public int f138452i;

    static {
        bpnx bpnx = new bpnx();
        f138442j = bpnx;
        bxvk.m124024a(bpnx.class, bpnx);
    }

    private bpnx() {
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
            return bxvk.m124022a(f138442j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0007ဉ\u0006\bဌ\u0007\tဌ\b", new Object[]{"a", "b", bpnu.f138439a, "c", bpnw.f138441a, "d", "e", bpnt.f138438a, "f", "g", "h", bpns.f138437a, "i", bpnv.f138440a});
        } else if (i2 == 3) {
            return new bpnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f138442j);
            }
            if (i2 == 5) {
                return f138442j;
            }
            bxxk bxxk = f138443k;
            if (bxxk == null) {
                synchronized (bpnx.class) {
                    bxxk = f138443k;
                    if (bxxk == null) {
                        bxxk = new bxve(f138442j);
                        f138443k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
