package p000;

/* renamed from: cbgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbgh f177032b;

    /* renamed from: c */
    private static volatile bxxk f177033c;

    /* renamed from: a */
    public int f177034a;

    static {
        cbgh cbgh = new cbgh();
        f177032b = cbgh;
        GeneratedMessageLite.m124024a(cbgh.class, cbgh);
    }

    private cbgh() {
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
            return GeneratedMessageLite.m124022a(f177032b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f177032b);
            }
            if (i2 == 5) {
                return f177032b;
            }
            bxxk bxxk = f177033c;
            if (bxxk == null) {
                synchronized (cbgh.class) {
                    bxxk = f177033c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177032b);
                        f177033c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
