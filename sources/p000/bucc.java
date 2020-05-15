package p000;

/* renamed from: bucc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bucc f153322d;

    /* renamed from: f */
    private static volatile bxxk f153323f;

    /* renamed from: a */
    public int f153324a;

    /* renamed from: b */
    public int f153325b;

    /* renamed from: c */
    public int f153326c;

    /* renamed from: e */
    private int f153327e;

    static {
        bucc bucc = new bucc();
        f153322d = bucc;
        GeneratedMessageLite.m124024a(bucc.class, bucc);
    }

    private bucc() {
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
            return GeneratedMessageLite.m124022a(f153322d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", buce.m119319b(), "c", bucs.m119337b()});
        } else if (i2 == 3) {
            return new bucc();
        } else {
            if (i2 == 4) {
                return new bxvd(f153322d);
            }
            if (i2 == 5) {
                return f153322d;
            }
            bxxk bxxk = f153323f;
            if (bxxk == null) {
                synchronized (bucc.class) {
                    bxxk = f153323f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153322d);
                        f153323f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
