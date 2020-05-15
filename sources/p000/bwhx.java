package p000;

/* renamed from: bwhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwhx f159598d;

    /* renamed from: e */
    private static volatile bxxk f159599e;

    /* renamed from: a */
    public int f159600a;

    /* renamed from: b */
    public bxwc f159601b = bxxn.f165040b;

    /* renamed from: c */
    public ByteString f159602c = ByteString.f164797b;

    static {
        bwhx bwhx = new bwhx();
        f159598d = bwhx;
        GeneratedMessageLite.m124024a(bwhx.class, bwhx);
    }

    private bwhx() {
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
            return GeneratedMessageLite.m124022a(f159598d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000", new Object[]{"a", "b", bmed.class, "c"});
        } else if (i2 == 3) {
            return new bwhx();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159598d;
            }
            bxxk bxxk = f159599e;
            if (bxxk == null) {
                synchronized (bwhx.class) {
                    bxxk = f159599e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159598d);
                        f159599e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
