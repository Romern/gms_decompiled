package p000;

/* renamed from: ackz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ackz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ackz f60054c;

    /* renamed from: d */
    private static volatile bxxk f60055d;

    /* renamed from: a */
    public String f60056a = "";

    /* renamed from: b */
    public String f60057b = "";

    static {
        ackz ackz = new ackz();
        f60054c = ackz;
        GeneratedMessageLite.m124024a(ackz.class, ackz);
    }

    private ackz() {
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
            return GeneratedMessageLite.m124022a(f60054c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ackz();
        } else {
            if (i2 == 4) {
                return new bxvd(f60054c);
            }
            if (i2 == 5) {
                return f60054c;
            }
            bxxk bxxk = f60055d;
            if (bxxk == null) {
                synchronized (ackz.class) {
                    bxxk = f60055d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60054c);
                        f60055d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
