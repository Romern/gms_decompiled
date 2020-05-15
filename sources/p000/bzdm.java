package p000;

/* renamed from: bzdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdm extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bzdm f169519h;

    /* renamed from: i */
    private static volatile bxxk f169520i;

    /* renamed from: a */
    public int f169521a;

    /* renamed from: b */
    public String f169522b = "";

    /* renamed from: c */
    public String f169523c = "";

    /* renamed from: d */
    public bxvw f169524d = bxwq.f165002b;

    /* renamed from: e */
    public long f169525e;

    /* renamed from: f */
    public long f169526f;

    /* renamed from: g */
    public boolean f169527g;

    static {
        bzdm bzdm = new bzdm();
        f169519h = bzdm;
        GeneratedMessageLite.m124024a(bzdm.class, bzdm);
    }

    private bzdm() {
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
            return GeneratedMessageLite.m124022a(f169519h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u0015\u0004ဃ\u0002\u0005ဃ\u0003\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzdm();
        } else {
            if (i2 == 4) {
                return new bzdl();
            }
            if (i2 == 5) {
                return f169519h;
            }
            bxxk bxxk = f169520i;
            if (bxxk == null) {
                synchronized (bzdm.class) {
                    bxxk = f169520i;
                    if (bxxk == null) {
                        bxxk = new bxve(f169519h);
                        f169520i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
