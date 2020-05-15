package p000;

/* renamed from: bxeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxvu f163089f = new bxed();

    /* renamed from: g */
    public static final bxeg f163090g;

    /* renamed from: i */
    private static volatile bxxk f163091i;

    /* renamed from: a */
    public int f163092a;

    /* renamed from: b */
    public double f163093b;

    /* renamed from: c */
    public double f163094c;

    /* renamed from: d */
    public long f163095d;

    /* renamed from: e */
    public bxvt f163096e = bxvm.f164965b;

    /* renamed from: h */
    private int f163097h;

    static {
        bxeg bxeg = new bxeg();
        f163090g = bxeg;
        GeneratedMessageLite.m124024a(bxeg.class, bxeg);
    }

    private bxeg() {
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
            return GeneratedMessageLite.m124022a(f163090g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002\u0004ဂ\u0003\u0005\u001e", new Object[]{"h", "a", bxee.f163088a, "b", "c", "d", "e", bxmq.m122876b()});
        } else if (i2 == 3) {
            return new bxeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163090g);
            }
            if (i2 == 5) {
                return f163090g;
            }
            bxxk bxxk = f163091i;
            if (bxxk == null) {
                synchronized (bxeg.class) {
                    bxxk = f163091i;
                    if (bxxk == null) {
                        bxxk = new bxve(f163090g);
                        f163091i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
