package p000;

/* renamed from: cbbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbbb f176525b;

    /* renamed from: c */
    private static volatile bxxk f176526c;

    /* renamed from: a */
    public String f176527a = "";

    static {
        cbbb cbbb = new cbbb();
        f176525b = cbbb;
        bxvk.m124024a(cbbb.class, cbbb);
    }

    private cbbb() {
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
            return bxvk.m124022a(f176525b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f176525b);
            }
            if (i2 == 5) {
                return f176525b;
            }
            bxxk bxxk = f176526c;
            if (bxxk == null) {
                synchronized (cbbb.class) {
                    bxxk = f176526c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176525b);
                        f176526c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
