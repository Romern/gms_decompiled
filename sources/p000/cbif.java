package p000;

/* renamed from: cbif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbif extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbif f177235b;

    /* renamed from: c */
    private static volatile bxxk f177236c;

    /* renamed from: a */
    public cbiq f177237a;

    static {
        cbif cbif = new cbif();
        f177235b = cbif;
        GeneratedMessageLite.m124024a(cbif.class, cbif);
    }

    private cbif() {
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
            return GeneratedMessageLite.m124022a(f177235b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbif();
        } else {
            if (i2 == 4) {
                return new bxvd(f177235b);
            }
            if (i2 == 5) {
                return f177235b;
            }
            bxxk bxxk = f177236c;
            if (bxxk == null) {
                synchronized (cbif.class) {
                    bxxk = f177236c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177235b);
                        f177236c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
