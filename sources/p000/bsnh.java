package p000;

/* renamed from: bsnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsnh f146240b;

    /* renamed from: c */
    private static volatile bxxk f146241c;

    /* renamed from: a */
    public bxww f146242a = bxww.f165013b;

    static {
        bsnh bsnh = new bsnh();
        f146240b = bsnh;
        GeneratedMessageLite.m124024a(bsnh.class, bsnh);
    }

    private bsnh() {
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
            return GeneratedMessageLite.m124022a(f146240b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"a", bsng.f146239a});
        } else if (i2 == 3) {
            return new bsnh();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f146240b;
            }
            bxxk bxxk = f146241c;
            if (bxxk == null) {
                synchronized (bsnh.class) {
                    bxxk = f146241c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146240b);
                        f146241c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
