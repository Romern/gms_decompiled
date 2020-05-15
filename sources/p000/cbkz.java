package p000;

/* renamed from: cbkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbkz f177457c;

    /* renamed from: d */
    private static volatile bxxk f177458d;

    /* renamed from: a */
    public int f177459a;

    /* renamed from: b */
    public String f177460b = "";

    static {
        cbkz cbkz = new cbkz();
        f177457c = cbkz;
        bxvk.m124024a(cbkz.class, cbkz);
    }

    private cbkz() {
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
            return bxvk.m124022a(f177457c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177457c);
            }
            if (i2 == 5) {
                return f177457c;
            }
            bxxk bxxk = f177458d;
            if (bxxk == null) {
                synchronized (cbkz.class) {
                    bxxk = f177458d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177457c);
                        f177458d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
