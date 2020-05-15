package p000;

/* renamed from: byyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyv extends bxvg implements bxvh {

    /* renamed from: h */
    public static final byyv f169022h;

    /* renamed from: j */
    private static volatile bxxk f169023j;

    /* renamed from: a */
    public int f169024a;

    /* renamed from: b */
    public String f169025b = "";

    /* renamed from: c */
    public String f169026c = "";

    /* renamed from: d */
    public int f169027d;

    /* renamed from: e */
    public String f169028e = "";

    /* renamed from: f */
    public int f169029f;

    /* renamed from: g */
    public float f169030g;

    /* renamed from: i */
    private byte f169031i = 2;

    static {
        byyv byyv = new byyv();
        f169022h = byyv;
        bxvk.m124024a(byyv.class, byyv);
    }

    private byyv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169031i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169031i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169022h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0006င\u0004\u0007ခ\u0005", new Object[]{"a", "b", "c", "d", bzbl.f169258a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new byyv();
        } else {
            if (i2 == 4) {
                return new bxvf(f169022h);
            }
            if (i2 == 5) {
                return f169022h;
            }
            bxxk bxxk = f169023j;
            if (bxxk == null) {
                synchronized (byyv.class) {
                    bxxk = f169023j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169022h);
                        f169023j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
