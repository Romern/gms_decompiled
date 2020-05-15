package p000;

/* renamed from: bxny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxny extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bxny f164115k;

    /* renamed from: l */
    public static final bxvj f164116l;

    /* renamed from: m */
    private static volatile bxxk f164117m;

    /* renamed from: a */
    public int f164118a;

    /* renamed from: b */
    public String f164119b = "";

    /* renamed from: c */
    public boolean f164120c;

    /* renamed from: d */
    public boolean f164121d;

    /* renamed from: e */
    public boolean f164122e;

    /* renamed from: f */
    public boolean f164123f;

    /* renamed from: g */
    public boolean f164124g;

    /* renamed from: h */
    public boolean f164125h;

    /* renamed from: i */
    public boolean f164126i;

    /* renamed from: j */
    public boolean f164127j;

    static {
        bxny bxny = new bxny();
        f164115k = bxny;
        GeneratedMessageLite.m124024a(bxny.class, bxny);
        bxcf bxcf = bxcf.f162779a;
        bxny bxny2 = f164115k;
        f164116l = GeneratedMessageLite.m124006a(bxcf, bxny2, bxny2, 157164189, bxzf.MESSAGE);
    }

    private bxny() {
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
            return GeneratedMessageLite.m124022a(f164115k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bxny();
        } else {
            if (i2 == 4) {
                return new bxvd(f164115k);
            }
            if (i2 == 5) {
                return f164115k;
            }
            bxxk bxxk = f164117m;
            if (bxxk == null) {
                synchronized (bxny.class) {
                    bxxk = f164117m;
                    if (bxxk == null) {
                        bxxk = new bxve(f164115k);
                        f164117m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
