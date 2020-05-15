package p000;

/* renamed from: kwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwq extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final kwq f25305l;

    /* renamed from: m */
    private static volatile bxxk f25306m;

    /* renamed from: a */
    public kbu f25307a;

    /* renamed from: b */
    public boolean f25308b;

    /* renamed from: c */
    public int f25309c;

    /* renamed from: d */
    public long f25310d;

    /* renamed from: e */
    public boolean f25311e;

    /* renamed from: f */
    public int f25312f;

    /* renamed from: g */
    public int f25313g;

    /* renamed from: h */
    public boolean f25314h;

    /* renamed from: i */
    public boolean f25315i;

    /* renamed from: j */
    public kwk f25316j;

    /* renamed from: k */
    public kwp f25317k;

    static {
        kwq kwq = new kwq();
        f25305l = kwq;
        GeneratedMessageLite.m124024a(kwq.class, kwq);
    }

    private kwq() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f25305l, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0004\u0004\u0002\u0005\u0007\u0006\u0004\u0007\f\b\u0007\t\u0007\n\t\r\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new kwq();
        } else {
            if (i2 == 4) {
                return new bxvd(f25305l);
            }
            if (i2 == 5) {
                return f25305l;
            }
            bxxk bxxk = f25306m;
            if (bxxk == null) {
                synchronized (kwq.class) {
                    bxxk = f25306m;
                    if (bxxk == null) {
                        bxxk = new bxve(f25305l);
                        f25306m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
