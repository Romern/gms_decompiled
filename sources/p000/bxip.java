package p000;

/* renamed from: bxip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxip extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxip f163543i;

    /* renamed from: j */
    private static volatile bxxk f163544j;

    /* renamed from: a */
    public int f163545a;

    /* renamed from: b */
    public int f163546b;

    /* renamed from: c */
    public int f163547c;

    /* renamed from: d */
    public int f163548d;

    /* renamed from: e */
    public int f163549e;

    /* renamed from: f */
    public long f163550f;

    /* renamed from: g */
    public long f163551g;

    /* renamed from: h */
    public int f163552h;

    static {
        bxip bxip = new bxip();
        f163543i = bxip;
        bxvk.m124024a(bxip.class, bxip);
    }

    private bxip() {
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
            return bxvk.m124022a(f163543i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007င\u0006", new Object[]{"a", "b", bxio.f163542a, "c", bxfx.f163210a, "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxip();
        } else {
            if (i2 == 4) {
                return new bxvd(f163543i);
            }
            if (i2 == 5) {
                return f163543i;
            }
            bxxk bxxk = f163544j;
            if (bxxk == null) {
                synchronized (bxip.class) {
                    bxxk = f163544j;
                    if (bxxk == null) {
                        bxxk = new bxve(f163543i);
                        f163544j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
