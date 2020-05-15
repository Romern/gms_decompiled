package p000;

/* renamed from: bpjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjl extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bpjl f137879m;

    /* renamed from: n */
    private static volatile bxxk f137880n;

    /* renamed from: a */
    public int f137881a;

    /* renamed from: b */
    public boolean f137882b;

    /* renamed from: c */
    public boolean f137883c;

    /* renamed from: d */
    public int f137884d;

    /* renamed from: e */
    public int f137885e = -1;

    /* renamed from: f */
    public boolean f137886f;

    /* renamed from: g */
    public String f137887g = "";

    /* renamed from: h */
    public boolean f137888h;

    /* renamed from: i */
    public int f137889i;

    /* renamed from: j */
    public int f137890j = -1;

    /* renamed from: k */
    public boolean f137891k;

    /* renamed from: l */
    public int f137892l;

    static {
        bpjl bpjl = new bpjl();
        f137879m = bpjl;
        bxvk.m124024a(bpjl.class, bpjl);
    }

    private bpjl() {
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
            return bxvk.m124022a(f137879m, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003\u0007ဇ\u0006\bဈ\u0007\tဇ\b\nဌ\t\u000eင\f\u000fဇ\r\u0010င\u000e", new Object[]{"a", "b", "c", "d", bphy.f137713a, "e", "f", "g", "h", "i", bpii.f137756a, "j", "k", "l"});
        } else if (i2 == 3) {
            return new bpjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f137879m);
            }
            if (i2 == 5) {
                return f137879m;
            }
            bxxk bxxk = f137880n;
            if (bxxk == null) {
                synchronized (bpjl.class) {
                    bxxk = f137880n;
                    if (bxxk == null) {
                        bxxk = new bxve(f137879m);
                        f137880n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
