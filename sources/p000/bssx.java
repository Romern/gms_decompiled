package p000;

/* renamed from: bssx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssx extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bssx f146932f;

    /* renamed from: g */
    private static volatile bxxk f146933g;

    /* renamed from: a */
    public String f146934a = "";

    /* renamed from: b */
    public int f146935b;

    /* renamed from: c */
    public String f146936c = "";

    /* renamed from: d */
    public int f146937d;

    /* renamed from: e */
    public String f146938e = "";

    static {
        bssx bssx = new bssx();
        f146932f = bssx;
        bxvk.m124024a(bssx.class, bssx);
    }

    private bssx() {
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
            return bxvk.m124022a(f146932f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bssx();
        } else {
            if (i2 == 4) {
                return new bxvd(f146932f);
            }
            if (i2 == 5) {
                return f146932f;
            }
            bxxk bxxk = f146933g;
            if (bxxk == null) {
                synchronized (bssx.class) {
                    bxxk = f146933g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146932f);
                        f146933g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
