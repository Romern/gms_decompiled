package p000;

/* renamed from: cbiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbiv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbiv f177303b;

    /* renamed from: c */
    private static volatile bxxk f177304c;

    /* renamed from: a */
    public String f177305a = "";

    static {
        cbiv cbiv = new cbiv();
        f177303b = cbiv;
        GeneratedMessageLite.m124024a(cbiv.class, cbiv);
    }

    private cbiv() {
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
            return GeneratedMessageLite.m124022a(f177303b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f177303b);
            }
            if (i2 == 5) {
                return f177303b;
            }
            bxxk bxxk = f177304c;
            if (bxxk == null) {
                synchronized (cbiv.class) {
                    bxxk = f177304c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177303b);
                        f177304c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
