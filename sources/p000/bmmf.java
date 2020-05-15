package p000;

/* renamed from: bmmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmmf f130003c;

    /* renamed from: d */
    private static volatile bxxk f130004d;

    /* renamed from: a */
    public int f130005a;

    /* renamed from: b */
    public bmag f130006b;

    static {
        bmmf bmmf = new bmmf();
        f130003c = bmmf;
        GeneratedMessageLite.m124024a(bmmf.class, bmmf);
    }

    private bmmf() {
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
            return GeneratedMessageLite.m124022a(f130003c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmmf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130003c);
            }
            if (i2 == 5) {
                return f130003c;
            }
            bxxk bxxk = f130004d;
            if (bxxk == null) {
                synchronized (bmmf.class) {
                    bxxk = f130004d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130003c);
                        f130004d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
