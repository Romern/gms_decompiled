package p000;

/* renamed from: bztm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bztm f171347b;

    /* renamed from: c */
    private static volatile bxxk f171348c;

    /* renamed from: a */
    public bztl f171349a;

    static {
        bztm bztm = new bztm();
        f171347b = bztm;
        GeneratedMessageLite.m124024a(bztm.class, bztm);
    }

    private bztm() {
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
            return GeneratedMessageLite.m124022a(f171347b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171347b);
            }
            if (i2 == 5) {
                return f171347b;
            }
            bxxk bxxk = f171348c;
            if (bxxk == null) {
                synchronized (bztm.class) {
                    bxxk = f171348c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171347b);
                        f171348c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
