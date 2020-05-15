package p000;

/* renamed from: bssw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssw extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bssw f146924g;

    /* renamed from: h */
    private static volatile bxxk f146925h;

    /* renamed from: a */
    public String f146926a = "";

    /* renamed from: b */
    public String f146927b = "";

    /* renamed from: c */
    public long f146928c;

    /* renamed from: d */
    public long f146929d;

    /* renamed from: e */
    public int f146930e;

    /* renamed from: f */
    public boolean f146931f;

    static {
        bssw bssw = new bssw();
        f146924g = bssw;
        bxvk.m124024a(bssw.class, bssw);
    }

    private bssw() {
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
            return bxvk.m124022a(f146924g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\u0003\u0005\u0004\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bssw();
        } else {
            if (i2 == 4) {
                return new bxvd(f146924g);
            }
            if (i2 == 5) {
                return f146924g;
            }
            bxxk bxxk = f146925h;
            if (bxxk == null) {
                synchronized (bssw.class) {
                    bxxk = f146925h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146924g);
                        f146925h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
