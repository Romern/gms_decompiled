package p000;

/* renamed from: birx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birx extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final birx f121479i;

    /* renamed from: j */
    private static volatile bxxk f121480j;

    /* renamed from: a */
    public int f121481a;

    /* renamed from: b */
    public String f121482b = "";

    /* renamed from: c */
    public String f121483c = "";

    /* renamed from: d */
    public String f121484d = "";

    /* renamed from: e */
    public ByteString f121485e = ByteString.f164797b;

    /* renamed from: f */
    public String f121486f = "";

    /* renamed from: g */
    public int f121487g;

    /* renamed from: h */
    public int f121488h;

    static {
        birx birx = new birx();
        f121479i = birx;
        GeneratedMessageLite.m124024a(birx.class, birx);
    }

    private birx() {
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
            return GeneratedMessageLite.m124022a(f121479i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new birx();
        } else {
            if (i2 == 4) {
                return new bxvd(f121479i);
            }
            if (i2 == 5) {
                return f121479i;
            }
            bxxk bxxk = f121480j;
            if (bxxk == null) {
                synchronized (birx.class) {
                    bxxk = f121480j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121479i);
                        f121480j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
