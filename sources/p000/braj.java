package p000;

/* renamed from: braj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class braj extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final braj f142139l;

    /* renamed from: m */
    private static volatile bxxk f142140m;

    /* renamed from: a */
    public int f142141a;

    /* renamed from: b */
    public int f142142b = 0;

    /* renamed from: c */
    public Object f142143c;

    /* renamed from: d */
    public String f142144d = "";

    /* renamed from: e */
    public int f142145e;

    /* renamed from: f */
    public bxwc f142146f = bxxn.f165040b;

    /* renamed from: g */
    public bxvt f142147g = bxvm.f164965b;

    /* renamed from: h */
    public ByteString f142148h = ByteString.f164797b;

    /* renamed from: i */
    public boolean f142149i;

    /* renamed from: j */
    public int f142150j;

    /* renamed from: k */
    public int f142151k;

    static {
        braj braj = new braj();
        f142139l = braj;
        GeneratedMessageLite.m124024a(braj.class, braj);
    }

    private braj() {
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
            return GeneratedMessageLite.m124022a(f142139l, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004'\u0005ည\u0002\u0006ဇ\u0003\u0007ျ\u0000\bဌ\u0006\tဌ\u0007\nျ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", "i", "j", brah.f142138a, "k", brag.f142137a});
        } else if (i2 == 3) {
            return new braj();
        } else {
            if (i2 == 4) {
                return new braf();
            }
            if (i2 == 5) {
                return f142139l;
            }
            bxxk bxxk = f142140m;
            if (bxxk == null) {
                synchronized (braj.class) {
                    bxxk = f142140m;
                    if (bxxk == null) {
                        bxxk = new bxve(f142139l);
                        f142140m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo69473a() {
        if (!this.f142147g.mo73666a()) {
            this.f142147g = GeneratedMessageLite.m124019a(this.f142147g);
        }
    }
}
