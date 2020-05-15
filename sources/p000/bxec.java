package p000;

/* renamed from: bxec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxec extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxec f163078i;

    /* renamed from: j */
    private static volatile bxxk f163079j;

    /* renamed from: a */
    public int f163080a;

    /* renamed from: b */
    public int f163081b;

    /* renamed from: c */
    public long f163082c;

    /* renamed from: d */
    public bxvt f163083d = bxvm.f164965b;

    /* renamed from: e */
    public bxwc f163084e = bxxn.f165040b;

    /* renamed from: f */
    public long f163085f;

    /* renamed from: g */
    public bxwc f163086g = bxxn.f165040b;

    /* renamed from: h */
    public String f163087h = "";

    static {
        bxec bxec = new bxec();
        f163078i = bxec;
        bxvk.m124024a(bxec.class, bxec);
    }

    private bxec() {
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
            return bxvk.m124022a(f163078i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u0016\u0004\u001a\u0005ဂ\u0002\u0006\u001a\u0007ဈ\u0003", new Object[]{"a", "b", bxea.f163077a, "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxec();
        } else {
            if (i2 == 4) {
                return new bxdz();
            }
            if (i2 == 5) {
                return f163078i;
            }
            bxxk bxxk = f163079j;
            if (bxxk == null) {
                synchronized (bxec.class) {
                    bxxk = f163079j;
                    if (bxxk == null) {
                        bxxk = new bxve(f163078i);
                        f163079j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo73570b() {
        if (!this.f163086g.mo73666a()) {
            this.f163086g = bxvk.m124021a(this.f163086g);
        }
    }

    /* renamed from: a */
    public final void mo73569a() {
        if (!this.f163084e.mo73666a()) {
            this.f163084e = bxvk.m124021a(this.f163084e);
        }
    }
}
