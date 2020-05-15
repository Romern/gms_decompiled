package p000;

/* renamed from: bipu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bipu f121213d;

    /* renamed from: g */
    private static volatile bxxk f121214g;

    /* renamed from: a */
    public int f121215a = 1;

    /* renamed from: b */
    public int f121216b;

    /* renamed from: c */
    public bxvt f121217c = bxvm.f164965b;

    /* renamed from: e */
    private int f121218e;

    /* renamed from: f */
    private byte f121219f = 2;

    static {
        bipu bipu = new bipu();
        f121213d = bipu;
        GeneratedMessageLite.m124024a(bipu.class, bipu);
    }

    private bipu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121219f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121219f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121213d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᔌ\u0000\u0002ဋ\u0001\u0003\u001d", new Object[]{"e", "a", bips.f121212a, "b", "c"});
        } else if (i2 == 3) {
            return new bipu();
        } else {
            if (i2 == 4) {
                return new bxvd(f121213d);
            }
            if (i2 == 5) {
                return f121213d;
            }
            bxxk bxxk = f121214g;
            if (bxxk == null) {
                synchronized (bipu.class) {
                    bxxk = f121214g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121213d);
                        f121214g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
