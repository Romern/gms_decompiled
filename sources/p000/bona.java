package p000;

/* renamed from: bona */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bona extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bona f133750c;

    /* renamed from: d */
    private static volatile bxxk f133751d;

    /* renamed from: a */
    public int f133752a;

    /* renamed from: b */
    public String f133753b = "";

    static {
        bona bona = new bona();
        f133750c = bona;
        bxvk.m124024a(bona.class, bona);
    }

    private bona() {
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
            return bxvk.m124022a(f133750c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bona();
        } else {
            if (i2 == 4) {
                return new bxvd(f133750c);
            }
            if (i2 == 5) {
                return f133750c;
            }
            bxxk bxxk = f133751d;
            if (bxxk == null) {
                synchronized (bona.class) {
                    bxxk = f133751d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133750c);
                        f133751d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
