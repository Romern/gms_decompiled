package p000;

/* renamed from: atyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyn extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final atyn f91131g;

    /* renamed from: h */
    private static volatile bxxk f91132h;

    /* renamed from: a */
    public String f91133a = "";

    /* renamed from: b */
    public ByteString f91134b = ByteString.f164797b;

    /* renamed from: c */
    public int f91135c;

    /* renamed from: d */
    public atzl f91136d;

    /* renamed from: e */
    public String f91137e = "";

    /* renamed from: f */
    public atzm f91138f;

    static {
        atyn atyn = new atyn();
        f91131g = atyn;
        GeneratedMessageLite.m124024a(atyn.class, atyn);
    }

    private atyn() {
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
            return GeneratedMessageLite.m124022a(f91131g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0004\u0004\t\u0005Ȉ\u0006\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new atyn();
        } else {
            if (i2 == 4) {
                return new bxvd(f91131g);
            }
            if (i2 == 5) {
                return f91131g;
            }
            bxxk bxxk = f91132h;
            if (bxxk == null) {
                synchronized (atyn.class) {
                    bxxk = f91132h;
                    if (bxxk == null) {
                        bxxk = new bxve(f91131g);
                        f91132h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
