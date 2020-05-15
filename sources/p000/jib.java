package p000;

/* renamed from: jib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jib extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final jib f22535e;

    /* renamed from: f */
    private static volatile bxxk f22536f;

    /* renamed from: a */
    public int f22537a;

    /* renamed from: b */
    public ByteString f22538b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f22539c = ByteString.f164797b;

    /* renamed from: d */
    public long f22540d;

    static {
        jib jib = new jib();
        f22535e = jib;
        GeneratedMessageLite.m124024a(jib.class, jib);
    }

    private jib() {
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
            return GeneratedMessageLite.m124022a(f22535e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new jib();
        } else {
            if (i2 == 4) {
                return new bxvd(f22535e);
            }
            if (i2 == 5) {
                return f22535e;
            }
            bxxk bxxk = f22536f;
            if (bxxk == null) {
                synchronized (jib.class) {
                    bxxk = f22536f;
                    if (bxxk == null) {
                        bxxk = new bxve(f22535e);
                        f22536f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
