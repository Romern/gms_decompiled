package p000;

/* renamed from: bwgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bwgo f159228j;

    /* renamed from: l */
    private static volatile bxxk f159229l;

    /* renamed from: a */
    public int f159230a;

    /* renamed from: b */
    public int f159231b = 0;

    /* renamed from: c */
    public Object f159232c;

    /* renamed from: d */
    public bmno f159233d;

    /* renamed from: e */
    public String f159234e = "";

    /* renamed from: f */
    public bmnr f159235f;

    /* renamed from: g */
    public bxwc f159236g;

    /* renamed from: h */
    public bmdb f159237h;

    /* renamed from: i */
    public bmeb f159238i;

    /* renamed from: k */
    private byte f159239k = 2;

    static {
        bwgo bwgo = new bwgo();
        f159228j = bwgo;
        GeneratedMessageLite.m124024a(bwgo.class, bwgo);
    }

    private bwgo() {
        ByteString bxtx = bxtx.f164797b;
        this.f159236g = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159239k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159239k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159228j, "\u0001\t\u0001\u0001\u0001\f\t\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004\u001b\u0005ဉ\u0005\bᐉ\u0006\nြ\u0000\u000bွ\u0000\fြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", bwgi.class, "h", "i", bwiv.class, bwgj.class});
        } else if (i2 == 3) {
            return new bwgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f159228j);
            }
            if (i2 == 5) {
                return f159228j;
            }
            bxxk bxxk = f159229l;
            if (bxxk == null) {
                synchronized (bwgo.class) {
                    bxxk = f159229l;
                    if (bxxk == null) {
                        bxxk = new bxve(f159228j);
                        f159229l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
