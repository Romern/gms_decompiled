package p000;

/* renamed from: bssi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssi extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bssi f146862i;

    /* renamed from: j */
    private static volatile bxxk f146863j;

    /* renamed from: a */
    public int f146864a;

    /* renamed from: b */
    public bsqh f146865b;

    /* renamed from: c */
    public bsqj f146866c;

    /* renamed from: d */
    public bsqo f146867d;

    /* renamed from: e */
    public bsqq f146868e;

    /* renamed from: f */
    public bsqu f146869f;

    /* renamed from: g */
    public bsqy f146870g;

    /* renamed from: h */
    public bsse f146871h;

    static {
        bssi bssi = new bssi();
        f146862i = bssi;
        GeneratedMessageLite.m124024a(bssi.class, bssi);
    }

    private bssi() {
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
            return GeneratedMessageLite.m124022a(f146862i, "\u0001\u0007\u0000\u0001\u0002\u001d\u0007\u0000\u0000\u0000\u0002ဉ\u0007\u0004ဉ\u0002\u0005ဉ\u0012\u0006ဉ\u0005\bဉ\u0000\u0018ဉ\b\u001dဉ\u000b", new Object[]{"a", "e", "c", "h", "d", "b", "f", "g"});
        } else if (i2 == 3) {
            return new bssi();
        } else {
            if (i2 == 4) {
                return new bxvd(f146862i);
            }
            if (i2 == 5) {
                return f146862i;
            }
            bxxk bxxk = f146863j;
            if (bxxk == null) {
                synchronized (bssi.class) {
                    bxxk = f146863j;
                    if (bxxk == null) {
                        bxxk = new bxve(f146862i);
                        f146863j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
