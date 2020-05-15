package p000;

/* renamed from: bzfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfc extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bzfc f169769n;

    /* renamed from: o */
    public static final bxvj f169770o;

    /* renamed from: p */
    private static volatile bxxk f169771p;

    /* renamed from: a */
    public int f169772a;

    /* renamed from: b */
    public bzfz f169773b;

    /* renamed from: c */
    public bxwc f169774c = bxxn.f165040b;

    /* renamed from: d */
    public bzga f169775d;

    /* renamed from: e */
    public bzex f169776e;

    /* renamed from: f */
    public bxwc f169777f = bxxn.f165040b;

    /* renamed from: g */
    public bzge f169778g;

    /* renamed from: h */
    public bzgb f169779h;

    /* renamed from: i */
    public bzgp f169780i;

    /* renamed from: j */
    public bzfs f169781j;

    /* renamed from: k */
    public bzfv f169782k;

    /* renamed from: l */
    public bzfu f169783l;

    /* renamed from: m */
    public bzgm f169784m;

    static {
        bzfc bzfc = new bzfc();
        f169769n = bzfc;
        bxvk.m124024a(bzfc.class, bzfc);
        blcc blcc = blcc.f125904a;
        bzfc bzfc2 = f169769n;
        f169770o = bxvk.m124006a(blcc, bzfc2, bzfc2, 71464408, bxzf.MESSAGE);
    }

    private bzfc() {
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
            return bxvk.m124022a(f169769n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\fဉ\b\rဉ\t", new Object[]{"a", "b", "c", bzgf.class, "d", "e", "f", bzex.class, "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bzfc();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f169769n;
            }
            bxxk bxxk = f169771p;
            if (bxxk == null) {
                synchronized (bzfc.class) {
                    bxxk = f169771p;
                    if (bxxk == null) {
                        bxxk = new bxve(f169769n);
                        f169771p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
