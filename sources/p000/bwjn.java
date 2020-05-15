package p000;

/* renamed from: bwjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwjn f159829h;

    /* renamed from: i */
    private static volatile bxxk f159830i;

    /* renamed from: a */
    public int f159831a;

    /* renamed from: b */
    public bmgo f159832b;

    /* renamed from: c */
    public bmft f159833c;

    /* renamed from: d */
    public bxwc f159834d = bxxn.f165040b;

    /* renamed from: e */
    public ByteString f159835e = ByteString.f164797b;

    /* renamed from: f */
    public bxwc f159836f = bxxn.f165040b;

    /* renamed from: g */
    public bmdk f159837g;

    static {
        bwjn bwjn = new bwjn();
        f159829h = bwjn;
        GeneratedMessageLite.m124024a(bwjn.class, bwjn);
    }

    private bwjn() {
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
            return GeneratedMessageLite.m124022a(f159829h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001a\u0004ည\u0002\u0006\u001b\bဉ\u0003", new Object[]{"a", "b", "c", "d", "e", "f", bmed.class, "g"});
        } else if (i2 == 3) {
            return new bwjn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159829h;
            }
            bxxk bxxk = f159830i;
            if (bxxk == null) {
                synchronized (bwjn.class) {
                    bxxk = f159830i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159829h);
                        f159830i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
