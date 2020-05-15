package p000;

/* renamed from: blwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blwl f127951c;

    /* renamed from: e */
    private static volatile bxxk f127952e;

    /* renamed from: a */
    public int f127953a;

    /* renamed from: b */
    public int f127954b;

    /* renamed from: d */
    private int f127955d;

    static {
        blwl blwl = new blwl();
        f127951c = blwl;
        GeneratedMessageLite.m124024a(blwl.class, blwl);
    }

    private blwl() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m107717a(blwl blwl) {
        blwl.f127953a |= 2;
        blwl.f127955d = 1;
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
            return GeneratedMessageLite.m124022a(f127951c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", blwk.f127950a, "d"});
        } else if (i2 == 3) {
            return new blwl();
        } else {
            if (i2 == 4) {
                return new bxvd(f127951c);
            }
            if (i2 == 5) {
                return f127951c;
            }
            bxxk bxxk = f127952e;
            if (bxxk == null) {
                synchronized (blwl.class) {
                    bxxk = f127952e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127951c);
                        f127952e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
