package p000;

/* renamed from: ahza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahza extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ahza f68441e;

    /* renamed from: f */
    private static volatile bxxk f68442f;

    /* renamed from: a */
    public int f68443a;

    /* renamed from: b */
    public bxtx f68444b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f68445c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f68446d = bxtx.f164797b;

    static {
        ahza ahza = new ahza();
        f68441e = ahza;
        bxvk.m124024a(ahza.class, ahza);
    }

    private ahza() {
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
            return bxvk.m124022a(f68441e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0003ည\u0001\u0004ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ahza();
        } else {
            if (i2 == 4) {
                return new bxvd(f68441e);
            }
            if (i2 == 5) {
                return f68441e;
            }
            bxxk bxxk = f68442f;
            if (bxxk == null) {
                synchronized (ahza.class) {
                    bxxk = f68442f;
                    if (bxxk == null) {
                        bxxk = new bxve(f68441e);
                        f68442f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
