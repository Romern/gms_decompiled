package p000;

/* renamed from: bprg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprg extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bprg f138829s;

    /* renamed from: v */
    private static volatile bxxk f138830v;

    /* renamed from: a */
    public int f138831a;

    /* renamed from: b */
    public int f138832b;

    /* renamed from: c */
    public String f138833c = "";

    /* renamed from: d */
    public String f138834d = "";

    /* renamed from: e */
    public bppt f138835e;

    /* renamed from: f */
    public bprl f138836f;

    /* renamed from: g */
    public bppz f138837g;

    /* renamed from: h */
    public bpqo f138838h;

    /* renamed from: i */
    public bpqa f138839i;

    /* renamed from: j */
    public bpqn f138840j;

    /* renamed from: k */
    public bprm f138841k;

    /* renamed from: l */
    public bpqq f138842l;

    /* renamed from: m */
    public bpqg f138843m;

    /* renamed from: n */
    public bprh f138844n;

    /* renamed from: o */
    public bpri f138845o;

    /* renamed from: p */
    public bpqz f138846p;

    /* renamed from: q */
    public bpqu f138847q;

    /* renamed from: r */
    public bprj f138848r;

    /* renamed from: t */
    private bpqp f138849t;

    /* renamed from: u */
    private byte f138850u = 2;

    static {
        bprg bprg = new bprg();
        f138829s = bprg;
        bxvk.m124024a(bprg.class, bprg);
    }

    private bprg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138850u);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138850u = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f138829s, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012", new Object[]{"a", "b", bpre.f138828a, "c", "d", "e", "f", "t", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new bprg();
        } else {
            if (i2 == 4) {
                return new bxvd(f138829s);
            }
            if (i2 == 5) {
                return f138829s;
            }
            bxxk bxxk = f138830v;
            if (bxxk == null) {
                synchronized (bprg.class) {
                    bxxk = f138830v;
                    if (bxxk == null) {
                        bxxk = new bxve(f138829s);
                        f138830v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
