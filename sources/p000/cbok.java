package p000;

/* renamed from: cbok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbok extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbok f177826d;

    /* renamed from: e */
    private static volatile bxxk f177827e;

    /* renamed from: a */
    public String f177828a = "";

    /* renamed from: b */
    public String f177829b = "";

    /* renamed from: c */
    public cbof f177830c;

    static {
        cbok cbok = new cbok();
        f177826d = cbok;
        bxvk.m124024a(cbok.class, cbok);
    }

    private cbok() {
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
            return bxvk.m124022a(f177826d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0004Ȉ", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new cbok();
        } else {
            if (i2 == 4) {
                return new bxvd(f177826d);
            }
            if (i2 == 5) {
                return f177826d;
            }
            bxxk bxxk = f177827e;
            if (bxxk == null) {
                synchronized (cbok.class) {
                    bxxk = f177827e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177826d);
                        f177827e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
