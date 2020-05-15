package p000;

/* renamed from: bbib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbib extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bbib f102689f;

    /* renamed from: g */
    private static volatile bxxk f102690g;

    /* renamed from: a */
    public int f102691a;

    /* renamed from: b */
    public int f102692b;

    /* renamed from: c */
    public String f102693c = "";

    /* renamed from: d */
    public String f102694d = "";

    /* renamed from: e */
    public String f102695e = "";

    static {
        bbib bbib = new bbib();
        f102689f = bbib;
        bxvk.m124024a(bbib.class, bbib);
    }

    private bbib() {
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
            return bxvk.m124022a(f102689f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bbib();
        } else {
            if (i2 == 4) {
                return new bxvd(f102689f);
            }
            if (i2 == 5) {
                return f102689f;
            }
            bxxk bxxk = f102690g;
            if (bxxk == null) {
                synchronized (bbib.class) {
                    bxxk = f102690g;
                    if (bxxk == null) {
                        bxxk = new bxve(f102689f);
                        f102690g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
