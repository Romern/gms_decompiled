package p000;

/* renamed from: byfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byfo f166053c;

    /* renamed from: d */
    private static volatile bxxk f166054d;

    /* renamed from: a */
    public int f166055a;

    /* renamed from: b */
    public bocj f166056b;

    static {
        byfo byfo = new byfo();
        f166053c = byfo;
        GeneratedMessageLite.m124024a(byfo.class, byfo);
    }

    private byfo() {
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
            return GeneratedMessageLite.m124022a(f166053c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f166053c);
            }
            if (i2 == 5) {
                return f166053c;
            }
            bxxk bxxk = f166054d;
            if (bxxk == null) {
                synchronized (byfo.class) {
                    bxxk = f166054d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166053c);
                        f166054d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
