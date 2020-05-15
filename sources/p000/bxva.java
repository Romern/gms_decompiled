package p000;

/* renamed from: bxva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxva extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxva f164942b;

    /* renamed from: c */
    private static volatile bxxk f164943c;

    /* renamed from: a */
    public float f164944a;

    static {
        bxva bxva = new bxva();
        f164942b = bxva;
        GeneratedMessageLite.m124024a(bxva.class, bxva);
    }

    private bxva() {
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
            return GeneratedMessageLite.m124022a(f164942b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxva();
        } else {
            if (i2 == 4) {
                return new bxvd(f164942b);
            }
            if (i2 == 5) {
                return f164942b;
            }
            bxxk bxxk = f164943c;
            if (bxxk == null) {
                synchronized (bxva.class) {
                    bxxk = f164943c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164942b);
                        f164943c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
