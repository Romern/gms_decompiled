package p000;

/* renamed from: bmca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmca extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmca f128644c;

    /* renamed from: e */
    private static volatile bxxk f128645e;

    /* renamed from: a */
    public int f128646a = 0;

    /* renamed from: b */
    public Object f128647b;

    /* renamed from: d */
    private byte f128648d = 2;

    static {
        bmca bmca = new bmca();
        f128644c = bmca;
        GeneratedMessageLite.m124024a(bmca.class, bmca);
    }

    private bmca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128648d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128648d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128644c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", bmck.class, bmdb.class, bmjb.class, bmcr.class, bmcm.class, bmcf.class, bmch.class});
        } else if (i2 == 3) {
            return new bmca();
        } else {
            if (i2 == 4) {
                return new bxvd(f128644c);
            }
            if (i2 == 5) {
                return f128644c;
            }
            bxxk bxxk = f128645e;
            if (bxxk == null) {
                synchronized (bmca.class) {
                    bxxk = f128645e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128644c);
                        f128645e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
