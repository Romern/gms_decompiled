package p000;

/* renamed from: bxiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxiz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxiz f163590d;

    /* renamed from: f */
    private static volatile bxxk f163591f;

    /* renamed from: a */
    public bxjd f163592a;

    /* renamed from: b */
    public bxwc f163593b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f163594c = bxxn.f165040b;

    /* renamed from: e */
    private int f163595e;

    static {
        bxiz bxiz = new bxiz();
        f163590d = bxiz;
        GeneratedMessageLite.m124024a(bxiz.class, bxiz);
    }

    private bxiz() {
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
            return GeneratedMessageLite.m124022a(f163590d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001c\u0003\u001b", new Object[]{"e", "a", "b", "c", bxii.class});
        } else if (i2 == 3) {
            return new bxiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f163590d);
            }
            if (i2 == 5) {
                return f163590d;
            }
            bxxk bxxk = f163591f;
            if (bxxk == null) {
                synchronized (bxiz.class) {
                    bxxk = f163591f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163590d);
                        f163591f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
