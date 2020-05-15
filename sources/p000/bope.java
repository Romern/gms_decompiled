package p000;

/* renamed from: bope */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bope extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bope f134108e;

    /* renamed from: f */
    private static volatile bxxk f134109f;

    /* renamed from: a */
    public String f134110a = "";

    /* renamed from: b */
    public String f134111b = "";

    /* renamed from: c */
    public String f134112c = "";

    /* renamed from: d */
    public String f134113d = "";

    static {
        bope bope = new bope();
        f134108e = bope;
        bxvk.m124024a(bope.class, bope);
    }

    private bope() {
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
            return bxvk.m124022a(f134108e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bope();
        } else {
            if (i2 == 4) {
                return new bxvd(f134108e);
            }
            if (i2 == 5) {
                return f134108e;
            }
            bxxk bxxk = f134109f;
            if (bxxk == null) {
                synchronized (bope.class) {
                    bxxk = f134109f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134108e);
                        f134109f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
