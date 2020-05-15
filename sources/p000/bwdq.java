package p000;

/* renamed from: bwdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwdq f158915c;

    /* renamed from: d */
    private static volatile bxxk f158916d;

    /* renamed from: a */
    public int f158917a = 0;

    /* renamed from: b */
    public Object f158918b;

    static {
        bwdq bwdq = new bwdq();
        f158915c = bwdq;
        GeneratedMessageLite.m124024a(bwdq.class, bwdq);
    }

    private bwdq() {
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
            return GeneratedMessageLite.m124022a(f158915c, "\u0001\u0001\u0001\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဵ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwdq();
        } else {
            if (i2 == 4) {
                return new bxvd(f158915c);
            }
            if (i2 == 5) {
                return f158915c;
            }
            bxxk bxxk = f158916d;
            if (bxxk == null) {
                synchronized (bwdq.class) {
                    bxxk = f158916d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158915c);
                        f158916d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
