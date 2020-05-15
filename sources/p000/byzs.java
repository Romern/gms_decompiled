package p000;

/* renamed from: byzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzs extends bxvg implements bxvh {

    /* renamed from: i */
    public static final byzs f169160i;

    /* renamed from: k */
    private static volatile bxxk f169161k;

    /* renamed from: a */
    public int f169162a;

    /* renamed from: b */
    public String f169163b = "";

    /* renamed from: c */
    public long f169164c;

    /* renamed from: d */
    public byzh f169165d;

    /* renamed from: e */
    public byzw f169166e;

    /* renamed from: f */
    public byyy f169167f;

    /* renamed from: g */
    public byzf f169168g;

    /* renamed from: h */
    public int f169169h;

    /* renamed from: j */
    private byte f169170j = 2;

    static {
        byzs byzs = new byzs();
        f169160i = byzs;
        GeneratedMessageLite.m124024a(byzs.class, byzs);
    }

    private byzs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169170j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169170j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169160i, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဂ\u0001\u0004ဉ\u0002\u0007ဉ\u0004\nဉ\u0007\rᐉ\t\u0010ဌ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bzbr.f169262a});
        } else if (i2 == 3) {
            return new byzs();
        } else {
            if (i2 == 4) {
                return new bxvf(f169160i);
            }
            if (i2 == 5) {
                return f169160i;
            }
            bxxk bxxk = f169161k;
            if (bxxk == null) {
                synchronized (byzs.class) {
                    bxxk = f169161k;
                    if (bxxk == null) {
                        bxxk = new bxve(f169160i);
                        f169161k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
