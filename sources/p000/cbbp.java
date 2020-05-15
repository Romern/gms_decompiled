package p000;

/* renamed from: cbbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbbp f176598c;

    /* renamed from: d */
    private static volatile bxxk f176599d;

    /* renamed from: a */
    public int f176600a = 0;

    /* renamed from: b */
    public Object f176601b;

    static {
        cbbp cbbp = new cbbp();
        f176598c = cbbp;
        GeneratedMessageLite.m124024a(cbbp.class, cbbp);
    }

    private cbbp() {
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
            return GeneratedMessageLite.m124022a(f176598c, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", cbjf.class, cbjh.class});
        } else if (i2 == 3) {
            return new cbbp();
        } else {
            if (i2 == 4) {
                return new bxvd(f176598c);
            }
            if (i2 == 5) {
                return f176598c;
            }
            bxxk bxxk = f176599d;
            if (bxxk == null) {
                synchronized (cbbp.class) {
                    bxxk = f176599d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176598c);
                        f176599d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
