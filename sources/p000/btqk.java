package p000;

/* renamed from: btqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btqk f149964e;

    /* renamed from: f */
    private static volatile bxxk f149965f;

    /* renamed from: a */
    public String f149966a = "";

    /* renamed from: b */
    public String f149967b = "";

    /* renamed from: c */
    public String f149968c = "";

    /* renamed from: d */
    public String f149969d = "";

    static {
        btqk btqk = new btqk();
        f149964e = btqk;
        bxvk.m124024a(btqk.class, btqk);
    }

    private btqk() {
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
            return bxvk.m124022a(f149964e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f149964e);
            }
            if (i2 == 5) {
                return f149964e;
            }
            bxxk bxxk = f149965f;
            if (bxxk == null) {
                synchronized (btqk.class) {
                    bxxk = f149965f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149964e);
                        f149965f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
