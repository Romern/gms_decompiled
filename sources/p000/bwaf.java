package p000;

/* renamed from: bwaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwaf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwaf f158630e;

    /* renamed from: f */
    private static volatile bxxk f158631f;

    /* renamed from: a */
    public int f158632a;

    /* renamed from: b */
    public String f158633b = "";

    /* renamed from: c */
    public String f158634c = "";

    /* renamed from: d */
    public long f158635d;

    static {
        bwaf bwaf = new bwaf();
        f158630e = bwaf;
        bxvk.m124024a(bwaf.class, bwaf);
    }

    private bwaf() {
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
            return bxvk.m124022a(f158630e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f158630e);
            }
            if (i2 == 5) {
                return f158630e;
            }
            bxxk bxxk = f158631f;
            if (bxxk == null) {
                synchronized (bwaf.class) {
                    bxxk = f158631f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158630e);
                        f158631f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
