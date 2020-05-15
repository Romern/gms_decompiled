package p000;

/* renamed from: bzkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzkr f170464d;

    /* renamed from: e */
    private static volatile bxxk f170465e;

    /* renamed from: a */
    public int f170466a;

    /* renamed from: b */
    public String f170467b = "";

    /* renamed from: c */
    public String f170468c = "";

    static {
        bzkr bzkr = new bzkr();
        f170464d = bzkr;
        bxvk.m124024a(bzkr.class, bzkr);
    }

    private bzkr() {
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
            return bxvk.m124022a(f170464d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f170464d);
            }
            if (i2 == 5) {
                return f170464d;
            }
            bxxk bxxk = f170465e;
            if (bxxk == null) {
                synchronized (bzkr.class) {
                    bxxk = f170465e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170464d);
                        f170465e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
