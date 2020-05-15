package p000;

/* renamed from: bxpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpv extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxpv f164314i;

    /* renamed from: j */
    private static volatile bxxk f164315j;

    /* renamed from: a */
    public int f164316a;

    /* renamed from: b */
    public int f164317b;

    /* renamed from: c */
    public bxwc f164318c = bxxn.f165040b;

    /* renamed from: d */
    public long f164319d;

    /* renamed from: e */
    public long f164320e;

    /* renamed from: f */
    public long f164321f;

    /* renamed from: g */
    public boolean f164322g;

    /* renamed from: h */
    public int f164323h;

    static {
        bxpv bxpv = new bxpv();
        f164314i = bxpv;
        bxvk.m124024a(bxpv.class, bxpv);
    }

    private bxpv() {
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
            return bxvk.m124022a(f164314i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဇ\u0004\u0007င\u0005", new Object[]{"a", "b", bxpt.f164308a, "c", bxpu.class, "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxpv();
        } else {
            if (i2 == 4) {
                return new bxps();
            }
            if (i2 == 5) {
                return f164314i;
            }
            bxxk bxxk = f164315j;
            if (bxxk == null) {
                synchronized (bxpv.class) {
                    bxxk = f164315j;
                    if (bxxk == null) {
                        bxxk = new bxve(f164314i);
                        f164315j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
