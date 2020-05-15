package p000;

/* renamed from: bwjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjg extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bwjg f159762k;

    /* renamed from: m */
    private static volatile bxxk f159763m;

    /* renamed from: a */
    public int f159764a;

    /* renamed from: b */
    public bxwc f159765b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f159766c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f159767d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f159768e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f159769f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f159770g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f159771h = bxxn.f165040b;

    /* renamed from: i */
    public bmlz f159772i;

    /* renamed from: j */
    public bmkw f159773j;

    /* renamed from: l */
    private byte f159774l = 2;

    static {
        bwjg bwjg = new bwjg();
        f159762k = bwjg;
        GeneratedMessageLite.m124024a(bwjg.class, bwjg);
    }

    private bwjg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159774l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159774l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159762k, "\u0001\t\u0000\u0001\u0002\u0013\t\u0000\u0007\u0003\u0002Л\u0003\u001b\u0004\u001b\u0005ဉ\u0000\u0007\u001b\bЛ\f\u001b\r\u001b\u0013ᐉ\u0001", new Object[]{"a", "b", bmeb.class, "c", bmkt.class, "g", bmlv.class, "i", "d", bmde.class, "h", bmfd.class, "e", bmep.class, "f", bmem.class, "j"});
        } else if (i2 == 3) {
            return new bwjg();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159762k;
            }
            bxxk bxxk = f159763m;
            if (bxxk == null) {
                synchronized (bwjg.class) {
                    bxxk = f159763m;
                    if (bxxk == null) {
                        bxxk = new bxve(f159762k);
                        f159763m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
