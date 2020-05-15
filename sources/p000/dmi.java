package p000;

/* renamed from: dmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final dmi f13532d;

    /* renamed from: e */
    private static volatile bxxk f13533e;

    /* renamed from: a */
    public int f13534a;

    /* renamed from: b */
    public String f13535b = "";

    /* renamed from: c */
    public bxwc f13536c = bxxn.f165040b;

    static {
        dmi dmi = new dmi();
        f13532d = dmi;
        bxvk.m124024a(dmi.class, dmi);
    }

    private dmi() {
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
            return bxvk.m124022a(f13532d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dmh.class});
        } else if (i2 == 3) {
            return new dmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f13532d);
            }
            if (i2 == 5) {
                return f13532d;
            }
            bxxk bxxk = f13533e;
            if (bxxk == null) {
                synchronized (dmi.class) {
                    bxxk = f13533e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13532d);
                        f13533e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo9278a() {
        if (!this.f13536c.mo73666a()) {
            this.f13536c = bxvk.m124021a(this.f13536c);
        }
    }
}
