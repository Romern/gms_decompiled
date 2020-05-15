package p000;

/* renamed from: btls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btls extends bxvk implements bxxd {

    /* renamed from: i */
    public static final btls f149414i;

    /* renamed from: j */
    private static volatile bxxk f149415j;

    /* renamed from: a */
    public String f149416a = "";

    /* renamed from: b */
    public String f149417b = "";

    /* renamed from: c */
    public String f149418c = "";

    /* renamed from: d */
    public String f149419d = "";

    /* renamed from: e */
    public String f149420e = "";

    /* renamed from: f */
    public String f149421f = "";

    /* renamed from: g */
    public String f149422g = "";

    /* renamed from: h */
    public String f149423h = "";

    static {
        btls btls = new btls();
        f149414i = btls;
        bxvk.m124024a(btls.class, btls);
    }

    private btls() {
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
            return bxvk.m124022a(f149414i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btls();
        } else {
            if (i2 == 4) {
                return new bxvd(f149414i);
            }
            if (i2 == 5) {
                return f149414i;
            }
            bxxk bxxk = f149415j;
            if (bxxk == null) {
                synchronized (btls.class) {
                    bxxk = f149415j;
                    if (bxxk == null) {
                        bxxk = new bxve(f149414i);
                        f149415j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
