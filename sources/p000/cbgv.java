package p000;

/* renamed from: cbgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbgv f177091c;

    /* renamed from: d */
    private static volatile bxxk f177092d;

    /* renamed from: a */
    public cbmo f177093a;

    /* renamed from: b */
    public String f177094b = "";

    static {
        cbgv cbgv = new cbgv();
        f177091c = cbgv;
        bxvk.m124024a(cbgv.class, cbgv);
    }

    private cbgv() {
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
            return bxvk.m124022a(f177091c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f177091c);
            }
            if (i2 == 5) {
                return f177091c;
            }
            bxxk bxxk = f177092d;
            if (bxxk == null) {
                synchronized (cbgv.class) {
                    bxxk = f177092d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177091c);
                        f177092d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
