package p000;

/* renamed from: kwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final kwm f25284e;

    /* renamed from: f */
    private static volatile bxxk f25285f;

    /* renamed from: a */
    public String f25286a = "";

    /* renamed from: b */
    public int f25287b;

    /* renamed from: c */
    public bxvt f25288c = bxvm.f164965b;

    /* renamed from: d */
    public bxvt f25289d = bxvm.f164965b;

    static {
        kwm kwm = new kwm();
        f25284e = kwm;
        bxvk.m124024a(kwm.class, kwm);
    }

    private kwm() {
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
            return bxvk.m124022a(f25284e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u0004\u0003'\u0004'", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new kwm();
        } else {
            if (i2 == 4) {
                return new bxvd(f25284e);
            }
            if (i2 == 5) {
                return f25284e;
            }
            bxxk bxxk = f25285f;
            if (bxxk == null) {
                synchronized (kwm.class) {
                    bxxk = f25285f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25284e);
                        f25285f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
