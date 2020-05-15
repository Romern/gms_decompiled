package p000;

/* renamed from: btbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbn extends bxvk implements bxxd {

    /* renamed from: l */
    public static final btbn f148167l;

    /* renamed from: m */
    private static volatile bxxk f148168m;

    /* renamed from: a */
    public String f148169a = "";

    /* renamed from: b */
    public String f148170b = "";

    /* renamed from: c */
    public String f148171c = "";

    /* renamed from: d */
    public int f148172d;

    /* renamed from: e */
    public long f148173e;

    /* renamed from: f */
    public String f148174f = "";

    /* renamed from: g */
    public int f148175g;

    /* renamed from: h */
    public long f148176h;

    /* renamed from: i */
    public long f148177i;

    /* renamed from: j */
    public String f148178j = "";

    /* renamed from: k */
    public int f148179k;

    static {
        btbn btbn = new btbn();
        f148167l = btbn;
        bxvk.m124024a(btbn.class, btbn);
    }

    private btbn() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f148167l, "\u0000\u000b\u0000\u0000\u0001\u0016\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\b\f\n\u0002\u000bȈ\f\f\r\u0002\u000e\u0002\u0012Ȉ\u0016\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new btbn();
        } else {
            if (i2 == 4) {
                return new bxvd(f148167l);
            }
            if (i2 == 5) {
                return f148167l;
            }
            bxxk bxxk = f148168m;
            if (bxxk == null) {
                synchronized (btbn.class) {
                    bxxk = f148168m;
                    if (bxxk == null) {
                        bxxk = new bxve(f148167l);
                        f148168m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
