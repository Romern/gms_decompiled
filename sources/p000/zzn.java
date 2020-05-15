package p000;

/* renamed from: zzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final zzn f56307e;

    /* renamed from: f */
    private static volatile bxxk f56308f;

    /* renamed from: a */
    public int f56309a;

    /* renamed from: b */
    public int f56310b;

    /* renamed from: c */
    public String f56311c = "";

    /* renamed from: d */
    public int f56312d;

    static {
        zzn zzn = new zzn();
        f56307e = zzn;
        bxvk.m124024a(zzn.class, zzn);
    }

    private zzn() {
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
            return bxvk.m124022a(f56307e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", zzm.f56306a, "c", "d"});
        } else if (i2 == 3) {
            return new zzn();
        } else {
            if (i2 == 4) {
                return new bxvd(f56307e);
            }
            if (i2 == 5) {
                return f56307e;
            }
            bxxk bxxk = f56308f;
            if (bxxk == null) {
                synchronized (zzn.class) {
                    bxxk = f56308f;
                    if (bxxk == null) {
                        bxxk = new bxve(f56307e);
                        f56308f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
