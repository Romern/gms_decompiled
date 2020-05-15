package p000;

/* renamed from: btfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfe extends bxvk implements bxxd {

    /* renamed from: m */
    public static final btfe f148622m;

    /* renamed from: n */
    private static volatile bxxk f148623n;

    /* renamed from: a */
    public long f148624a;

    /* renamed from: b */
    public String f148625b = "";

    /* renamed from: c */
    public String f148626c = "";

    /* renamed from: d */
    public String f148627d = "";

    /* renamed from: e */
    public String f148628e = "";

    /* renamed from: f */
    public boolean f148629f;

    /* renamed from: g */
    public boolean f148630g;

    /* renamed from: h */
    public boolean f148631h;

    /* renamed from: i */
    public String f148632i = "";

    /* renamed from: j */
    public String f148633j = "";

    /* renamed from: k */
    public boolean f148634k;

    /* renamed from: l */
    public String f148635l = "";

    static {
        btfe btfe = new btfe();
        f148622m = btfe;
        bxvk.m124024a(btfe.class, btfe);
    }

    private btfe() {
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
            return bxvk.m124022a(f148622m, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000b\u0007\fȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new btfe();
        } else {
            if (i2 == 4) {
                return new bxvd(f148622m);
            }
            if (i2 == 5) {
                return f148622m;
            }
            bxxk bxxk = f148623n;
            if (bxxk == null) {
                synchronized (btfe.class) {
                    bxxk = f148623n;
                    if (bxxk == null) {
                        bxxk = new bxve(f148622m);
                        f148623n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
