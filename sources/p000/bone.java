package p000;

/* renamed from: bone */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bone extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bone f133776d;

    /* renamed from: e */
    private static volatile bxxk f133777e;

    /* renamed from: a */
    public int f133778a;

    /* renamed from: b */
    public bond f133779b;

    /* renamed from: c */
    public String f133780c = "";

    static {
        bone bone = new bone();
        f133776d = bone;
        GeneratedMessageLite.m124024a(bone.class, bone);
    }

    private bone() {
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
            return GeneratedMessageLite.m124022a(f133776d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bone();
        } else {
            if (i2 == 4) {
                return new bxvd(f133776d);
            }
            if (i2 == 5) {
                return f133776d;
            }
            bxxk bxxk = f133777e;
            if (bxxk == null) {
                synchronized (bone.class) {
                    bxxk = f133777e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133776d);
                        f133777e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
