package p000;

/* renamed from: abtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtu extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abtu f58310g;

    /* renamed from: h */
    private static volatile bxxk f58311h;

    /* renamed from: a */
    public int f58312a;

    /* renamed from: b */
    public int f58313b;

    /* renamed from: c */
    public bxwc f58314c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f58315d = bxxn.f165040b;

    /* renamed from: e */
    public double f58316e = 1.0d;

    /* renamed from: f */
    public int f58317f;

    static {
        abtu abtu = new abtu();
        f58310g = abtu;
        bxvk.m124024a(abtu.class, abtu);
    }

    private abtu() {
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
            return bxvk.m124022a(f58310g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0004\u001b\u0005က\u0001\u0006င\u0002", new Object[]{"a", "b", "c", abub.class, "d", abut.class, "e", "f"});
        } else if (i2 == 3) {
            return new abtu();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58310g;
            }
            bxxk bxxk = f58311h;
            if (bxxk == null) {
                synchronized (abtu.class) {
                    bxxk = f58311h;
                    if (bxxk == null) {
                        bxxk = new bxve(f58310g);
                        f58311h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32345a() {
        if (!this.f58314c.mo73666a()) {
            this.f58314c = bxvk.m124021a(this.f58314c);
        }
    }
}
