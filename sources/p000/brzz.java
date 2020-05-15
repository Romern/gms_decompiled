package p000;

/* renamed from: brzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final brzz f143815b;

    /* renamed from: c */
    private static volatile bxxk f143816c;

    /* renamed from: a */
    public bxwc f143817a = bxxn.f165040b;

    static {
        brzz brzz = new brzz();
        f143815b = brzz;
        GeneratedMessageLite.m124024a(brzz.class, brzz);
    }

    private brzz() {
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
            return GeneratedMessageLite.m124022a(f143815b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsah.class});
        } else if (i2 == 3) {
            return new brzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f143815b);
            }
            if (i2 == 5) {
                return f143815b;
            }
            bxxk bxxk = f143816c;
            if (bxxk == null) {
                synchronized (brzz.class) {
                    bxxk = f143816c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143815b);
                        f143816c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
