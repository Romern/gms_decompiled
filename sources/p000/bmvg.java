package p000;

/* renamed from: bmvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmvg f131037f;

    /* renamed from: g */
    private static volatile bxxk f131038g;

    /* renamed from: a */
    public int f131039a;

    /* renamed from: b */
    public String f131040b = "";

    /* renamed from: c */
    public int f131041c;

    /* renamed from: d */
    public double f131042d;

    /* renamed from: e */
    public bmvh f131043e;

    static {
        bmvg bmvg = new bmvg();
        f131037f = bmvg;
        bxvk.m124024a(bmvg.class, bmvg);
    }

    private bmvg() {
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
            return bxvk.m124022a(f131037f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003က\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmvg();
        } else {
            if (i2 == 4) {
                return new bxvd(f131037f);
            }
            if (i2 == 5) {
                return f131037f;
            }
            bxxk bxxk = f131038g;
            if (bxxk == null) {
                synchronized (bmvg.class) {
                    bxxk = f131038g;
                    if (bxxk == null) {
                        bxxk = new bxve(f131037f);
                        f131038g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
