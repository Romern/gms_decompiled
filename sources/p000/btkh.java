package p000;

/* renamed from: btkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btkh f149254b;

    /* renamed from: c */
    private static volatile bxxk f149255c;

    /* renamed from: a */
    public String f149256a = "";

    static {
        btkh btkh = new btkh();
        f149254b = btkh;
        GeneratedMessageLite.m124024a(btkh.class, btkh);
    }

    private btkh() {
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
            return GeneratedMessageLite.m124022a(f149254b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkh();
        } else {
            if (i2 == 4) {
                return new bxvd(f149254b);
            }
            if (i2 == 5) {
                return f149254b;
            }
            bxxk bxxk = f149255c;
            if (bxxk == null) {
                synchronized (btkh.class) {
                    bxxk = f149255c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149254b);
                        f149255c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
