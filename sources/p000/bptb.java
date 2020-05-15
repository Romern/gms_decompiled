package p000;

/* renamed from: bptb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bptb f139079e;

    /* renamed from: f */
    private static volatile bxxk f139080f;

    /* renamed from: a */
    public int f139081a;

    /* renamed from: b */
    public int f139082b;

    /* renamed from: c */
    public int f139083c;

    /* renamed from: d */
    public bpsv f139084d;

    static {
        bptb bptb = new bptb();
        f139079e = bptb;
        GeneratedMessageLite.m124024a(bptb.class, bptb);
    }

    private bptb() {
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
            return GeneratedMessageLite.m124022a(f139079e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bpeq.m111840b(), "c", "d"});
        } else if (i2 == 3) {
            return new bptb();
        } else {
            if (i2 == 4) {
                return new bxvd(f139079e);
            }
            if (i2 == 5) {
                return f139079e;
            }
            bxxk bxxk = f139080f;
            if (bxxk == null) {
                synchronized (bptb.class) {
                    bxxk = f139080f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139079e);
                        f139080f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
