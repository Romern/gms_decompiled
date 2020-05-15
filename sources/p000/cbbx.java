package p000;

/* renamed from: cbbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbbx f176625b;

    /* renamed from: c */
    private static volatile bxxk f176626c;

    /* renamed from: a */
    public String f176627a = "";

    static {
        cbbx cbbx = new cbbx();
        f176625b = cbbx;
        bxvk.m124024a(cbbx.class, cbbx);
    }

    private cbbx() {
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
            return bxvk.m124022a(f176625b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbbx();
        } else {
            if (i2 == 4) {
                return new bxvd(f176625b);
            }
            if (i2 == 5) {
                return f176625b;
            }
            bxxk bxxk = f176626c;
            if (bxxk == null) {
                synchronized (cbbx.class) {
                    bxxk = f176626c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176625b);
                        f176626c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
