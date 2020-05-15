package p000;

/* renamed from: bzzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzzd f171957d;

    /* renamed from: e */
    private static volatile bxxk f171958e;

    /* renamed from: a */
    public int f171959a;

    /* renamed from: b */
    public String f171960b = "";

    /* renamed from: c */
    public bzyv f171961c;

    static {
        bzzd bzzd = new bzzd();
        f171957d = bzzd;
        bxvk.m124024a(bzzd.class, bzzd);
    }

    private bzzd() {
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
            return bxvk.m124022a(f171957d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzzd();
        } else {
            if (i2 == 4) {
                return new bxvd(f171957d);
            }
            if (i2 == 5) {
                return f171957d;
            }
            bxxk bxxk = f171958e;
            if (bxxk == null) {
                synchronized (bzzd.class) {
                    bxxk = f171958e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171957d);
                        f171958e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
