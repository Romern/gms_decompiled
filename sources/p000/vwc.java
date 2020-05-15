package p000;

/* renamed from: vwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwc extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final vwc f50113h;

    /* renamed from: i */
    private static volatile bxxk f50114i;

    /* renamed from: a */
    public int f50115a;

    /* renamed from: b */
    public long f50116b;

    /* renamed from: c */
    public long f50117c;

    /* renamed from: d */
    public long f50118d;

    /* renamed from: e */
    public int f50119e;

    /* renamed from: f */
    public vvy f50120f;

    /* renamed from: g */
    public int f50121g;

    static {
        vwc vwc = new vwc();
        f50113h = vwc;
        GeneratedMessageLite.m124024a(vwc.class, vwc);
    }

    private vwc() {
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
            return GeneratedMessageLite.m124022a(f50113h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new vwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f50113h);
            }
            if (i2 == 5) {
                return f50113h;
            }
            bxxk bxxk = f50114i;
            if (bxxk == null) {
                synchronized (vwc.class) {
                    bxxk = f50114i;
                    if (bxxk == null) {
                        bxxk = new bxve(f50113h);
                        f50114i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
