package p000;

/* renamed from: book */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class book extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final book f133933e;

    /* renamed from: f */
    private static volatile bxxk f133934f;

    /* renamed from: a */
    public int f133935a;

    /* renamed from: b */
    public boolean f133936b;

    /* renamed from: c */
    public int f133937c;

    /* renamed from: d */
    public long f133938d;

    static {
        book book = new book();
        f133933e = book;
        GeneratedMessageLite.m124024a(book.class, book);
    }

    private book() {
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
            return GeneratedMessageLite.m124022a(f133933e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0004\u0004\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new book();
        } else {
            if (i2 == 4) {
                return new bxvd(f133933e);
            }
            if (i2 == 5) {
                return f133933e;
            }
            bxxk bxxk = f133934f;
            if (bxxk == null) {
                synchronized (book.class) {
                    bxxk = f133934f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133933e);
                        f133934f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
