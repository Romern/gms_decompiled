package p000;

/* renamed from: bbnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bbnu f102981f;

    /* renamed from: h */
    private static volatile bxxk f102982h;

    /* renamed from: a */
    public int f102983a;

    /* renamed from: b */
    public bxwc f102984b = bxxn.f165040b;

    /* renamed from: c */
    public long f102985c;

    /* renamed from: d */
    public long f102986d;

    /* renamed from: e */
    public bxwc f102987e = bxxn.f165040b;

    /* renamed from: g */
    private byte f102988g = 2;

    static {
        bbnu bbnu = new bbnu();
        f102981f = bbnu;
        bxvk.m124024a(bbnu.class, bbnu);
    }

    private bbnu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f102988g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f102988g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f102981f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001Л\u0002ဂ\u0000\u0003ဂ\u0001\u0004\u001b", new Object[]{"a", "b", bbns.class, "c", "d", "e", bbnt.class});
        } else if (i2 == 3) {
            return new bbnu();
        } else {
            if (i2 == 4) {
                return new bbnr();
            }
            if (i2 == 5) {
                return f102981f;
            }
            bxxk bxxk = f102982h;
            if (bxxk == null) {
                synchronized (bbnu.class) {
                    bxxk = f102982h;
                    if (bxxk == null) {
                        bxxk = new bxve(f102981f);
                        f102982h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo56250b() {
        if (!this.f102987e.mo73666a()) {
            this.f102987e = bxvk.m124021a(this.f102987e);
        }
    }

    /* renamed from: a */
    public final void mo56249a() {
        if (!this.f102984b.mo73666a()) {
            this.f102984b = bxvk.m124021a(this.f102984b);
        }
    }
}
