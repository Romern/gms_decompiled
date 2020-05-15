package p000;

/* renamed from: bvez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvez extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bvez f155827h;

    /* renamed from: j */
    private static volatile bxxk f155828j;

    /* renamed from: a */
    public int f155829a;

    /* renamed from: b */
    public String f155830b = "";

    /* renamed from: c */
    public int f155831c;

    /* renamed from: d */
    public int f155832d;

    /* renamed from: e */
    public bver f155833e;

    /* renamed from: f */
    public bvey f155834f;

    /* renamed from: g */
    public bvgd f155835g;

    /* renamed from: i */
    private byte f155836i = 2;

    static {
        bvez bvez = new bvez();
        f155827h = bvez;
        GeneratedMessageLite.m124024a(bvez.class, bvez);
    }

    private bvez() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155836i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155836i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155827h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0001\u0001ဈ\u0000\tဌ\u0001\nဌ\u0002\u000bဉ\u0003\fဉ\u0004\u000eᐉ\u0006", new Object[]{"a", "b", "c", bvja.f156300a, "d", bviz.f156299a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvez();
        } else {
            if (i2 == 4) {
                return new bxvd(f155827h);
            }
            if (i2 == 5) {
                return f155827h;
            }
            bxxk bxxk = f155828j;
            if (bxxk == null) {
                synchronized (bvez.class) {
                    bxxk = f155828j;
                    if (bxxk == null) {
                        bxxk = new bxve(f155827h);
                        f155828j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
