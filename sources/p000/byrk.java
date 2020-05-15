package p000;

/* renamed from: byrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byrk f167486d;

    /* renamed from: f */
    private static volatile bxxk f167487f;

    /* renamed from: a */
    public int f167488a;

    /* renamed from: b */
    public bytb f167489b;

    /* renamed from: c */
    public int f167490c;

    /* renamed from: e */
    private byte f167491e = 2;

    static {
        byrk byrk = new byrk();
        f167486d = byrk;
        GeneratedMessageLite.m124024a(byrk.class, byrk);
    }

    private byrk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167491e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167491e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167486d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byrk();
        } else {
            if (i2 == 4) {
                return new bxvd(f167486d);
            }
            if (i2 == 5) {
                return f167486d;
            }
            bxxk bxxk = f167487f;
            if (bxxk == null) {
                synchronized (byrk.class) {
                    bxxk = f167487f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167486d);
                        f167487f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
