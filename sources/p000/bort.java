package p000;

/* renamed from: bort */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bort extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bort f134503m;

    /* renamed from: n */
    private static volatile bxxk f134504n;

    /* renamed from: a */
    public int f134505a;

    /* renamed from: b */
    public String f134506b = "";

    /* renamed from: c */
    public String f134507c = "";

    /* renamed from: d */
    public String f134508d = "";

    /* renamed from: e */
    public boolean f134509e;

    /* renamed from: f */
    public int f134510f;

    /* renamed from: g */
    public boolean f134511g;

    /* renamed from: h */
    public boolean f134512h;

    /* renamed from: i */
    public borw f134513i;

    /* renamed from: j */
    public int f134514j;

    /* renamed from: k */
    public boolean f134515k;

    /* renamed from: l */
    public int f134516l;

    static {
        bort bort = new bort();
        f134503m = bort;
        bxvk.m124024a(bort.class, bort);
    }

    private bort() {
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
            return bxvk.m124022a(f134503m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0003\u0005ဇ\u0005\u0006ဇ\u0006\u0007ဉ\u0007\tဆ\t\nဇ\n\u000bင\u0004\fဈ\u0002\rင\u000b", new Object[]{"a", "b", "c", "e", "g", "h", "i", "j", "k", "f", "d", "l"});
        } else if (i2 == 3) {
            return new bort();
        } else {
            if (i2 == 4) {
                return new bxvd(f134503m);
            }
            if (i2 == 5) {
                return f134503m;
            }
            bxxk bxxk = f134504n;
            if (bxxk == null) {
                synchronized (bort.class) {
                    bxxk = f134504n;
                    if (bxxk == null) {
                        bxxk = new bxve(f134503m);
                        f134504n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
