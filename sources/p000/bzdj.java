package p000;

/* renamed from: bzdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdj extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bzdj f169495h;

    /* renamed from: i */
    private static volatile bxxk f169496i;

    /* renamed from: a */
    public int f169497a;

    /* renamed from: b */
    public String f169498b = "";

    /* renamed from: c */
    public String f169499c = "";

    /* renamed from: d */
    public bxvw f169500d = bxwq.f165002b;

    /* renamed from: e */
    public long f169501e;

    /* renamed from: f */
    public long f169502f;

    /* renamed from: g */
    public boolean f169503g;

    static {
        bzdj bzdj = new bzdj();
        f169495h = bzdj;
        GeneratedMessageLite.m124024a(bzdj.class, bzdj);
    }

    private bzdj() {
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
            return GeneratedMessageLite.m124022a(f169495h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u0015\u0004ဃ\u0002\u0005ဃ\u0003\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzdj();
        } else {
            if (i2 == 4) {
                return new bzdi();
            }
            if (i2 == 5) {
                return f169495h;
            }
            bxxk bxxk = f169496i;
            if (bxxk == null) {
                synchronized (bzdj.class) {
                    bxxk = f169496i;
                    if (bxxk == null) {
                        bxxk = new bxve(f169495h);
                        f169496i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
