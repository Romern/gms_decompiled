package p000;

/* renamed from: bymw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bymw f167083c;

    /* renamed from: d */
    private static volatile bxxk f167084d;

    /* renamed from: a */
    public String f167085a = "";

    /* renamed from: b */
    public String f167086b = "";

    static {
        bymw bymw = new bymw();
        f167083c = bymw;
        GeneratedMessageLite.m124024a(bymw.class, bymw);
    }

    private bymw() {
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
            return GeneratedMessageLite.m124022a(f167083c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bymw();
        } else {
            if (i2 == 4) {
                return new bxvd(f167083c);
            }
            if (i2 == 5) {
                return f167083c;
            }
            bxxk bxxk = f167084d;
            if (bxxk == null) {
                synchronized (bymw.class) {
                    bxxk = f167084d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167083c);
                        f167084d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
