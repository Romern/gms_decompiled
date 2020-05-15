package p000;

/* renamed from: cblj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cblj f177513f;

    /* renamed from: g */
    private static volatile bxxk f177514g;

    /* renamed from: a */
    public cbmo f177515a;

    /* renamed from: b */
    public cbma f177516b;

    /* renamed from: c */
    public String f177517c = "";

    /* renamed from: d */
    public cbld f177518d;

    /* renamed from: e */
    public boolean f177519e;

    static {
        cblj cblj = new cblj();
        f177513f = cblj;
        GeneratedMessageLite.m124024a(cblj.class, cblj);
    }

    private cblj() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f177513f, "\u0000\u0005\u0000\u0000\u0001\u0012\u0005\u0000\u0000\u0000\u0001\t\u0005\t\b\u0007\nȈ\u0012\t", new Object[]{"a", "b", "e", "c", "d"});
        } else if (i2 == 3) {
            return new cblj();
        } else {
            if (i2 == 4) {
                return new bxvd(f177513f);
            }
            if (i2 == 5) {
                return f177513f;
            }
            bxxk bxxk = f177514g;
            if (bxxk == null) {
                synchronized (cblj.class) {
                    bxxk = f177514g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177513f);
                        f177514g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
