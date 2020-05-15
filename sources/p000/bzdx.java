package p000;

/* renamed from: bzdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdx extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bzdx f169595q;

    /* renamed from: r */
    private static volatile bxxk f169596r;

    /* renamed from: a */
    public boolean f169597a;

    /* renamed from: b */
    public boolean f169598b;

    /* renamed from: c */
    public boolean f169599c;

    /* renamed from: d */
    public boolean f169600d;

    /* renamed from: e */
    public int f169601e;

    /* renamed from: f */
    public int f169602f;

    /* renamed from: g */
    public int f169603g;

    /* renamed from: h */
    public int f169604h;

    /* renamed from: i */
    public boolean f169605i;

    /* renamed from: j */
    public boolean f169606j;

    /* renamed from: k */
    public boolean f169607k;

    /* renamed from: l */
    public boolean f169608l;

    /* renamed from: m */
    public bzdw f169609m;

    /* renamed from: n */
    public int f169610n;

    /* renamed from: o */
    public int f169611o;

    /* renamed from: p */
    public int f169612p;

    static {
        bzdx bzdx = new bzdx();
        f169595q = bzdx;
        bxvk.m124024a(bzdx.class, bzdx);
    }

    private bzdx() {
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
            return bxvk.m124022a(f169595q, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0007\n\u0007\u000b\u0007\f\u0007\r\t\u000e\u0004\u000f\u0004\u0010\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new bzdx();
        } else {
            if (i2 == 4) {
                return new bxvd(f169595q);
            }
            if (i2 == 5) {
                return f169595q;
            }
            bxxk bxxk = f169596r;
            if (bxxk == null) {
                synchronized (bzdx.class) {
                    bxxk = f169596r;
                    if (bxxk == null) {
                        bxxk = new bxve(f169595q);
                        f169596r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
