package p000;

/* renamed from: bmgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgn extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bmgn f129273o;

    /* renamed from: q */
    private static volatile bxxk f129274q;

    /* renamed from: a */
    public int f129275a;

    /* renamed from: b */
    public long f129276b;

    /* renamed from: c */
    public String f129277c = "";

    /* renamed from: d */
    public bxwc f129278d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129279e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f129280f = bxxn.f165040b;

    /* renamed from: g */
    public int f129281g = -1;

    /* renamed from: h */
    public int f129282h = -1;

    /* renamed from: i */
    public boolean f129283i;

    /* renamed from: j */
    public long f129284j;

    /* renamed from: k */
    public long f129285k;

    /* renamed from: l */
    public long f129286l;

    /* renamed from: m */
    public boolean f129287m;

    /* renamed from: n */
    public bmno f129288n;

    /* renamed from: p */
    private byte f129289p = 2;

    static {
        bmgn bmgn = new bmgn();
        f129273o = bmgn;
        bxvk.m124024a(bmgn.class, bmgn);
    }

    private bmgn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129289p);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129289p = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129273o, "\u0001\r\u0000\u0001\u0001\u0012\r\u0000\u0003\u0002\u0001Л\u0003Л\u0004ဂ\u0000\u0006င\u0002\u0007င\u0003\bဇ\u0004\tဈ\u0001\fဂ\u0005\rဂ\u0007\u000eဇ\b\u000f\u001b\u0011ဉ\t\u0012ဂ\u0006", new Object[]{"a", "d", bmgk.class, "e", bmgd.class, "b", "g", "h", "i", "c", "j", "l", "m", "f", bmgh.class, "n", "k"});
        } else if (i2 == 3) {
            return new bmgn();
        } else {
            if (i2 == 4) {
                return new bmgm();
            }
            if (i2 == 5) {
                return f129273o;
            }
            bxxk bxxk = f129274q;
            if (bxxk == null) {
                synchronized (bmgn.class) {
                    bxxk = f129274q;
                    if (bxxk == null) {
                        bxxk = new bxve(f129273o);
                        f129274q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo66790b() {
        if (!this.f129279e.mo73666a()) {
            this.f129279e = bxvk.m124021a(this.f129279e);
        }
    }

    /* renamed from: a */
    public final void mo66789a() {
        if (!this.f129278d.mo73666a()) {
            this.f129278d = bxvk.m124021a(this.f129278d);
        }
    }
}
