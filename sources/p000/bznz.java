package p000;

/* renamed from: bznz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bznz f170780c;

    /* renamed from: d */
    private static volatile bxxk f170781d;

    /* renamed from: a */
    public int f170782a;

    /* renamed from: b */
    public String f170783b = "";

    static {
        bznz bznz = new bznz();
        f170780c = bznz;
        bxvk.m124024a(bznz.class, bznz);
    }

    private bznz() {
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
            return bxvk.m124022a(f170780c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bznz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170780c);
            }
            if (i2 == 5) {
                return f170780c;
            }
            bxxk bxxk = f170781d;
            if (bxxk == null) {
                synchronized (bznz.class) {
                    bxxk = f170781d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170780c);
                        f170781d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
