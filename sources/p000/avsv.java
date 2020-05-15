package p000;

/* renamed from: avsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final avsv f93858g;

    /* renamed from: h */
    private static volatile bxxk f93859h;

    /* renamed from: a */
    public bxwc f93860a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f93861b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f93862c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f93863d = bxxn.f165040b;

    /* renamed from: e */
    public bxvw f93864e = bxwq.f165002b;

    /* renamed from: f */
    public String f93865f = "";

    static {
        avsv avsv = new avsv();
        f93858g = avsv;
        bxvk.m124024a(avsv.class, avsv);
    }

    private avsv() {
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
            return bxvk.m124022a(f93858g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001Ț\u0002Ț\u0003Ț\u0004Ț\u0005%\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avsv();
        } else {
            if (i2 == 4) {
                return new avsu();
            }
            if (i2 == 5) {
                return f93858g;
            }
            bxxk bxxk = f93859h;
            if (bxxk == null) {
                synchronized (avsv.class) {
                    bxxk = f93859h;
                    if (bxxk == null) {
                        bxxk = new bxve(f93858g);
                        f93859h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo51587a() {
        if (!this.f93861b.mo73666a()) {
            this.f93861b = bxvk.m124021a(this.f93861b);
        }
    }
}
