package p000;

/* renamed from: bwkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwkh f159966b;

    /* renamed from: d */
    private static volatile bxxk f159967d;

    /* renamed from: a */
    public int f159968a;

    /* renamed from: c */
    private int f159969c;

    static {
        bwkh bwkh = new bwkh();
        f159966b = bwkh;
        GeneratedMessageLite.m124024a(bwkh.class, bwkh);
    }

    private bwkh() {
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
            return GeneratedMessageLite.m124022a(f159966b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bwkf.f159965a});
        } else if (i2 == 3) {
            return new bwkh();
        } else {
            if (i2 == 4) {
                return new bxvd(f159966b);
            }
            if (i2 == 5) {
                return f159966b;
            }
            bxxk bxxk = f159967d;
            if (bxxk == null) {
                synchronized (bwkh.class) {
                    bxxk = f159967d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159966b);
                        f159967d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
