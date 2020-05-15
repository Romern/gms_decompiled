package p000;

/* renamed from: bvov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvov extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvov f157222g;

    /* renamed from: h */
    private static volatile bxxk f157223h;

    /* renamed from: a */
    public int f157224a;

    /* renamed from: b */
    public String f157225b = "";

    /* renamed from: c */
    public String f157226c = "";

    /* renamed from: d */
    public String f157227d = "";

    /* renamed from: e */
    public bvou f157228e;

    /* renamed from: f */
    public int f157229f;

    static {
        bvov bvov = new bvov();
        f157222g = bvov;
        bxvk.m124024a(bvov.class, bvov);
    }

    private bvov() {
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
            return bxvk.m124022a(f157222g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvov();
        } else {
            if (i2 == 4) {
                return new bxvd(f157222g);
            }
            if (i2 == 5) {
                return f157222g;
            }
            bxxk bxxk = f157223h;
            if (bxxk == null) {
                synchronized (bvov.class) {
                    bxxk = f157223h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157222g);
                        f157223h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
