package p000;

/* renamed from: bltt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bltt f127736d;

    /* renamed from: e */
    private static volatile bxxk f127737e;

    /* renamed from: a */
    public int f127738a;

    /* renamed from: b */
    public blts f127739b;

    /* renamed from: c */
    public bycg f127740c;

    static {
        bltt bltt = new bltt();
        f127736d = bltt;
        bxvk.m124024a(bltt.class, bltt);
    }

    private bltt() {
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
            return bxvk.m124022a(f127736d, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bltt();
        } else {
            if (i2 == 4) {
                return new bxvd(f127736d);
            }
            if (i2 == 5) {
                return f127736d;
            }
            bxxk bxxk = f127737e;
            if (bxxk == null) {
                synchronized (bltt.class) {
                    bxxk = f127737e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127736d);
                        f127737e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
