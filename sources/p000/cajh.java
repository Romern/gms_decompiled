package p000;

/* renamed from: cajh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cajh f174820f;

    /* renamed from: g */
    private static volatile bxxk f174821g;

    /* renamed from: a */
    public int f174822a;

    /* renamed from: b */
    public int f174823b;

    /* renamed from: c */
    public cajl f174824c;

    /* renamed from: d */
    public String f174825d = "";

    /* renamed from: e */
    public int f174826e;

    static {
        cajh cajh = new cajh();
        f174820f = cajh;
        GeneratedMessageLite.m124024a(cajh.class, cajh);
    }

    private cajh() {
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
            return GeneratedMessageLite.m124022a(f174820f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", cajg.f174819a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new cajh();
        } else {
            if (i2 == 4) {
                return new bxvd(f174820f);
            }
            if (i2 == 5) {
                return f174820f;
            }
            bxxk bxxk = f174821g;
            if (bxxk == null) {
                synchronized (cajh.class) {
                    bxxk = f174821g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174820f);
                        f174821g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
