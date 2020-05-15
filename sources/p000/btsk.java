package p000;

/* renamed from: btsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btsk f150222f;

    /* renamed from: g */
    private static volatile bxxk f150223g;

    /* renamed from: a */
    public String f150224a = "";

    /* renamed from: b */
    public String f150225b = "";

    /* renamed from: c */
    public String f150226c = "";

    /* renamed from: d */
    public String f150227d = "";

    /* renamed from: e */
    public int f150228e;

    static {
        btsk btsk = new btsk();
        f150222f = btsk;
        bxvk.m124024a(btsk.class, btsk);
    }

    private btsk() {
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
            return bxvk.m124022a(f150222f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0007\f", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f150222f);
            }
            if (i2 == 5) {
                return f150222f;
            }
            bxxk bxxk = f150223g;
            if (bxxk == null) {
                synchronized (btsk.class) {
                    bxxk = f150223g;
                    if (bxxk == null) {
                        bxxk = new bxve(f150222f);
                        f150223g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
