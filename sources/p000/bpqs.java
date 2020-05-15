package p000;

/* renamed from: bpqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqs extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpqs f138781e;

    /* renamed from: f */
    private static volatile bxxk f138782f;

    /* renamed from: a */
    public int f138783a;

    /* renamed from: b */
    public bppt f138784b;

    /* renamed from: c */
    public int f138785c;

    /* renamed from: d */
    public int f138786d;

    static {
        bpqs bpqs = new bpqs();
        f138781e = bpqs;
        bxvk.m124024a(bpqs.class, bpqs);
    }

    private bpqs() {
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
            return bxvk.m124022a(f138781e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bpqr.f138780a, "d"});
        } else if (i2 == 3) {
            return new bpqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f138781e);
            }
            if (i2 == 5) {
                return f138781e;
            }
            bxxk bxxk = f138782f;
            if (bxxk == null) {
                synchronized (bpqs.class) {
                    bxxk = f138782f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138781e);
                        f138782f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
