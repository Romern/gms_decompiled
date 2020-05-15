package p000;

/* renamed from: dmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final dmh f13527d;

    /* renamed from: e */
    private static volatile bxxk f13528e;

    /* renamed from: a */
    public int f13529a;

    /* renamed from: b */
    public String f13530b = "";

    /* renamed from: c */
    public bxwc f13531c = bxxn.f165040b;

    static {
        dmh dmh = new dmh();
        f13527d = dmh;
        bxvk.m124024a(dmh.class, dmh);
    }

    private dmh() {
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
            return bxvk.m124022a(f13527d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dmg.class});
        } else if (i2 == 3) {
            return new dmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f13527d);
            }
            if (i2 == 5) {
                return f13527d;
            }
            bxxk bxxk = f13528e;
            if (bxxk == null) {
                synchronized (dmh.class) {
                    bxxk = f13528e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13527d);
                        f13528e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo9277a() {
        if (!this.f13531c.mo73666a()) {
            this.f13531c = bxvk.m124021a(this.f13531c);
        }
    }
}
