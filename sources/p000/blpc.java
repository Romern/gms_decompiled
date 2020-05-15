package p000;

/* renamed from: blpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blpc f127193e;

    /* renamed from: g */
    private static volatile bxxk f127194g;

    /* renamed from: a */
    public int f127195a;

    /* renamed from: b */
    public blox f127196b;

    /* renamed from: c */
    public blrt f127197c;

    /* renamed from: d */
    public blrj f127198d;

    /* renamed from: f */
    private byte f127199f = 2;

    static {
        blpc blpc = new blpc();
        f127193e = blpc;
        GeneratedMessageLite.m124024a(blpc.class, blpc);
    }

    private blpc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127199f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127199f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127193e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0004ᐉ\u0002\u0007ဉ\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new blpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127193e);
            }
            if (i2 == 5) {
                return f127193e;
            }
            bxxk bxxk = f127194g;
            if (bxxk == null) {
                synchronized (blpc.class) {
                    bxxk = f127194g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127193e);
                        f127194g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
