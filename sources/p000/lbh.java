package p000;

/* renamed from: lbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final lbh f25725b;

    /* renamed from: c */
    private static volatile bxxk f25726c;

    /* renamed from: a */
    public String f25727a = "";

    static {
        lbh lbh = new lbh();
        f25725b = lbh;
        GeneratedMessageLite.m124024a(lbh.class, lbh);
    }

    private lbh() {
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
            return GeneratedMessageLite.m124022a(f25725b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new lbh();
        } else {
            if (i2 == 4) {
                return new bxvd(f25725b);
            }
            if (i2 == 5) {
                return f25725b;
            }
            bxxk bxxk = f25726c;
            if (bxxk == null) {
                synchronized (lbh.class) {
                    bxxk = f25726c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25725b);
                        f25726c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
