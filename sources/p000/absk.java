package p000;

/* renamed from: absk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final absk f58105c;

    /* renamed from: d */
    private static volatile bxxk f58106d;

    /* renamed from: a */
    public int f58107a = 0;

    /* renamed from: b */
    public Object f58108b;

    static {
        absk absk = new absk();
        f58105c = absk;
        GeneratedMessageLite.m124024a(absk.class, absk);
    }

    private absk() {
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
            return GeneratedMessageLite.m124022a(f58105c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bxup.class, bxup.class, abso.class, bxup.class});
        } else if (i2 == 3) {
            return new absk();
        } else {
            if (i2 == 4) {
                return new bxvd(f58105c);
            }
            if (i2 == 5) {
                return f58105c;
            }
            bxxk bxxk = f58106d;
            if (bxxk == null) {
                synchronized (absk.class) {
                    bxxk = f58106d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58105c);
                        f58106d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
