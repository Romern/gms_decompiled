package p000;

/* renamed from: bwph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwph extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwph f160546g;

    /* renamed from: h */
    public static final bxvj f160547h;

    /* renamed from: j */
    private static volatile bxxk f160548j;

    /* renamed from: a */
    public String f160549a = "";

    /* renamed from: b */
    public String f160550b = "";

    /* renamed from: c */
    public String f160551c = "";

    /* renamed from: d */
    public String f160552d = "";

    /* renamed from: e */
    public boolean f160553e = true;

    /* renamed from: f */
    public boolean f160554f;

    /* renamed from: i */
    private int f160555i;

    static {
        bwph bwph = new bwph();
        f160546g = bwph;
        GeneratedMessageLite.m124024a(bwph.class, bwph);
        bwny bwny = bwny.f160414k;
        bwph bwph2 = f160546g;
        f160547h = GeneratedMessageLite.m124006a(bwny, bwph2, bwph2, 277998451, bxzf.MESSAGE);
    }

    private bwph() {
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
            return GeneratedMessageLite.m124022a(f160546g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"i", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bwph();
        } else {
            if (i2 == 4) {
                return new bxvd(f160546g);
            }
            if (i2 == 5) {
                return f160546g;
            }
            bxxk bxxk = f160548j;
            if (bxxk == null) {
                synchronized (bwph.class) {
                    bxxk = f160548j;
                    if (bxxk == null) {
                        bxxk = new bxve(f160546g);
                        f160548j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
