package p000;

/* renamed from: bwlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwlo f160158c;

    /* renamed from: e */
    private static volatile bxxk f160159e;

    /* renamed from: a */
    public int f160160a;

    /* renamed from: b */
    public int f160161b;

    /* renamed from: d */
    private int f160162d;

    static {
        bwlo bwlo = new bwlo();
        f160158c = bwlo;
        bxvk.m124024a(bwlo.class, bwlo);
    }

    private bwlo() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m122074a(bwlo bwlo) {
        bwlo.f160160a |= 2;
        bwlo.f160162d = 1;
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
            return bxvk.m124022a(f160158c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bwln.f160157a, "d"});
        } else if (i2 == 3) {
            return new bwlo();
        } else {
            if (i2 == 4) {
                return new bxvd(f160158c);
            }
            if (i2 == 5) {
                return f160158c;
            }
            bxxk bxxk = f160159e;
            if (bxxk == null) {
                synchronized (bwlo.class) {
                    bxxk = f160159e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160158c);
                        f160159e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
