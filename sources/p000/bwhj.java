package p000;

/* renamed from: bwhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwhj f159512g;

    /* renamed from: i */
    private static volatile bxxk f159513i;

    /* renamed from: a */
    public String f159514a = "";

    /* renamed from: b */
    public String f159515b = "";

    /* renamed from: c */
    public int f159516c;

    /* renamed from: d */
    public String f159517d = "";

    /* renamed from: e */
    public String f159518e = "";

    /* renamed from: f */
    public String f159519f = "";

    /* renamed from: h */
    private int f159520h;

    static {
        bwhj bwhj = new bwhj();
        f159512g = bwhj;
        GeneratedMessageLite.m124024a(bwhj.class, bwhj);
    }

    private bwhj() {
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
            return GeneratedMessageLite.m124022a(f159512g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"h", "a", "b", "c", bwhh.f159511a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new bwhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f159512g);
            }
            if (i2 == 5) {
                return f159512g;
            }
            bxxk bxxk = f159513i;
            if (bxxk == null) {
                synchronized (bwhj.class) {
                    bxxk = f159513i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159512g);
                        f159513i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
