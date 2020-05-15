package p000;

/* renamed from: bvoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvoh f157036c;

    /* renamed from: d */
    private static volatile bxxk f157037d;

    /* renamed from: a */
    public bxwc f157038a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157039b = bxxn.f165040b;

    static {
        bvoh bvoh = new bvoh();
        f157036c = bvoh;
        GeneratedMessageLite.m124024a(bvoh.class, bvoh);
    }

    private bvoh() {
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
            return GeneratedMessageLite.m124022a(f157036c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bvon.class, "b", bvom.class});
        } else if (i2 == 3) {
            return new bvoh();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157036c;
            }
            bxxk bxxk = f157037d;
            if (bxxk == null) {
                synchronized (bvoh.class) {
                    bxxk = f157037d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157036c);
                        f157037d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
