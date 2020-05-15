package p000;

/* renamed from: cbgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbgt f177082e;

    /* renamed from: f */
    private static volatile bxxk f177083f;

    /* renamed from: a */
    public cbmo f177084a;

    /* renamed from: b */
    public String f177085b = "";

    /* renamed from: c */
    public cbhu f177086c;

    /* renamed from: d */
    public cbij f177087d;

    static {
        cbgt cbgt = new cbgt();
        f177082e = cbgt;
        GeneratedMessageLite.m124024a(cbgt.class, cbgt);
    }

    private cbgt() {
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
            return GeneratedMessageLite.m124022a(f177082e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f177082e);
            }
            if (i2 == 5) {
                return f177082e;
            }
            bxxk bxxk = f177083f;
            if (bxxk == null) {
                synchronized (cbgt.class) {
                    bxxk = f177083f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177082e);
                        f177083f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
