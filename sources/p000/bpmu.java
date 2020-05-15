package p000;

/* renamed from: bpmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpmu f138355e;

    /* renamed from: f */
    private static volatile bxxk f138356f;

    /* renamed from: a */
    public int f138357a;

    /* renamed from: b */
    public int f138358b;

    /* renamed from: c */
    public float f138359c;

    /* renamed from: d */
    public float f138360d;

    static {
        bpmu bpmu = new bpmu();
        f138355e = bpmu;
        bxvk.m124024a(bpmu.class, bpmu);
    }

    private bpmu() {
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
            return bxvk.m124022a(f138355e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", bpms.m112074b(), "c", "d"});
        } else if (i2 == 3) {
            return new bpmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f138355e);
            }
            if (i2 == 5) {
                return f138355e;
            }
            bxxk bxxk = f138356f;
            if (bxxk == null) {
                synchronized (bpmu.class) {
                    bxxk = f138356f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138355e);
                        f138356f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
