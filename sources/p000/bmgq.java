package p000;

/* renamed from: bmgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmgq f129306h;

    /* renamed from: i */
    private static volatile bxxk f129307i;

    /* renamed from: a */
    public int f129308a;

    /* renamed from: b */
    public String f129309b = "";

    /* renamed from: c */
    public bxtx f129310c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f129311d = bxxn.f165040b;

    /* renamed from: e */
    public bmbs f129312e;

    /* renamed from: f */
    public bmbs f129313f;

    /* renamed from: g */
    public bxwc f129314g = bxxn.f165040b;

    static {
        bmgq bmgq = new bmgq();
        f129306h = bmgq;
        bxvk.m124024a(bmgq.class, bmgq);
    }

    private bmgq() {
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
            return bxvk.m124022a(f129306h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001a", new Object[]{"a", "b", "c", "d", bmqk.class, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bmgq();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129306h;
            }
            bxxk bxxk = f129307i;
            if (bxxk == null) {
                synchronized (bmgq.class) {
                    bxxk = f129307i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129306h);
                        f129307i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
