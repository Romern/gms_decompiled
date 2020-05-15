package p000;

/* renamed from: adhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhf extends bxvk implements bxxd {

    /* renamed from: g */
    public static final adhf f61685g;

    /* renamed from: h */
    private static volatile bxxk f61686h;

    /* renamed from: a */
    public String f61687a = "";

    /* renamed from: b */
    public int f61688b;

    /* renamed from: c */
    public String f61689c = "";

    /* renamed from: d */
    public int f61690d;

    /* renamed from: e */
    public boolean f61691e;

    /* renamed from: f */
    public float f61692f;

    static {
        adhf adhf = new adhf();
        f61685g = adhf;
        bxvk.m124024a(adhf.class, adhf);
    }

    private adhf() {
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
            return bxvk.m124022a(f61685g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0004\u0005\u0007\u0006\u0001", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new adhf();
        } else {
            if (i2 == 4) {
                return new bxvd(f61685g);
            }
            if (i2 == 5) {
                return f61685g;
            }
            bxxk bxxk = f61686h;
            if (bxxk == null) {
                synchronized (adhf.class) {
                    bxxk = f61686h;
                    if (bxxk == null) {
                        bxxk = new bxve(f61685g);
                        f61686h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
