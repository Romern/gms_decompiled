package p000;

/* renamed from: blag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blag extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blag f125755a;

    /* renamed from: n */
    private static volatile bxxk f125756n;

    /* renamed from: b */
    private int f125757b;

    /* renamed from: c */
    private blaa f125758c;

    /* renamed from: d */
    private bkzy f125759d;

    /* renamed from: e */
    private blad f125760e;

    /* renamed from: f */
    private bkzz f125761f;

    /* renamed from: g */
    private blaf f125762g;

    /* renamed from: h */
    private bkzx f125763h;

    /* renamed from: i */
    private bkzw f125764i;

    /* renamed from: j */
    private blae f125765j;

    /* renamed from: k */
    private blac f125766k;

    /* renamed from: l */
    private blab f125767l;

    /* renamed from: m */
    private byte f125768m = 2;

    static {
        blag blag = new blag();
        f125755a = blag;
        GeneratedMessageLite.m124024a(blag.class, blag);
    }

    private blag() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125768m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125768m = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125755a, "\u0001\n\u0000\u0001\u0005\u0012\n\u0000\u0000\n\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bᐉ\t\fᐉ\n\u0010ᐉ\f\u0012ᐉ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new blag();
        } else {
            if (i2 == 4) {
                return new bxvd(f125755a);
            }
            if (i2 == 5) {
                return f125755a;
            }
            bxxk bxxk = f125756n;
            if (bxxk == null) {
                synchronized (blag.class) {
                    bxxk = f125756n;
                    if (bxxk == null) {
                        bxxk = new bxve(f125755a);
                        f125756n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
