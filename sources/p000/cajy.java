package p000;

/* renamed from: cajy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cajy f174896b;

    /* renamed from: c */
    private static volatile bxxk f174897c;

    /* renamed from: a */
    public bxwc f174898a = bxxn.f165040b;

    static {
        cajy cajy = new cajy();
        f174896b = cajy;
        GeneratedMessageLite.m124024a(cajy.class, cajy);
    }

    private cajy() {
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
            return GeneratedMessageLite.m124022a(f174896b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cakn.class});
        } else if (i2 == 3) {
            return new cajy();
        } else {
            if (i2 == 4) {
                return new bxvd(f174896b);
            }
            if (i2 == 5) {
                return f174896b;
            }
            bxxk bxxk = f174897c;
            if (bxxk == null) {
                synchronized (cajy.class) {
                    bxxk = f174897c;
                    if (bxxk == null) {
                        bxxk = new bxve(f174896b);
                        f174897c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
