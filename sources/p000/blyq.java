package p000;

/* renamed from: blyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blyq f128291f;

    /* renamed from: g */
    private static volatile bxxk f128292g;

    /* renamed from: a */
    public int f128293a;

    /* renamed from: b */
    public bmaj f128294b;

    /* renamed from: c */
    public blyn f128295c;

    /* renamed from: d */
    public ByteString f128296d = ByteString.f164797b;

    /* renamed from: e */
    public blzf f128297e;

    static {
        blyq blyq = new blyq();
        f128291f = blyq;
        GeneratedMessageLite.m124024a(blyq.class, blyq);
    }

    private blyq() {
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
            return GeneratedMessageLite.m124022a(f128291f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f128291f);
            }
            if (i2 == 5) {
                return f128291f;
            }
            bxxk bxxk = f128292g;
            if (bxxk == null) {
                synchronized (blyq.class) {
                    bxxk = f128292g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128291f);
                        f128292g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
