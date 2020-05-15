package p000;

/* renamed from: buef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buef extends bxvk implements bxxd {

    /* renamed from: f */
    public static final buef f153574f;

    /* renamed from: h */
    private static volatile bxxk f153575h;

    /* renamed from: a */
    public boolean f153576a;

    /* renamed from: b */
    public long f153577b;

    /* renamed from: c */
    public int f153578c;

    /* renamed from: d */
    public long f153579d;

    /* renamed from: e */
    public long f153580e;

    /* renamed from: g */
    private int f153581g;

    static {
        buef buef = new buef();
        f153574f = buef;
        bxvk.m124024a(buef.class, buef);
    }

    private buef() {
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
            return bxvk.m124022a(f153574f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဃ\u0003\u0005ဃ\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new buef();
        } else {
            if (i2 == 4) {
                return new bxvd(f153574f);
            }
            if (i2 == 5) {
                return f153574f;
            }
            bxxk bxxk = f153575h;
            if (bxxk == null) {
                synchronized (buef.class) {
                    bxxk = f153575h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153574f);
                        f153575h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
