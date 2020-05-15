package p000;

/* renamed from: blru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blru extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blru f127527g;

    /* renamed from: i */
    private static volatile bxxk f127528i;

    /* renamed from: a */
    public int f127529a;

    /* renamed from: b */
    public blrk f127530b;

    /* renamed from: c */
    public blox f127531c;

    /* renamed from: d */
    public blrt f127532d;

    /* renamed from: e */
    public boolean f127533e;

    /* renamed from: f */
    public blrj f127534f;

    /* renamed from: h */
    private byte f127535h = 2;

    static {
        blru blru = new blru();
        f127527g = blru;
        GeneratedMessageLite.m124024a(blru.class, blru);
    }

    private blru() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127535h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127535h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127527g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0006\u0007ဉ\u0003\tဇ\u0004", new Object[]{"a", "b", "c", "f", "d", "e"});
        } else if (i2 == 3) {
            return new blru();
        } else {
            if (i2 == 4) {
                return new bxvd(f127527g);
            }
            if (i2 == 5) {
                return f127527g;
            }
            bxxk bxxk = f127528i;
            if (bxxk == null) {
                synchronized (blru.class) {
                    bxxk = f127528i;
                    if (bxxk == null) {
                        bxxk = new bxve(f127527g);
                        f127528i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
