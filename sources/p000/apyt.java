package p000;

/* renamed from: apyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final apyt f85182c;

    /* renamed from: e */
    private static volatile bxxk f85183e;

    /* renamed from: a */
    public int f85184a;

    /* renamed from: b */
    public long f85185b;

    /* renamed from: d */
    private int f85186d;

    static {
        apyt apyt = new apyt();
        f85182c = apyt;
        GeneratedMessageLite.m124024a(apyt.class, apyt);
    }

    private apyt() {
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
            return GeneratedMessageLite.m124022a(f85182c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new apyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f85182c);
            }
            if (i2 == 5) {
                return f85182c;
            }
            bxxk bxxk = f85183e;
            if (bxxk == null) {
                synchronized (apyt.class) {
                    bxxk = f85183e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85182c);
                        f85183e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
