package p000;

/* renamed from: bzhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzhm f170090b;

    /* renamed from: d */
    private static volatile bxxk f170091d;

    /* renamed from: a */
    public bxwc f170092a = bxxn.f165040b;

    /* renamed from: c */
    private byte f170093c = 2;

    static {
        bzhm bzhm = new bzhm();
        f170090b = bzhm;
        GeneratedMessageLite.m124024a(bzhm.class, bzhm);
    }

    private bzhm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170093c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170093c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170090b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bzhk.class});
        } else if (i2 == 3) {
            return new bzhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170090b);
            }
            if (i2 == 5) {
                return f170090b;
            }
            bxxk bxxk = f170091d;
            if (bxxk == null) {
                synchronized (bzhm.class) {
                    bxxk = f170091d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170090b);
                        f170091d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
