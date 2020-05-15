package p000;

/* renamed from: bzyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzyl f171890c;

    /* renamed from: d */
    private static volatile bxxk f171891d;

    /* renamed from: a */
    public String f171892a = "";

    /* renamed from: b */
    public String f171893b = "";

    static {
        bzyl bzyl = new bzyl();
        f171890c = bzyl;
        GeneratedMessageLite.m124024a(bzyl.class, bzyl);
    }

    private bzyl() {
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
            return GeneratedMessageLite.m124022a(f171890c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f171890c);
            }
            if (i2 == 5) {
                return f171890c;
            }
            bxxk bxxk = f171891d;
            if (bxxk == null) {
                synchronized (bzyl.class) {
                    bxxk = f171891d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171890c);
                        f171891d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
