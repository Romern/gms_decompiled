package p000;

/* renamed from: cabh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabh f172434c;

    /* renamed from: e */
    private static volatile bxxk f172435e;

    /* renamed from: a */
    public bxyk f172436a;

    /* renamed from: b */
    public bxyk f172437b;

    /* renamed from: d */
    private int f172438d;

    static {
        cabh cabh = new cabh();
        f172434c = cabh;
        GeneratedMessageLite.m124024a(cabh.class, cabh);
    }

    private cabh() {
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
            return GeneratedMessageLite.m124022a(f172434c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cabh();
        } else {
            if (i2 == 4) {
                return new bxvd(f172434c);
            }
            if (i2 == 5) {
                return f172434c;
            }
            bxxk bxxk = f172435e;
            if (bxxk == null) {
                synchronized (cabh.class) {
                    bxxk = f172435e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172434c);
                        f172435e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
