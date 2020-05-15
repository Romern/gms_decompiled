package p000;

/* renamed from: cbir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbir extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbir f177290b;

    /* renamed from: c */
    private static volatile bxxk f177291c;

    /* renamed from: a */
    public String f177292a = "";

    static {
        cbir cbir = new cbir();
        f177290b = cbir;
        GeneratedMessageLite.m124024a(cbir.class, cbir);
    }

    private cbir() {
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
            return GeneratedMessageLite.m124022a(f177290b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbir();
        } else {
            if (i2 == 4) {
                return new bxvd(f177290b);
            }
            if (i2 == 5) {
                return f177290b;
            }
            bxxk bxxk = f177291c;
            if (bxxk == null) {
                synchronized (cbir.class) {
                    bxxk = f177291c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177290b);
                        f177291c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
