package p000;

/* renamed from: cbke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbke extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbke f177397b;

    /* renamed from: c */
    private static volatile bxxk f177398c;

    /* renamed from: a */
    public cbcd f177399a;

    static {
        cbke cbke = new cbke();
        f177397b = cbke;
        bxvk.m124024a(cbke.class, cbke);
    }

    private cbke() {
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
            return bxvk.m124022a(f177397b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbke();
        } else {
            if (i2 == 4) {
                return new bxvd(f177397b);
            }
            if (i2 == 5) {
                return f177397b;
            }
            bxxk bxxk = f177398c;
            if (bxxk == null) {
                synchronized (cbke.class) {
                    bxxk = f177398c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177397b);
                        f177398c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
