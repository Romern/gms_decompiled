package p000;

/* renamed from: bzcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcn extends bxvg implements bxvh {

    /* renamed from: h */
    public static final bzcn f169375h;

    /* renamed from: j */
    private static volatile bxxk f169376j;

    /* renamed from: a */
    public int f169377a;

    /* renamed from: b */
    public bxwc f169378b = bxxn.f165040b;

    /* renamed from: c */
    public byzd f169379c;

    /* renamed from: d */
    public String f169380d = "";

    /* renamed from: e */
    public bxwc f169381e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f169382f = bxxn.f165040b;

    /* renamed from: g */
    public String f169383g = "";

    /* renamed from: i */
    private byte f169384i = 2;

    static {
        bzcn bzcn = new bzcn();
        f169375h = bzcn;
        GeneratedMessageLite.m124024a(bzcn.class, bzcn);
    }

    private bzcn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169384i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169384i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169375h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0003\u0001\u0001\u001b\u0002ဉ\u0000\u0006ဈ\u0003\bЛ\tဈ\u0004\n\u001b", new Object[]{"a", "b", byzy.class, "c", "d", "e", byyt.class, "g", "f", bzab.class});
        } else if (i2 == 3) {
            return new bzcn();
        } else {
            if (i2 == 4) {
                return new bxvf(f169375h);
            }
            if (i2 == 5) {
                return f169375h;
            }
            bxxk bxxk = f169376j;
            if (bxxk == null) {
                synchronized (bzcn.class) {
                    bxxk = f169376j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169375h);
                        f169376j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
