package p000;

/* renamed from: bivq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bivq f122029d;

    /* renamed from: g */
    private static volatile bxxk f122030g;

    /* renamed from: a */
    public int f122031a;

    /* renamed from: b */
    public int f122032b;

    /* renamed from: c */
    public int f122033c;

    /* renamed from: e */
    private int f122034e;

    /* renamed from: f */
    private byte f122035f = 2;

    static {
        bivq bivq = new bivq();
        f122029d = bivq;
        GeneratedMessageLite.m124024a(bivq.class, bivq);
    }

    private bivq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122035f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122035f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f122029d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bivq();
        } else {
            if (i2 == 4) {
                return new bxvd(f122029d);
            }
            if (i2 == 5) {
                return f122029d;
            }
            bxxk bxxk = f122030g;
            if (bxxk == null) {
                synchronized (bivq.class) {
                    bxxk = f122030g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122029d);
                        f122030g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
