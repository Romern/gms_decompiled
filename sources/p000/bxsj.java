package p000;

/* renamed from: bxsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxsj f164687g;

    /* renamed from: h */
    private static volatile bxxk f164688h;

    /* renamed from: a */
    public int f164689a;

    /* renamed from: b */
    public bxsi f164690b;

    /* renamed from: c */
    public bxsk f164691c;

    /* renamed from: d */
    public bxsc f164692d;

    /* renamed from: e */
    public bxsk f164693e;

    /* renamed from: f */
    public bxwc f164694f = bxxn.f165040b;

    static {
        bxsj bxsj = new bxsj();
        f164687g = bxsj;
        GeneratedMessageLite.m124024a(bxsj.class, bxsj);
    }

    private bxsj() {
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
            return GeneratedMessageLite.m124022a(f164687g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bxsk.class});
        } else if (i2 == 3) {
            return new bxsj();
        } else {
            if (i2 == 4) {
                return new bxvd(f164687g);
            }
            if (i2 == 5) {
                return f164687g;
            }
            bxxk bxxk = f164688h;
            if (bxxk == null) {
                synchronized (bxsj.class) {
                    bxxk = f164688h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164687g);
                        f164688h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
