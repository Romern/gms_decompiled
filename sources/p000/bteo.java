package p000;

/* renamed from: bteo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bteo f148536c;

    /* renamed from: d */
    private static volatile bxxk f148537d;

    /* renamed from: a */
    public String f148538a = "";

    /* renamed from: b */
    public int f148539b;

    static {
        bteo bteo = new bteo();
        f148536c = bteo;
        GeneratedMessageLite.m124024a(bteo.class, bteo);
    }

    private bteo() {
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
            return GeneratedMessageLite.m124022a(f148536c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bteo();
        } else {
            if (i2 == 4) {
                return new bxvd(f148536c);
            }
            if (i2 == 5) {
                return f148536c;
            }
            bxxk bxxk = f148537d;
            if (bxxk == null) {
                synchronized (bteo.class) {
                    bxxk = f148537d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148536c);
                        f148537d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
