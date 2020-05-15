package p000;

/* renamed from: btdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btdp f148424g;

    /* renamed from: h */
    private static volatile bxxk f148425h;

    /* renamed from: a */
    public int f148426a;

    /* renamed from: b */
    public String f148427b = "";

    /* renamed from: c */
    public String f148428c = "";

    /* renamed from: d */
    public bxvt f148429d = bxvm.f164965b;

    /* renamed from: e */
    public btdi f148430e;

    /* renamed from: f */
    public btea f148431f;

    static {
        btdp btdp = new btdp();
        f148424g = btdp;
        bxvk.m124024a(btdp.class, btdp);
    }

    private btdp() {
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
            return bxvk.m124022a(f148424g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002,\u0003\t\u0004\u0004\u0005Ȉ\u0006\t", new Object[]{"c", "d", "e", "a", "b", "f"});
        } else if (i2 == 3) {
            return new btdp();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f148424g;
            }
            bxxk bxxk = f148425h;
            if (bxxk == null) {
                synchronized (btdp.class) {
                    bxxk = f148425h;
                    if (bxxk == null) {
                        bxxk = new bxve(f148424g);
                        f148425h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
