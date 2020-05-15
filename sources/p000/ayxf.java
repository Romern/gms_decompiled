package p000;

/* renamed from: ayxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ayxf f98675c;

    /* renamed from: d */
    private static volatile bxxk f98676d;

    /* renamed from: a */
    public int f98677a;

    /* renamed from: b */
    public String f98678b = "";

    static {
        ayxf ayxf = new ayxf();
        f98675c = ayxf;
        bxvk.m124024a(ayxf.class, ayxf);
    }

    private ayxf() {
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
            return bxvk.m124022a(f98675c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ayxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f98675c);
            }
            if (i2 == 5) {
                return f98675c;
            }
            bxxk bxxk = f98676d;
            if (bxxk == null) {
                synchronized (ayxf.class) {
                    bxxk = f98676d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98675c);
                        f98676d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
