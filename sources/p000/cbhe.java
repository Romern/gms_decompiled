package p000;

/* renamed from: cbhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbhe f177121c;

    /* renamed from: d */
    private static volatile bxxk f177122d;

    /* renamed from: a */
    public cbmo f177123a;

    /* renamed from: b */
    public String f177124b = "";

    static {
        cbhe cbhe = new cbhe();
        f177121c = cbhe;
        GeneratedMessageLite.m124024a(cbhe.class, cbhe);
    }

    private cbhe() {
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
            return GeneratedMessageLite.m124022a(f177121c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f177121c);
            }
            if (i2 == 5) {
                return f177121c;
            }
            bxxk bxxk = f177122d;
            if (bxxk == null) {
                synchronized (cbhe.class) {
                    bxxk = f177122d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177121c);
                        f177122d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
