package p000;

/* renamed from: btrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btrv f150156e;

    /* renamed from: f */
    private static volatile bxxk f150157f;

    /* renamed from: a */
    public int f150158a;

    /* renamed from: b */
    public String f150159b = "";

    /* renamed from: c */
    public String f150160c = "";

    /* renamed from: d */
    public String f150161d = "";

    static {
        btrv btrv = new btrv();
        f150156e = btrv;
        bxvk.m124024a(btrv.class, btrv);
    }

    private btrv() {
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
            return bxvk.m124022a(f150156e, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f150156e);
            }
            if (i2 == 5) {
                return f150156e;
            }
            bxxk bxxk = f150157f;
            if (bxxk == null) {
                synchronized (btrv.class) {
                    bxxk = f150157f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150156e);
                        f150157f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
