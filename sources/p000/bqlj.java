package p000;

/* renamed from: bqlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqlj f141104c;

    /* renamed from: d */
    private static volatile bxxk f141105d;

    /* renamed from: a */
    public bqli f141106a;

    /* renamed from: b */
    public bxwc f141107b = bxxn.f165040b;

    static {
        bqlj bqlj = new bqlj();
        f141104c = bqlj;
        GeneratedMessageLite.m124024a(bqlj.class, bqlj);
    }

    private bqlj() {
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
            return GeneratedMessageLite.m124022a(f141104c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", bqlh.class});
        } else if (i2 == 3) {
            return new bqlj();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141104c;
            }
            bxxk bxxk = f141105d;
            if (bxxk == null) {
                synchronized (bqlj.class) {
                    bxxk = f141105d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141104c);
                        f141105d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
