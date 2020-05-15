package p000;

/* renamed from: bymz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bymz f167096b;

    /* renamed from: c */
    private static volatile bxxk f167097c;

    /* renamed from: a */
    public String f167098a = "";

    static {
        bymz bymz = new bymz();
        f167096b = bymz;
        bxvk.m124024a(bymz.class, bymz);
    }

    private bymz() {
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
            return bxvk.m124022a(f167096b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bymz();
        } else {
            if (i2 == 4) {
                return new bxvd(f167096b);
            }
            if (i2 == 5) {
                return f167096b;
            }
            bxxk bxxk = f167097c;
            if (bxxk == null) {
                synchronized (bymz.class) {
                    bxxk = f167097c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167096b);
                        f167097c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
