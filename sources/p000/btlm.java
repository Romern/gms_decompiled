package p000;

/* renamed from: btlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btlm f149388f;

    /* renamed from: g */
    private static volatile bxxk f149389g;

    /* renamed from: a */
    public btlr f149390a;

    /* renamed from: b */
    public bxtx f149391b = bxtx.f164797b;

    /* renamed from: c */
    public String f149392c = "";

    /* renamed from: d */
    public long f149393d;

    /* renamed from: e */
    public String f149394e = "";

    static {
        btlm btlm = new btlm();
        f149388f = btlm;
        bxvk.m124024a(btlm.class, btlm);
    }

    private btlm() {
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
            return bxvk.m124022a(f149388f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\u0002\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btlm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149388f);
            }
            if (i2 == 5) {
                return f149388f;
            }
            bxxk bxxk = f149389g;
            if (bxxk == null) {
                synchronized (btlm.class) {
                    bxxk = f149389g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149388f);
                        f149389g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
