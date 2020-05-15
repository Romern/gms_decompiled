package p000;

/* renamed from: bsnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsnu f146337b;

    /* renamed from: d */
    private static volatile bxxk f146338d;

    /* renamed from: a */
    public ByteString f146339a = ByteString.f164797b;

    /* renamed from: c */
    private int f146340c;

    static {
        bsnu bsnu = new bsnu();
        f146337b = bsnu;
        GeneratedMessageLite.m124024a(bsnu.class, bsnu);
    }

    private bsnu() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f146337b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f146337b);
            }
            if (i2 == 5) {
                return f146337b;
            }
            bxxk bxxk = f146338d;
            if (bxxk == null) {
                synchronized (bsnu.class) {
                    bxxk = f146338d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146337b);
                        f146338d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
