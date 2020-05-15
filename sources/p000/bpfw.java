package p000;

/* renamed from: bpfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpfw extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpfw f137450h;

    /* renamed from: i */
    private static volatile bxxk f137451i;

    /* renamed from: a */
    public int f137452a;

    /* renamed from: b */
    public String f137453b = "";

    /* renamed from: c */
    public String f137454c = "";

    /* renamed from: d */
    public int f137455d;

    /* renamed from: e */
    public int f137456e;

    /* renamed from: f */
    public String f137457f = "";

    /* renamed from: g */
    public String f137458g = "";

    static {
        bpfw bpfw = new bpfw();
        f137450h = bpfw;
        bxvk.m124024a(bpfw.class, bpfw);
    }

    private bpfw() {
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
            return bxvk.m124022a(f137450h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", bzzv.m126374b(), "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f137450h);
            }
            if (i2 == 5) {
                return f137450h;
            }
            bxxk bxxk = f137451i;
            if (bxxk == null) {
                synchronized (bpfw.class) {
                    bxxk = f137451i;
                    if (bxxk == null) {
                        bxxk = new bxve(f137450h);
                        f137451i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
