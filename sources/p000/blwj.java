package p000;

/* renamed from: blwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blwj f127945d;

    /* renamed from: e */
    private static volatile bxxk f127946e;

    /* renamed from: a */
    public int f127947a;

    /* renamed from: b */
    public long f127948b;

    /* renamed from: c */
    public String f127949c = "";

    static {
        blwj blwj = new blwj();
        f127945d = blwj;
        bxvk.m124024a(blwj.class, blwj);
    }

    private blwj() {
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
            return bxvk.m124022a(f127945d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f127945d);
            }
            if (i2 == 5) {
                return f127945d;
            }
            bxxk bxxk = f127946e;
            if (bxxk == null) {
                synchronized (blwj.class) {
                    bxxk = f127946e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127945d);
                        f127946e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
