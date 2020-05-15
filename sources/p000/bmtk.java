package p000;

/* renamed from: bmtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtk extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmtk f130852g;

    /* renamed from: h */
    private static volatile bxxk f130853h;

    /* renamed from: a */
    public String f130854a = "";

    /* renamed from: b */
    public String f130855b = "";

    /* renamed from: c */
    public String f130856c = "";

    /* renamed from: d */
    public String f130857d = "";

    /* renamed from: e */
    public bmtl f130858e;

    /* renamed from: f */
    public bmtl f130859f;

    static {
        bmtk bmtk = new bmtk();
        f130852g = bmtk;
        bxvk.m124024a(bmtk.class, bmtk);
    }

    private bmtk() {
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
            return bxvk.m124022a(f130852g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmtk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130852g);
            }
            if (i2 == 5) {
                return f130852g;
            }
            bxxk bxxk = f130853h;
            if (bxxk == null) {
                synchronized (bmtk.class) {
                    bxxk = f130853h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130852g);
                        f130853h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
