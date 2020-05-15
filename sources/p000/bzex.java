package p000;

/* renamed from: bzex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzex extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzex f169737g;

    /* renamed from: h */
    private static volatile bxxk f169738h;

    /* renamed from: a */
    public int f169739a;

    /* renamed from: b */
    public int f169740b;

    /* renamed from: c */
    public String f169741c = "";

    /* renamed from: d */
    public String f169742d = "";

    /* renamed from: e */
    public String f169743e = "";

    /* renamed from: f */
    public String f169744f = "";

    static {
        bzex bzex = new bzex();
        f169737g = bzex;
        bxvk.m124024a(bzex.class, bzex);
    }

    private bzex() {
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
            return bxvk.m124022a(f169737g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0005", new Object[]{"a", "b", bzew.f169736a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzex();
        } else {
            if (i2 == 4) {
                return new bxvd(f169737g);
            }
            if (i2 == 5) {
                return f169737g;
            }
            bxxk bxxk = f169738h;
            if (bxxk == null) {
                synchronized (bzex.class) {
                    bxxk = f169738h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169737g);
                        f169738h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
