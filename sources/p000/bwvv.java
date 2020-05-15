package p000;

/* renamed from: bwvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwvv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwvv f161179c;

    /* renamed from: e */
    private static volatile bxxk f161180e;

    /* renamed from: a */
    public String f161181a = "";

    /* renamed from: b */
    public bxwc f161182b = bxxn.f165040b;

    /* renamed from: d */
    private int f161183d;

    static {
        bwvv bwvv = new bwvv();
        f161179c = bwvv;
        bxvk.m124024a(bwvv.class, bwvv);
    }

    private bwvv() {
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
            return bxvk.m124022a(f161179c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwvv();
        } else {
            if (i2 == 4) {
                return new bxvd(f161179c);
            }
            if (i2 == 5) {
                return f161179c;
            }
            bxxk bxxk = f161180e;
            if (bxxk == null) {
                synchronized (bwvv.class) {
                    bxxk = f161180e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161179c);
                        f161180e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
