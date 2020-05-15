package p000;

/* renamed from: bxen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxen extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxen f163109e;

    /* renamed from: f */
    private static volatile bxxk f163110f;

    /* renamed from: a */
    public int f163111a;

    /* renamed from: b */
    public int f163112b;

    /* renamed from: c */
    public long f163113c;

    /* renamed from: d */
    public int f163114d;

    static {
        bxen bxen = new bxen();
        f163109e = bxen;
        GeneratedMessageLite.m124024a(bxen.class, bxen);
    }

    private bxen() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m122633a(bxen bxen) {
        bxen.f163111a |= 2;
        bxen.f163113c = 0;
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
            return GeneratedMessageLite.m124022a(f163109e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bxel.f163108a, "c", "d", bxmx.f163998a});
        } else if (i2 == 3) {
            return new bxen();
        } else {
            if (i2 == 4) {
                return new bxvd(f163109e);
            }
            if (i2 == 5) {
                return f163109e;
            }
            bxxk bxxk = f163110f;
            if (bxxk == null) {
                synchronized (bxen.class) {
                    bxxk = f163110f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163109e);
                        f163110f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
