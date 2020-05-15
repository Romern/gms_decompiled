package p000;

/* renamed from: ltq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltq extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final ltq f32971i;

    /* renamed from: k */
    private static volatile bxxk f32972k;

    /* renamed from: a */
    public int f32973a;

    /* renamed from: b */
    public int f32974b;

    /* renamed from: c */
    public String f32975c = "";

    /* renamed from: d */
    public String f32976d = "";

    /* renamed from: e */
    public bxwc f32977e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f32978f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f32979g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f32980h = bxxn.f165040b;

    /* renamed from: j */
    private byte f32981j = 2;

    static {
        ltq ltq = new ltq();
        f32971i = ltq;
        GeneratedMessageLite.m124024a(ltq.class, ltq);
    }

    private ltq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32981j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32981j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f32971i, "\u0001\u0007\u0000\u0001\u0002'\u0007\u0000\u0004\u0004\u0002б\u0007б\u000bᔌ\u0001\u0015Л\u001dဈ\u0002#ဈ\u0003'\u001b", new Object[]{"a", "e", ltk.class, "f", ltn.class, "b", lto.f32970a, "g", lti.class, "c", "d", "h", ltj.class});
        } else if (i2 == 3) {
            return new ltq();
        } else {
            if (i2 == 4) {
                return new bxvd(f32971i);
            }
            if (i2 == 5) {
                return f32971i;
            }
            bxxk bxxk = f32972k;
            if (bxxk == null) {
                synchronized (ltq.class) {
                    bxxk = f32972k;
                    if (bxxk == null) {
                        bxxk = new bxve(f32971i);
                        f32972k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
