package p000;

/* renamed from: byau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byau extends bxvk implements bxxd {

    /* renamed from: i */
    public static final byau f165334i;

    /* renamed from: j */
    private static volatile bxxk f165335j;

    /* renamed from: a */
    public int f165336a;

    /* renamed from: b */
    public String f165337b = "";

    /* renamed from: c */
    public String f165338c = "";

    /* renamed from: d */
    public String f165339d = "";

    /* renamed from: e */
    public int f165340e;

    /* renamed from: f */
    public long f165341f;

    /* renamed from: g */
    public int f165342g;

    /* renamed from: h */
    public boolean f165343h;

    static {
        byau byau = new byau();
        f165334i = byau;
        bxvk.m124024a(byau.class, byau);
    }

    private byau() {
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
            return bxvk.m124022a(f165334i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byau();
        } else {
            if (i2 == 4) {
                return new bxvd(f165334i);
            }
            if (i2 == 5) {
                return f165334i;
            }
            bxxk bxxk = f165335j;
            if (bxxk == null) {
                synchronized (byau.class) {
                    bxxk = f165335j;
                    if (bxxk == null) {
                        bxxk = new bxve(f165334i);
                        f165335j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
