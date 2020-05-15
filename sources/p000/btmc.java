package p000;

/* renamed from: btmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btmc f149465g;

    /* renamed from: h */
    private static volatile bxxk f149466h;

    /* renamed from: a */
    public String f149467a = "";

    /* renamed from: b */
    public String f149468b = "";

    /* renamed from: c */
    public int f149469c;

    /* renamed from: d */
    public bxwc f149470d = bxxn.f165040b;

    /* renamed from: e */
    public long f149471e;

    /* renamed from: f */
    public boolean f149472f;

    static {
        btmc btmc = new btmc();
        f149465g = btmc;
        bxvk.m124024a(btmc.class, btmc);
    }

    private btmc() {
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
            return bxvk.m124022a(f149465g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004Ț\u0005\u0002\u0006\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btmc();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f149465g;
            }
            bxxk bxxk = f149466h;
            if (bxxk == null) {
                synchronized (btmc.class) {
                    bxxk = f149466h;
                    if (bxxk == null) {
                        bxxk = new bxve(f149465g);
                        f149466h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
