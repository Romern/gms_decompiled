package p000;

/* renamed from: bpdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpdw f136410e;

    /* renamed from: f */
    private static volatile bxxk f136411f;

    /* renamed from: a */
    public int f136412a;

    /* renamed from: b */
    public String f136413b = "";

    /* renamed from: c */
    public String f136414c = "";

    /* renamed from: d */
    public String f136415d = "";

    static {
        bpdw bpdw = new bpdw();
        f136410e = bpdw;
        bxvk.m124024a(bpdw.class, bpdw);
    }

    private bpdw() {
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
            return bxvk.m124022a(f136410e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f136410e);
            }
            if (i2 == 5) {
                return f136410e;
            }
            bxxk bxxk = f136411f;
            if (bxxk == null) {
                synchronized (bpdw.class) {
                    bxxk = f136411f;
                    if (bxxk == null) {
                        bxxk = new bxve(f136410e);
                        f136411f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
