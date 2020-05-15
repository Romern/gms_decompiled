package p000;

/* renamed from: btyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btyg f152902e;

    /* renamed from: f */
    private static volatile bxxk f152903f;

    /* renamed from: a */
    public int f152904a;

    /* renamed from: b */
    public long f152905b;

    /* renamed from: c */
    public bxvs f152906c = bxuz.f164939b;

    /* renamed from: d */
    public String f152907d = "";

    static {
        btyg btyg = new btyg();
        f152902e = btyg;
        bxvk.m124024a(btyg.class, btyg);
    }

    private btyg() {
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
            return bxvk.m124022a(f152902e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u0013\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btyg();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f152902e;
            }
            bxxk bxxk = f152903f;
            if (bxxk == null) {
                synchronized (btyg.class) {
                    bxxk = f152903f;
                    if (bxxk == null) {
                        bxxk = new bxve(f152902e);
                        f152903f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
