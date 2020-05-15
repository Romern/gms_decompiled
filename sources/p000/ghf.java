package p000;

/* renamed from: ghf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghf extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final ghf f18232h;

    /* renamed from: i */
    private static volatile bxxk f18233i;

    /* renamed from: a */
    public int f18234a;

    /* renamed from: b */
    public int f18235b;

    /* renamed from: c */
    public int f18236c;

    /* renamed from: d */
    public String f18237d = "";

    /* renamed from: e */
    public int f18238e;

    /* renamed from: f */
    public long f18239f;

    /* renamed from: g */
    public int f18240g;

    static {
        ghf ghf = new ghf();
        f18232h = ghf;
        GeneratedMessageLite.m124024a(ghf.class, ghf);
    }

    private ghf() {
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
            return GeneratedMessageLite.m124022a(f18232h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new ghf();
        } else {
            if (i2 == 4) {
                return new bxvd(f18232h);
            }
            if (i2 == 5) {
                return f18232h;
            }
            bxxk bxxk = f18233i;
            if (bxxk == null) {
                synchronized (ghf.class) {
                    bxxk = f18233i;
                    if (bxxk == null) {
                        bxxk = new bxve(f18232h);
                        f18233i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
