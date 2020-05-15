package p000;

/* renamed from: btzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btzh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btzh f153114d;

    /* renamed from: e */
    private static volatile bxxk f153115e;

    /* renamed from: a */
    public int f153116a;

    /* renamed from: b */
    public bxyk f153117b;

    /* renamed from: c */
    public bxyk f153118c;

    static {
        btzh btzh = new btzh();
        f153114d = btzh;
        GeneratedMessageLite.m124024a(btzh.class, btzh);
    }

    private btzh() {
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
            return GeneratedMessageLite.m124022a(f153114d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f153114d);
            }
            if (i2 == 5) {
                return f153114d;
            }
            bxxk bxxk = f153115e;
            if (bxxk == null) {
                synchronized (btzh.class) {
                    bxxk = f153115e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153114d);
                        f153115e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
