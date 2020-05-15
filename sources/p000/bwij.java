package p000;

/* renamed from: bwij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwij extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwij f159637d;

    /* renamed from: g */
    private static volatile bxxk f159638g;

    /* renamed from: a */
    public long f159639a;

    /* renamed from: b */
    public bxwc f159640b = bxxn.f165040b;

    /* renamed from: c */
    public int f159641c;

    /* renamed from: e */
    private int f159642e;

    /* renamed from: f */
    private byte f159643f = 2;

    static {
        bwij bwij = new bwij();
        f159637d = bwij;
        GeneratedMessageLite.m124024a(bwij.class, bwij);
    }

    private bwij() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159643f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159643f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159637d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0004Л\u0005ဌ\u0002", new Object[]{"e", "a", "b", bwig.class, "c", bwih.f159636a});
        } else if (i2 == 3) {
            return new bwij();
        } else {
            if (i2 == 4) {
                return new bxvd(f159637d);
            }
            if (i2 == 5) {
                return f159637d;
            }
            bxxk bxxk = f159638g;
            if (bxxk == null) {
                synchronized (bwij.class) {
                    bxxk = f159638g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159637d);
                        f159638g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
