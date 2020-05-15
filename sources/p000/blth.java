package p000;

/* renamed from: blth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blth extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blth f127697d;

    /* renamed from: f */
    private static volatile bxxk f127698f;

    /* renamed from: a */
    public String f127699a = "";

    /* renamed from: b */
    public String f127700b = "";

    /* renamed from: c */
    public String f127701c = "";

    /* renamed from: e */
    private int f127702e;

    static {
        blth blth = new blth();
        f127697d = blth;
        bxvk.m124024a(blth.class, blth);
    }

    private blth() {
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
            return bxvk.m124022a(f127697d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဈ\u0004", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new blth();
        } else {
            if (i2 == 4) {
                return new bxvd(f127697d);
            }
            if (i2 == 5) {
                return f127697d;
            }
            bxxk bxxk = f127698f;
            if (bxxk == null) {
                synchronized (blth.class) {
                    bxxk = f127698f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127697d);
                        f127698f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
