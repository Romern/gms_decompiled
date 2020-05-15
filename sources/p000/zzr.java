package p000;

/* renamed from: zzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final zzr f56329d;

    /* renamed from: e */
    private static volatile bxxk f56330e;

    /* renamed from: a */
    public int f56331a;

    /* renamed from: b */
    public String f56332b = "";

    /* renamed from: c */
    public int f56333c;

    static {
        zzr zzr = new zzr();
        f56329d = zzr;
        bxvk.m124024a(zzr.class, zzr);
    }

    private zzr() {
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
            return bxvk.m124022a(f56329d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new zzr();
        } else {
            if (i2 == 4) {
                return new bxvd(f56329d);
            }
            if (i2 == 5) {
                return f56329d;
            }
            bxxk bxxk = f56330e;
            if (bxxk == null) {
                synchronized (zzr.class) {
                    bxxk = f56330e;
                    if (bxxk == null) {
                        bxxk = new bxve(f56329d);
                        f56330e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
