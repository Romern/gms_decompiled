package p000;

/* renamed from: aapp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aapp f28818e;

    /* renamed from: f */
    private static volatile bxxk f28819f;

    /* renamed from: a */
    public int f28820a;

    /* renamed from: b */
    public int f28821b = 0;

    /* renamed from: c */
    public Object f28822c;

    /* renamed from: d */
    public int f28823d;

    static {
        aapp aapp = new aapp();
        f28818e = aapp;
        GeneratedMessageLite.m124024a(aapp.class, aapp);
    }

    private aapp() {
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
            return GeneratedMessageLite.m124022a(f28818e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", aapo.f28817a, aapi.class, aapc.class});
        } else if (i2 == 3) {
            return new aapp();
        } else {
            if (i2 == 4) {
                return new bxvd(f28818e);
            }
            if (i2 == 5) {
                return f28818e;
            }
            bxxk bxxk = f28819f;
            if (bxxk == null) {
                synchronized (aapp.class) {
                    bxxk = f28819f;
                    if (bxxk == null) {
                        bxxk = new bxve(f28818e);
                        f28819f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
