package p000;

/* renamed from: bsib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsib extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsib f144654f;

    /* renamed from: g */
    private static volatile bxxk f144655g;

    /* renamed from: a */
    public int f144656a;

    /* renamed from: b */
    public ByteString f144657b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f144658c = ByteString.f164797b;

    /* renamed from: d */
    public String f144659d = "";

    /* renamed from: e */
    public ByteString f144660e = ByteString.f164797b;

    static {
        bsib bsib = new bsib();
        f144654f = bsib;
        GeneratedMessageLite.m124024a(bsib.class, bsib);
    }

    private bsib() {
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
            return GeneratedMessageLite.m124022a(f144654f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsib();
        } else {
            if (i2 == 4) {
                return new bxvd(f144654f);
            }
            if (i2 == 5) {
                return f144654f;
            }
            bxxk bxxk = f144655g;
            if (bxxk == null) {
                synchronized (bsib.class) {
                    bxxk = f144655g;
                    if (bxxk == null) {
                        bxxk = new bxve(f144654f);
                        f144655g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
