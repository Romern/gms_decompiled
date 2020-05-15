package p000;

/* renamed from: cbca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbca extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbca f176632e;

    /* renamed from: f */
    private static volatile bxxk f176633f;

    /* renamed from: a */
    public String f176634a = "";

    /* renamed from: b */
    public String f176635b = "";

    /* renamed from: c */
    public int f176636c;

    /* renamed from: d */
    public int f176637d;

    static {
        cbca cbca = new cbca();
        f176632e = cbca;
        bxvk.m124024a(cbca.class, cbca);
    }

    private cbca() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f176632e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbca();
        } else {
            if (i2 == 4) {
                return new bxvd(f176632e);
            }
            if (i2 == 5) {
                return f176632e;
            }
            bxxk bxxk = f176633f;
            if (bxxk == null) {
                synchronized (cbca.class) {
                    bxxk = f176633f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176632e);
                        f176633f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
