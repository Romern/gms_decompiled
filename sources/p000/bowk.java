package p000;

/* renamed from: bowk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowk extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bowk f135143l;

    /* renamed from: m */
    private static volatile bxxk f135144m;

    /* renamed from: a */
    public int f135145a;

    /* renamed from: b */
    public String f135146b = "";

    /* renamed from: c */
    public String f135147c = "";

    /* renamed from: d */
    public String f135148d = "";

    /* renamed from: e */
    public int f135149e;

    /* renamed from: f */
    public int f135150f;

    /* renamed from: g */
    public String f135151g = "";

    /* renamed from: h */
    public boolean f135152h;

    /* renamed from: i */
    public boolean f135153i;

    /* renamed from: j */
    public String f135154j = "";

    /* renamed from: k */
    public int f135155k;

    static {
        bowk bowk = new bowk();
        f135143l = bowk;
        GeneratedMessageLite.m124024a(bowk.class, bowk);
    }

    private bowk() {
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
            return GeneratedMessageLite.m124022a(f135143l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဈ\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bowk();
        } else {
            if (i2 == 4) {
                return new bxvd(f135143l);
            }
            if (i2 == 5) {
                return f135143l;
            }
            bxxk bxxk = f135144m;
            if (bxxk == null) {
                synchronized (bowk.class) {
                    bxxk = f135144m;
                    if (bxxk == null) {
                        bxxk = new bxve(f135143l);
                        f135144m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
