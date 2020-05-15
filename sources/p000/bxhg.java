package p000;

/* renamed from: bxhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhg extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bxhg f163367n;

    /* renamed from: o */
    private static volatile bxxk f163368o;

    /* renamed from: a */
    public int f163369a;

    /* renamed from: b */
    public int f163370b;

    /* renamed from: c */
    public int f163371c;

    /* renamed from: d */
    public int f163372d;

    /* renamed from: e */
    public int f163373e;

    /* renamed from: f */
    public int f163374f;

    /* renamed from: g */
    public int f163375g;

    /* renamed from: h */
    public int f163376h;

    /* renamed from: i */
    public int f163377i;

    /* renamed from: j */
    public int f163378j;

    /* renamed from: k */
    public int f163379k;

    /* renamed from: l */
    public int f163380l;

    /* renamed from: m */
    public int f163381m;

    static {
        bxhg bxhg = new bxhg();
        f163367n = bxhg;
        GeneratedMessageLite.m124024a(bxhg.class, bxhg);
    }

    private bxhg() {
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
            return GeneratedMessageLite.m124022a(f163367n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eင\r", new Object[]{"a", "b", bxco.m122578b(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bxhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163367n);
            }
            if (i2 == 5) {
                return f163367n;
            }
            bxxk bxxk = f163368o;
            if (bxxk == null) {
                synchronized (bxhg.class) {
                    bxxk = f163368o;
                    if (bxxk == null) {
                        bxxk = new bxve(f163367n);
                        f163368o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
