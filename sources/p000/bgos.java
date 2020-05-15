package p000;

/* renamed from: bgos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgos extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bgos f116954f;

    /* renamed from: g */
    private static volatile bxxk f116955g;

    /* renamed from: a */
    public int f116956a;

    /* renamed from: b */
    public int f116957b = 0;

    /* renamed from: c */
    public Object f116958c;

    /* renamed from: d */
    public int f116959d;

    /* renamed from: e */
    public String f116960e = "";

    static {
        bgos bgos = new bgos();
        f116954f = bgos;
        GeneratedMessageLite.m124024a(bgos.class, bgos);
    }

    private bgos() {
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
            return GeneratedMessageLite.m124022a(f116954f, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003့\u0000\u0004ဵ\u0000\u0005ဴ\u0000\u0006ဳ\u0000\u0007ျ\u0000\b်\u0000", new Object[]{"c", "b", "a", "d", bgor.f116953a, "e"});
        } else if (i2 == 3) {
            return new bgos();
        } else {
            if (i2 == 4) {
                return new bxvd(f116954f);
            }
            if (i2 == 5) {
                return f116954f;
            }
            bxxk bxxk = f116955g;
            if (bxxk == null) {
                synchronized (bgos.class) {
                    bxxk = f116955g;
                    if (bxxk == null) {
                        bxxk = new bxve(f116954f);
                        f116955g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
