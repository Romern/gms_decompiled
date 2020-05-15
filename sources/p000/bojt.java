package p000;

/* renamed from: bojt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojt extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bojt f133336l;

    /* renamed from: m */
    private static volatile bxxk f133337m;

    /* renamed from: a */
    public int f133338a;

    /* renamed from: b */
    public int f133339b;

    /* renamed from: c */
    public long f133340c;

    /* renamed from: d */
    public String f133341d = "";

    /* renamed from: e */
    public String f133342e = "";

    /* renamed from: f */
    public boik f133343f;

    /* renamed from: g */
    public bosx f133344g;

    /* renamed from: h */
    public int f133345h;

    /* renamed from: i */
    public String f133346i = "";

    /* renamed from: j */
    public String f133347j = "";

    /* renamed from: k */
    public int f133348k;

    static {
        bojt bojt = new bojt();
        f133336l = bojt;
        GeneratedMessageLite.m124024a(bojt.class, bojt);
    }

    private bojt() {
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
            return GeneratedMessageLite.m124022a(f133336l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\bဈ\u0007\nဈ\t\u000bင\n", new Object[]{"a", "b", bojr.f133335a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bojt();
        } else {
            if (i2 == 4) {
                return new bxvd(f133336l);
            }
            if (i2 == 5) {
                return f133336l;
            }
            bxxk bxxk = f133337m;
            if (bxxk == null) {
                synchronized (bojt.class) {
                    bxxk = f133337m;
                    if (bxxk == null) {
                        bxxk = new bxve(f133336l);
                        f133337m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
