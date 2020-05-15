package p000;

/* renamed from: bznp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznp extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bznp f170737i;

    /* renamed from: j */
    private static volatile bxxk f170738j;

    /* renamed from: a */
    public int f170739a;

    /* renamed from: b */
    public bznn f170740b;

    /* renamed from: c */
    public bxwc f170741c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f170742d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f170743e = bxxn.f165040b;

    /* renamed from: f */
    public String f170744f = "";

    /* renamed from: g */
    public String f170745g = "";

    /* renamed from: h */
    public bznn f170746h;

    static {
        bznp bznp = new bznp();
        f170737i = bznp;
        bxvk.m124024a(bznp.class, bznp);
    }

    private bznp() {
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
            return bxvk.m124022a(f170737i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဉ\u0003", new Object[]{"a", "b", "c", bznn.class, "d", bzno.class, "e", bznn.class, "f", "g", "h"});
        } else if (i2 == 3) {
            return new bznp();
        } else {
            if (i2 == 4) {
                return new bxvd(f170737i);
            }
            if (i2 == 5) {
                return f170737i;
            }
            bxxk bxxk = f170738j;
            if (bxxk == null) {
                synchronized (bznp.class) {
                    bxxk = f170738j;
                    if (bxxk == null) {
                        bxxk = new bxve(f170737i);
                        f170738j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
