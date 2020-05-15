package p000;

/* renamed from: bvhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvhh f156066c;

    /* renamed from: d */
    private static volatile bxxk f156067d;

    /* renamed from: a */
    public int f156068a;

    /* renamed from: b */
    public boolean f156069b;

    static {
        bvhh bvhh = new bvhh();
        f156066c = bvhh;
        GeneratedMessageLite.m124024a(bvhh.class, bvhh);
    }

    private bvhh() {
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
            return GeneratedMessageLite.m124022a(f156066c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvhh();
        } else {
            if (i2 == 4) {
                return new bxvd(f156066c);
            }
            if (i2 == 5) {
                return f156066c;
            }
            bxxk bxxk = f156067d;
            if (bxxk == null) {
                synchronized (bvhh.class) {
                    bxxk = f156067d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156066c);
                        f156067d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
