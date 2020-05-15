package p000;

/* renamed from: byxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byxh f168735d;

    /* renamed from: e */
    private static volatile bxxk f168736e;

    /* renamed from: a */
    public int f168737a;

    /* renamed from: b */
    public byxi f168738b;

    /* renamed from: c */
    public byxe f168739c;

    static {
        byxh byxh = new byxh();
        f168735d = byxh;
        bxvk.m124024a(byxh.class, byxh);
    }

    private byxh() {
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
            return bxvk.m124022a(f168735d, "\u0001\u0002\u0000\u0001\u0001f\u0002\u0000\u0000\u0000\u0001ဉ\u0000fဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f168735d);
            }
            if (i2 == 5) {
                return f168735d;
            }
            bxxk bxxk = f168736e;
            if (bxxk == null) {
                synchronized (byxh.class) {
                    bxxk = f168736e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168735d);
                        f168736e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
