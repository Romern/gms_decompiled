package p000;

/* renamed from: aqaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqaf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aqaf f85366e;

    /* renamed from: f */
    private static volatile bxxk f85367f;

    /* renamed from: a */
    public int f85368a;

    /* renamed from: b */
    public String f85369b = "";

    /* renamed from: c */
    public String f85370c = "";

    /* renamed from: d */
    public boolean f85371d;

    static {
        aqaf aqaf = new aqaf();
        f85366e = aqaf;
        bxvk.m124024a(aqaf.class, aqaf);
    }

    private aqaf() {
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
            return bxvk.m124022a(f85366e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f85366e);
            }
            if (i2 == 5) {
                return f85366e;
            }
            bxxk bxxk = f85367f;
            if (bxxk == null) {
                synchronized (aqaf.class) {
                    bxxk = f85367f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85366e);
                        f85367f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
