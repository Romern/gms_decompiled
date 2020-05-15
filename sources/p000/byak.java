package p000;

/* renamed from: byak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byak extends bxvk implements bxxd {

    /* renamed from: i */
    public static final byak f165269i;

    /* renamed from: j */
    private static volatile bxxk f165270j;

    /* renamed from: a */
    public int f165271a;

    /* renamed from: b */
    public int f165272b;

    /* renamed from: c */
    public String f165273c = "";

    /* renamed from: d */
    public bxtx f165274d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f165275e = bxtx.f164797b;

    /* renamed from: f */
    public blzu f165276f;

    /* renamed from: g */
    public String f165277g = "";

    /* renamed from: h */
    public int f165278h;

    static {
        byak byak = new byak();
        f165269i = byak;
        bxvk.m124024a(byak.class, byak);
    }

    private byak() {
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
            return bxvk.m124022a(f165269i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byak();
        } else {
            if (i2 == 4) {
                return new bxvd(f165269i);
            }
            if (i2 == 5) {
                return f165269i;
            }
            bxxk bxxk = f165270j;
            if (bxxk == null) {
                synchronized (byak.class) {
                    bxxk = f165270j;
                    if (bxxk == null) {
                        bxxk = new bxve(f165269i);
                        f165270j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
