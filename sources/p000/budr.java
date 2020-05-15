package p000;

/* renamed from: budr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final budr f153505d;

    /* renamed from: e */
    private static volatile bxxk f153506e;

    /* renamed from: a */
    public int f153507a;

    /* renamed from: b */
    public boolean f153508b = true;

    /* renamed from: c */
    public long f153509c = 7500;

    static {
        budr budr = new budr();
        f153505d = budr;
        bxvk.m124024a(budr.class, budr);
    }

    private budr() {
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
            return bxvk.m124022a(f153505d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new budr();
        } else {
            if (i2 == 4) {
                return new bxvd(f153505d);
            }
            if (i2 == 5) {
                return f153505d;
            }
            bxxk bxxk = f153506e;
            if (bxxk == null) {
                synchronized (budr.class) {
                    bxxk = f153506e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153505d);
                        f153506e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
