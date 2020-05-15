package p000;

/* renamed from: bohq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohq extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bohq f133128l;

    /* renamed from: m */
    private static volatile bxxk f133129m;

    /* renamed from: a */
    public int f133130a;

    /* renamed from: b */
    public long f133131b;

    /* renamed from: c */
    public int f133132c;

    /* renamed from: d */
    public int f133133d;

    /* renamed from: e */
    public int f133134e;

    /* renamed from: f */
    public int f133135f;

    /* renamed from: g */
    public long f133136g;

    /* renamed from: h */
    public int f133137h;

    /* renamed from: i */
    public int f133138i;

    /* renamed from: j */
    public int f133139j;

    /* renamed from: k */
    public int f133140k;

    static {
        bohq bohq = new bohq();
        f133128l = bohq;
        bxvk.m124024a(bohq.class, bohq);
    }

    private bohq() {
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
            return bxvk.m124022a(f133128l, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဃ\u0005\u0010ဋ\u0006\u0011ဋ\u0007\u0012ဋ\b\u0013ဋ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bohq();
        } else {
            if (i2 == 4) {
                return new bxvd(f133128l);
            }
            if (i2 == 5) {
                return f133128l;
            }
            bxxk bxxk = f133129m;
            if (bxxk == null) {
                synchronized (bohq.class) {
                    bxxk = f133129m;
                    if (bxxk == null) {
                        bxxk = new bxve(f133128l);
                        f133129m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
