package p000;

/* renamed from: ajnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ajnp f70992c;

    /* renamed from: d */
    private static volatile bxxk f70993d;

    /* renamed from: a */
    public int f70994a;

    /* renamed from: b */
    public int f70995b;

    static {
        ajnp ajnp = new ajnp();
        f70992c = ajnp;
        GeneratedMessageLite.m124024a(ajnp.class, ajnp);
    }

    private ajnp() {
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
            return GeneratedMessageLite.m124022a(f70992c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ajnn.f70991a});
        } else if (i2 == 3) {
            return new ajnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f70992c);
            }
            if (i2 == 5) {
                return f70992c;
            }
            bxxk bxxk = f70993d;
            if (bxxk == null) {
                synchronized (ajnp.class) {
                    bxxk = f70993d;
                    if (bxxk == null) {
                        bxxk = new bxve(f70992c);
                        f70993d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
