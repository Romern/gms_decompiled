package p000;

/* renamed from: bpau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpau extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpau f135540g;

    /* renamed from: h */
    private static volatile bxxk f135541h;

    /* renamed from: a */
    public int f135542a;

    /* renamed from: b */
    public boxg f135543b;

    /* renamed from: c */
    public int f135544c;

    /* renamed from: d */
    public String f135545d = "";

    /* renamed from: e */
    public String f135546e = "";

    /* renamed from: f */
    public String f135547f = "";

    static {
        bpau bpau = new bpau();
        f135540g = bpau;
        bxvk.m124024a(bpau.class, bpau);
    }

    private bpau() {
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
            return bxvk.m124022a(f135540g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpau();
        } else {
            if (i2 == 4) {
                return new bxvd(f135540g);
            }
            if (i2 == 5) {
                return f135540g;
            }
            bxxk bxxk = f135541h;
            if (bxxk == null) {
                synchronized (bpau.class) {
                    bxxk = f135541h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135540g);
                        f135541h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
