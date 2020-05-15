package p000;

/* renamed from: ajhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final ajhl f70656i;

    /* renamed from: j */
    private static volatile bxxk f70657j;

    /* renamed from: a */
    public int f70658a;

    /* renamed from: b */
    public ByteString f70659b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f70660c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f70661d = ByteString.f164797b;

    /* renamed from: e */
    public long f70662e;

    /* renamed from: f */
    public long f70663f;

    /* renamed from: g */
    public ByteString f70664g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f70665h = ByteString.f164797b;

    static {
        ajhl ajhl = new ajhl();
        f70656i = ajhl;
        GeneratedMessageLite.m124024a(ajhl.class, ajhl);
    }

    private ajhl() {
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
            return GeneratedMessageLite.m124022a(f70656i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new ajhl();
        } else {
            if (i2 == 4) {
                return new bxvd(f70656i);
            }
            if (i2 == 5) {
                return f70656i;
            }
            bxxk bxxk = f70657j;
            if (bxxk == null) {
                synchronized (ajhl.class) {
                    bxxk = f70657j;
                    if (bxxk == null) {
                        bxxk = new bxve(f70656i);
                        f70657j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
