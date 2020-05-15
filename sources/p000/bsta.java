package p000;

/* renamed from: bsta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsta extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsta f146956g;

    /* renamed from: h */
    private static volatile bxxk f146957h;

    /* renamed from: a */
    public String f146958a = "";

    /* renamed from: b */
    public String f146959b = "";

    /* renamed from: c */
    public int f146960c;

    /* renamed from: d */
    public long f146961d;

    /* renamed from: e */
    public int f146962e;

    /* renamed from: f */
    public boolean f146963f;

    static {
        bsta bsta = new bsta();
        f146956g = bsta;
        bxvk.m124024a(bsta.class, bsta);
    }

    private bsta() {
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
            return bxvk.m124022a(f146956g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0003\u0005\u0004\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsta();
        } else {
            if (i2 == 4) {
                return new bxvd(f146956g);
            }
            if (i2 == 5) {
                return f146956g;
            }
            bxxk bxxk = f146957h;
            if (bxxk == null) {
                synchronized (bsta.class) {
                    bxxk = f146957h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146956g);
                        f146957h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
