package p000;

/* renamed from: bpbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpbg f135592e;

    /* renamed from: f */
    private static volatile bxxk f135593f;

    /* renamed from: a */
    public int f135594a;

    /* renamed from: b */
    public int f135595b;

    /* renamed from: c */
    public long f135596c;

    /* renamed from: d */
    public boolean f135597d;

    static {
        bpbg bpbg = new bpbg();
        f135592e = bpbg;
        bxvk.m124024a(bpbg.class, bpbg);
    }

    private bpbg() {
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
            return bxvk.m124022a(f135592e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", bpbf.f135591a, "c", "d"});
        } else if (i2 == 3) {
            return new bpbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f135592e);
            }
            if (i2 == 5) {
                return f135592e;
            }
            bxxk bxxk = f135593f;
            if (bxxk == null) {
                synchronized (bpbg.class) {
                    bxxk = f135593f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135592e);
                        f135593f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
