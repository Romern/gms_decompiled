package p000;

/* renamed from: borq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borq extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final borq f134481h;

    /* renamed from: i */
    private static volatile bxxk f134482i;

    /* renamed from: a */
    public int f134483a;

    /* renamed from: b */
    public String f134484b = "";

    /* renamed from: c */
    public String f134485c = "";

    /* renamed from: d */
    public int f134486d;

    /* renamed from: e */
    public long f134487e;

    /* renamed from: f */
    public int f134488f;

    /* renamed from: g */
    public int f134489g;

    static {
        borq borq = new borq();
        f134481h = borq;
        GeneratedMessageLite.m124024a(borq.class, borq);
    }

    private borq() {
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
            return GeneratedMessageLite.m124022a(f134481h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new borq();
        } else {
            if (i2 == 4) {
                return new bxvd(f134481h);
            }
            if (i2 == 5) {
                return f134481h;
            }
            bxxk bxxk = f134482i;
            if (bxxk == null) {
                synchronized (borq.class) {
                    bxxk = f134482i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134481h);
                        f134482i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
