package p000;

/* renamed from: bpyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyi extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bpyi f139852o;

    /* renamed from: p */
    private static volatile bxxk f139853p;

    /* renamed from: a */
    public int f139854a;

    /* renamed from: b */
    public bpxz f139855b;

    /* renamed from: c */
    public int f139856c;

    /* renamed from: d */
    public String f139857d = "";

    /* renamed from: e */
    public int f139858e;

    /* renamed from: f */
    public boolean f139859f;

    /* renamed from: g */
    public boolean f139860g;

    /* renamed from: h */
    public bpyg f139861h;

    /* renamed from: i */
    public bpyh f139862i;

    /* renamed from: j */
    public long f139863j = -1;

    /* renamed from: k */
    public bxvt f139864k = bxvm.f164965b;

    /* renamed from: l */
    public boolean f139865l;

    /* renamed from: m */
    public boolean f139866m;

    /* renamed from: n */
    public String f139867n = "";

    static {
        bpyi bpyi = new bpyi();
        f139852o = bpyi;
        bxvk.m124024a(bpyi.class, bpyi);
    }

    private bpyi() {
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
            return bxvk.m124022a(f139852o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u000e\u0002ဌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဉ\u0000\bဉ\u0006\tဉ\u0007\nဂ\b\u000b\u001e\fဇ\f\rဇ\r", new Object[]{"a", "n", "c", bqaq.m112481b(), "d", "e", "f", "g", "b", "h", "i", "j", "k", bqao.m112477b(), "l", "m"});
        } else if (i2 == 3) {
            return new bpyi();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139852o;
            }
            bxxk bxxk = f139853p;
            if (bxxk == null) {
                synchronized (bpyi.class) {
                    bxxk = f139853p;
                    if (bxxk == null) {
                        bxxk = new bxve(f139852o);
                        f139853p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
