package p000;

/* renamed from: boju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boju extends bxvk implements bxxd {

    /* renamed from: e */
    public static final boju f133349e;

    /* renamed from: f */
    private static volatile bxxk f133350f;

    /* renamed from: a */
    public int f133351a;

    /* renamed from: b */
    public bxwc f133352b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f133353c = bxxn.f165040b;

    /* renamed from: d */
    public int f133354d;

    static {
        boju boju = new boju();
        f133349e = boju;
        bxvk.m124024a(boju.class, boju);
    }

    private boju() {
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
            return bxvk.m124022a(f133349e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\u001b\u0004င\u0000", new Object[]{"a", "b", bojy.class, "c", bojv.class, "d"});
        } else if (i2 == 3) {
            return new boju();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133349e;
            }
            bxxk bxxk = f133350f;
            if (bxxk == null) {
                synchronized (boju.class) {
                    bxxk = f133350f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133349e);
                        f133350f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68913a() {
        if (!this.f133352b.mo73666a()) {
            this.f133352b = bxvk.m124021a(this.f133352b);
        }
    }
}
