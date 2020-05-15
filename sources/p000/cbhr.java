package p000;

/* renamed from: cbhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhr extends bxvk implements bxxd {

    /* renamed from: i */
    public static final cbhr f177167i;

    /* renamed from: j */
    private static volatile bxxk f177168j;

    /* renamed from: a */
    public String f177169a = "";

    /* renamed from: b */
    public String f177170b = "";

    /* renamed from: c */
    public String f177171c = "";

    /* renamed from: d */
    public String f177172d = "";

    /* renamed from: e */
    public cbhy f177173e;

    /* renamed from: f */
    public String f177174f = "";

    /* renamed from: g */
    public String f177175g = "";

    /* renamed from: h */
    public String f177176h = "";

    static {
        cbhr cbhr = new cbhr();
        f177167i = cbhr;
        bxvk.m124024a(cbhr.class, cbhr);
    }

    private cbhr() {
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
            return bxvk.m124022a(f177167i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new cbhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177167i);
            }
            if (i2 == 5) {
                return f177167i;
            }
            bxxk bxxk = f177168j;
            if (bxxk == null) {
                synchronized (cbhr.class) {
                    bxxk = f177168j;
                    if (bxxk == null) {
                        bxxk = new bxve(f177167i);
                        f177168j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
