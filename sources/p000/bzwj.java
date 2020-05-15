package p000;

/* renamed from: bzwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzwj f171630g;

    /* renamed from: i */
    private static volatile bxxk f171631i;

    /* renamed from: a */
    public String f171632a = "";

    /* renamed from: b */
    public String f171633b = "";

    /* renamed from: c */
    public String f171634c = "";

    /* renamed from: d */
    public String f171635d = "";

    /* renamed from: e */
    public String f171636e = "";

    /* renamed from: f */
    public String f171637f = "";

    /* renamed from: h */
    private int f171638h;

    static {
        bzwj bzwj = new bzwj();
        f171630g = bzwj;
        GeneratedMessageLite.m124024a(bzwj.class, bzwj);
    }

    private bzwj() {
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
            return GeneratedMessageLite.m124022a(f171630g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171630g);
            }
            if (i2 == 5) {
                return f171630g;
            }
            bxxk bxxk = f171631i;
            if (bxxk == null) {
                synchronized (bzwj.class) {
                    bxxk = f171631i;
                    if (bxxk == null) {
                        bxxk = new bxve(f171630g);
                        f171631i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
