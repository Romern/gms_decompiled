package p000;

/* renamed from: bpte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpte extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpte f139098e;

    /* renamed from: f */
    private static volatile bxxk f139099f;

    /* renamed from: a */
    public int f139100a;

    /* renamed from: b */
    public String f139101b = "";

    /* renamed from: c */
    public boolean f139102c;

    /* renamed from: d */
    public bptt f139103d;

    static {
        bpte bpte = new bpte();
        f139098e = bpte;
        bxvk.m124024a(bpte.class, bpte);
    }

    private bpte() {
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
            return bxvk.m124022a(f139098e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpte();
        } else {
            if (i2 == 4) {
                return new bxvd(f139098e);
            }
            if (i2 == 5) {
                return f139098e;
            }
            bxxk bxxk = f139099f;
            if (bxxk == null) {
                synchronized (bpte.class) {
                    bxxk = f139099f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139098e);
                        f139099f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
