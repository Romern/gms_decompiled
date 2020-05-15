package p000;

/* renamed from: btmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmy extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btmy f149577g;

    /* renamed from: h */
    private static volatile bxxk f149578h;

    /* renamed from: a */
    public bxwc f149579a = bxxn.f165040b;

    /* renamed from: b */
    public String f149580b = "";

    /* renamed from: c */
    public String f149581c = "";

    /* renamed from: d */
    public btnc f149582d;

    /* renamed from: e */
    public String f149583e = "";

    /* renamed from: f */
    public int f149584f;

    static {
        btmy btmy = new btmy();
        f149577g = btmy;
        bxvk.m124024a(btmy.class, btmy);
    }

    private btmy() {
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
            return bxvk.m124022a(f149577g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ\u0006\t\u0007Ȉ\b\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f149577g);
            }
            if (i2 == 5) {
                return f149577g;
            }
            bxxk bxxk = f149578h;
            if (bxxk == null) {
                synchronized (btmy.class) {
                    bxxk = f149578h;
                    if (bxxk == null) {
                        bxxk = new bxve(f149577g);
                        f149578h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
