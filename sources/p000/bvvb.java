package p000;

/* renamed from: bvvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvb extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvvb f157779h;

    /* renamed from: i */
    private static volatile bxxk f157780i;

    /* renamed from: a */
    public int f157781a;

    /* renamed from: b */
    public String f157782b = "";

    /* renamed from: c */
    public String f157783c = "";

    /* renamed from: d */
    public String f157784d = "";

    /* renamed from: e */
    public String f157785e = "";

    /* renamed from: f */
    public String f157786f = "";

    /* renamed from: g */
    public boolean f157787g;

    static {
        bvvb bvvb = new bvvb();
        f157779h = bvvb;
        bxvk.m124024a(bvvb.class, bvvb);
    }

    private bvvb() {
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
            return bxvk.m124022a(f157779h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f157779h);
            }
            if (i2 == 5) {
                return f157779h;
            }
            bxxk bxxk = f157780i;
            if (bxxk == null) {
                synchronized (bvvb.class) {
                    bxxk = f157780i;
                    if (bxxk == null) {
                        bxxk = new bxve(f157779h);
                        f157780i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
