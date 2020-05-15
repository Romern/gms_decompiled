package p000;

/* renamed from: brzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brzh f143735d;

    /* renamed from: e */
    private static volatile bxxk f143736e;

    /* renamed from: a */
    public int f143737a;

    /* renamed from: b */
    public int f143738b;

    /* renamed from: c */
    public String f143739c = "";

    static {
        brzh brzh = new brzh();
        f143735d = brzh;
        bxvk.m124024a(brzh.class, brzh);
    }

    private brzh() {
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
            return bxvk.m124022a(f143735d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f143735d);
            }
            if (i2 == 5) {
                return f143735d;
            }
            bxxk bxxk = f143736e;
            if (bxxk == null) {
                synchronized (brzh.class) {
                    bxxk = f143736e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143735d);
                        f143736e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
