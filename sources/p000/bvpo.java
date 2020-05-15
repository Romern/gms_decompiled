package p000;

/* renamed from: bvpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpo extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bvpo f157320k;

    /* renamed from: l */
    private static volatile bxxk f157321l;

    /* renamed from: a */
    public int f157322a;

    /* renamed from: b */
    public int f157323b = 0;

    /* renamed from: c */
    public Object f157324c;

    /* renamed from: d */
    public int f157325d;

    /* renamed from: e */
    public int f157326e;

    /* renamed from: f */
    public int f157327f;

    /* renamed from: g */
    public boolean f157328g;

    /* renamed from: h */
    public int f157329h;

    /* renamed from: i */
    public int f157330i;

    /* renamed from: j */
    public int f157331j;

    static {
        bvpo bvpo = new bvpo();
        f157320k = bvpo;
        GeneratedMessageLite.m124024a(bvpo.class, bvpo);
    }

    private bvpo() {
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
            return GeneratedMessageLite.m124022a(f157320k, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\bြ\u0000", new Object[]{"c", "b", "a", "d", bvyy.m121608b(), "e", bvza.m121612b(), "f", "g", "h", bvza.m121612b(), "i", "j", bvpp.class});
        } else if (i2 == 3) {
            return new bvpo();
        } else {
            if (i2 == 4) {
                return new bxvd(f157320k);
            }
            if (i2 == 5) {
                return f157320k;
            }
            bxxk bxxk = f157321l;
            if (bxxk == null) {
                synchronized (bvpo.class) {
                    bxxk = f157321l;
                    if (bxxk == null) {
                        bxxk = new bxve(f157320k);
                        f157321l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
