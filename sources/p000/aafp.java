package p000;

/* renamed from: aafp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final aafp f28038c;

    /* renamed from: d */
    private static volatile bxxk f28039d;

    /* renamed from: a */
    public int f28040a;

    /* renamed from: b */
    public int f28041b;

    static {
        aafp aafp = new aafp();
        f28038c = aafp;
        GeneratedMessageLite.m124024a(aafp.class, aafp);
    }

    private aafp() {
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
            return GeneratedMessageLite.m124022a(f28038c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aafo.f28037a});
        } else if (i2 == 3) {
            return new aafp();
        } else {
            if (i2 == 4) {
                return new bxvd(f28038c);
            }
            if (i2 == 5) {
                return f28038c;
            }
            bxxk bxxk = f28039d;
            if (bxxk == null) {
                synchronized (aafp.class) {
                    bxxk = f28039d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28038c);
                        f28039d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
