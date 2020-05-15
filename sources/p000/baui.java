package p000;

/* renamed from: baui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baui extends bxvk implements bxxd {

    /* renamed from: e */
    public static final baui f101771e;

    /* renamed from: f */
    private static volatile bxxk f101772f;

    /* renamed from: a */
    public int f101773a;

    /* renamed from: b */
    public String f101774b = "";

    /* renamed from: c */
    public String f101775c = "";

    /* renamed from: d */
    public bxwc f101776d = bxxn.f165040b;

    static {
        baui baui = new baui();
        f101771e = baui;
        bxvk.m124024a(baui.class, baui);
    }

    private baui() {
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
            return bxvk.m124022a(f101771e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0006ဈ\u0001", new Object[]{"a", "b", "d", baug.class, "c"});
        } else if (i2 == 3) {
            return new baui();
        } else {
            if (i2 == 4) {
                return new bauh();
            }
            if (i2 == 5) {
                return f101771e;
            }
            bxxk bxxk = f101772f;
            if (bxxk == null) {
                synchronized (baui.class) {
                    bxxk = f101772f;
                    if (bxxk == null) {
                        bxxk = new bxve(f101771e);
                        f101772f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
