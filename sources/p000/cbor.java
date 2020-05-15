package p000;

/* renamed from: cbor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbor extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbor f177852b;

    /* renamed from: c */
    private static volatile bxxk f177853c;

    /* renamed from: a */
    public bxtx f177854a = bxtx.f164797b;

    static {
        cbor cbor = new cbor();
        f177852b = cbor;
        bxvk.m124024a(cbor.class, cbor);
    }

    private cbor() {
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
            return bxvk.m124022a(f177852b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbor();
        } else {
            if (i2 == 4) {
                return new bxvd(f177852b);
            }
            if (i2 == 5) {
                return f177852b;
            }
            bxxk bxxk = f177853c;
            if (bxxk == null) {
                synchronized (cbor.class) {
                    bxxk = f177853c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177852b);
                        f177853c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
