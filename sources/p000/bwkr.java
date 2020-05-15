package p000;

/* renamed from: bwkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkr extends bxvk implements bxxd {

    /* renamed from: r */
    public static final bwkr f160009r;

    /* renamed from: t */
    private static volatile bxxk f160010t;

    /* renamed from: a */
    public int f160011a;

    /* renamed from: b */
    public long f160012b;

    /* renamed from: c */
    public String f160013c = "";

    /* renamed from: d */
    public bmno f160014d;

    /* renamed from: e */
    public bxwc f160015e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f160016f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f160017g = bxxn.f165040b;

    /* renamed from: h */
    public bmlz f160018h;

    /* renamed from: i */
    public bxwc f160019i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f160020j = bxxn.f165040b;

    /* renamed from: k */
    public bmev f160021k;

    /* renamed from: l */
    public bxwc f160022l = bxxn.f165040b;

    /* renamed from: m */
    public bwib f160023m;

    /* renamed from: n */
    public bmob f160024n;

    /* renamed from: o */
    public bwhv f160025o;

    /* renamed from: p */
    public bmkw f160026p;

    /* renamed from: q */
    public bwhn f160027q;

    /* renamed from: s */
    private byte f160028s = 2;

    static {
        bwkr bwkr = new bwkr();
        f160009r = bwkr;
        bxvk.m124024a(bwkr.class, bwkr);
    }

    private bwkr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160028s);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160028s = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160009r, "\u0001\u0010\u0000\u0001\u0001\u001d\u0010\u0000\u0006\u0004\u0001ဈ\u0001\u0002Л\u0003Л\u0004\u001b\u0005ဉ\u0003\u0007\u001b\b\u001b\u000bဉ\u0004\rဉ\u0002\u0012\u001b\u0017ဂ\u0000\u0018ဉ\u0005\u001aᐉ\u0007\u001bᐉ\b\u001cဉ\t\u001dဉ\u0006", new Object[]{"a", "c", "e", bwin.class, "f", bmeb.class, "g", bmlv.class, "h", "i", bmep.class, "j", bmnr.class, "k", "d", "l", bwhc.class, "b", "m", "o", "p", "q", "n"});
        } else if (i2 == 3) {
            return new bwkr();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f160009r;
            }
            bxxk bxxk = f160010t;
            if (bxxk == null) {
                synchronized (bwkr.class) {
                    bxxk = f160010t;
                    if (bxxk == null) {
                        bxxk = new bxve(f160009r);
                        f160010t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
