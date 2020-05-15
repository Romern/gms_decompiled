package p000;

/* renamed from: bvvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvvp f157827f;

    /* renamed from: g */
    private static volatile bxxk f157828g;

    /* renamed from: a */
    public int f157829a;

    /* renamed from: b */
    public long f157830b;

    /* renamed from: c */
    public bvxf f157831c;

    /* renamed from: d */
    public bxwc f157832d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f157833e = bxxn.f165040b;

    static {
        bvvp bvvp = new bvvp();
        f157827f = bvvp;
        bxvk.m124024a(bvvp.class, bvvp);
    }

    private bvvp() {
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
            return bxvk.m124022a(f157827f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", "d", bvvm.class, "e", bvvo.class});
        } else if (i2 == 3) {
            return new bvvp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f157827f;
            }
            bxxk bxxk = f157828g;
            if (bxxk == null) {
                synchronized (bvvp.class) {
                    bxxk = f157828g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157827f);
                        f157828g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo73392b() {
        if (!this.f157833e.mo73666a()) {
            this.f157833e = bxvk.m124021a(this.f157833e);
        }
    }

    /* renamed from: a */
    public final void mo73391a() {
        if (!this.f157832d.mo73666a()) {
            this.f157832d = bxvk.m124021a(this.f157832d);
        }
    }
}
