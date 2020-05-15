package p000;

/* renamed from: cbom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbom extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbom f177836b;

    /* renamed from: c */
    private static volatile bxxk f177837c;

    /* renamed from: a */
    public String f177838a = "";

    static {
        cbom cbom = new cbom();
        f177836b = cbom;
        bxvk.m124024a(cbom.class, cbom);
    }

    private cbom() {
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
            return bxvk.m124022a(f177836b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbom();
        } else {
            if (i2 == 4) {
                return new bxvd(f177836b);
            }
            if (i2 == 5) {
                return f177836b;
            }
            bxxk bxxk = f177837c;
            if (bxxk == null) {
                synchronized (cbom.class) {
                    bxxk = f177837c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177836b);
                        f177837c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
