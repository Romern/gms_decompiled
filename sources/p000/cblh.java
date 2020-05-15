package p000;

/* renamed from: cblh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cblh f177503d;

    /* renamed from: e */
    private static volatile bxxk f177504e;

    /* renamed from: a */
    public cbmo f177505a;

    /* renamed from: b */
    public cbma f177506b;

    /* renamed from: c */
    public cbld f177507c;

    static {
        cblh cblh = new cblh();
        f177503d = cblh;
        GeneratedMessageLite.m124024a(cblh.class, cblh);
    }

    private cblh() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f177503d, "\u0000\u0003\u0000\u0000\u0006\u0012\u0003\u0000\u0000\u0000\u0006\t\n\t\u0012\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cblh();
        } else {
            if (i2 == 4) {
                return new bxvd(f177503d);
            }
            if (i2 == 5) {
                return f177503d;
            }
            bxxk bxxk = f177504e;
            if (bxxk == null) {
                synchronized (cblh.class) {
                    bxxk = f177504e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177503d);
                        f177504e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
