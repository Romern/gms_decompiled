package p000;

/* renamed from: bxcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcx extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxcx f163000i;

    /* renamed from: j */
    private static volatile bxxk f163001j;

    /* renamed from: a */
    public int f163002a;

    /* renamed from: b */
    public long f163003b;

    /* renamed from: c */
    public int f163004c;

    /* renamed from: d */
    public bxda f163005d;

    /* renamed from: e */
    public bxdf f163006e;

    /* renamed from: f */
    public bxdi f163007f;

    /* renamed from: g */
    public bxcv f163008g;

    /* renamed from: h */
    public bxcw f163009h;

    static {
        bxcx bxcx = new bxcx();
        f163000i = bxcx;
        bxvk.m124024a(bxcx.class, bxcx);
    }

    private bxcx() {
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
            return bxvk.m124022a(f163000i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", bxco.m122578b(), "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f163000i);
            }
            if (i2 == 5) {
                return f163000i;
            }
            bxxk bxxk = f163001j;
            if (bxxk == null) {
                synchronized (bxcx.class) {
                    bxxk = f163001j;
                    if (bxxk == null) {
                        bxxk = new bxve(f163000i);
                        f163001j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
