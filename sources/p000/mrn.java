package p000;

/* renamed from: mrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrn extends bxvk implements bxxd {

    /* renamed from: k */
    public static final mrn f34444k;

    /* renamed from: l */
    private static volatile bxxk f34445l;

    /* renamed from: a */
    public int f34446a;

    /* renamed from: b */
    public String f34447b = "";

    /* renamed from: c */
    public long f34448c;

    /* renamed from: d */
    public long f34449d;

    /* renamed from: e */
    public long f34450e;

    /* renamed from: f */
    public bxvt f34451f = bxvm.f164965b;

    /* renamed from: g */
    public int f34452g;

    /* renamed from: h */
    public long f34453h;

    /* renamed from: i */
    public int f34454i;

    /* renamed from: j */
    public boolean f34455j;

    static {
        mrn mrn = new mrn();
        f34444k = mrn;
        bxvk.m124024a(mrn.class, mrn);
    }

    private mrn() {
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
            return bxvk.m124022a(f34444k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003င\u0004\u0004ဂ\u0005\u0005ဌ\u0006\u0006ဂ\u0001\u0007ဂ\u0003\b\u001e\tဇ\u0007", new Object[]{"a", "b", "d", "g", "h", "i", mrm.f34443a, "c", "e", "f", mrl.m25552b(), "j"});
        } else if (i2 == 3) {
            return new mrn();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34444k;
            }
            bxxk bxxk = f34445l;
            if (bxxk == null) {
                synchronized (mrn.class) {
                    bxxk = f34445l;
                    if (bxxk == null) {
                        bxxk = new bxve(f34444k);
                        f34445l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
