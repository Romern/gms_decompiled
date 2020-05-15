package p000;

/* renamed from: ayev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayev extends bxvk implements bxxd {

    /* renamed from: n */
    public static final ayev f97376n;

    /* renamed from: p */
    private static volatile bxxk f97377p;

    /* renamed from: a */
    public int f97378a;

    /* renamed from: b */
    public ayfb f97379b;

    /* renamed from: c */
    public ayea f97380c;

    /* renamed from: d */
    public ayes f97381d;

    /* renamed from: e */
    public ayeo f97382e;

    /* renamed from: f */
    public ayer f97383f;

    /* renamed from: g */
    public ayfe f97384g;

    /* renamed from: h */
    public ayfc f97385h;

    /* renamed from: i */
    public ayfa f97386i;

    /* renamed from: j */
    public ayfa f97387j;

    /* renamed from: k */
    public ayeu f97388k;

    /* renamed from: l */
    public ayet f97389l;

    /* renamed from: m */
    public boolean f97390m;

    /* renamed from: o */
    private byte f97391o = 2;

    static {
        ayev ayev = new ayev();
        f97376n = ayev;
        bxvk.m124024a(ayev.class, ayev);
    }

    private ayev() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97391o);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97391o = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97376n, "\u0001\f\u0000\u0001\u0004\u0011\f\u0000\u0000\b\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bဉ\u0005\tᐉ\u0006\nᐉ\u0007\u000bဉ\t\fᐉ\n\rဇ\u000b\u0010ᐉ\b\u0011ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "k", "l", "m", "j", "f"});
        } else if (i2 == 3) {
            return new ayev();
        } else {
            if (i2 == 4) {
                return new bxvd(f97376n);
            }
            if (i2 == 5) {
                return f97376n;
            }
            bxxk bxxk = f97377p;
            if (bxxk == null) {
                synchronized (ayev.class) {
                    bxxk = f97377p;
                    if (bxxk == null) {
                        bxxk = new bxve(f97376n);
                        f97377p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
