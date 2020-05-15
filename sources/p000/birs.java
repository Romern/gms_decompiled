package p000;

/* renamed from: birs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birs extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final birs f121457h;

    /* renamed from: j */
    private static volatile bxxk f121458j;

    /* renamed from: a */
    public int f121459a;

    /* renamed from: b */
    public int f121460b;

    /* renamed from: c */
    public int f121461c;

    /* renamed from: d */
    public int f121462d;

    /* renamed from: e */
    public int f121463e;

    /* renamed from: f */
    public int f121464f;

    /* renamed from: g */
    public int f121465g;

    /* renamed from: i */
    private byte f121466i = 2;

    static {
        birs birs = new birs();
        f121457h = birs;
        GeneratedMessageLite.m124024a(birs.class, birs);
    }

    private birs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121466i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121466i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121457h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0002\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ဋ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new birs();
        } else {
            if (i2 == 4) {
                return new bxvd(f121457h);
            }
            if (i2 == 5) {
                return f121457h;
            }
            bxxk bxxk = f121458j;
            if (bxxk == null) {
                synchronized (birs.class) {
                    bxxk = f121458j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121457h);
                        f121458j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
