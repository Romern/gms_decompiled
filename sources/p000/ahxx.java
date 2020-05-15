package p000;

/* renamed from: ahxx */
final /* synthetic */ class ahxx implements Runnable {

    /* renamed from: a */
    private final ahye f68314a;

    /* renamed from: b */
    private final int f68315b;

    /* renamed from: c */
    private final int f68316c;

    /* renamed from: d */
    private final byte[] f68317d;

    public ahxx(ahye ahye, int i, int i2, byte[] bArr) {
        this.f68314a = ahye;
        this.f68315b = i;
        this.f68316c = i2;
        this.f68317d = bArr;
    }

    public final void run() {
        ahye ahye = this.f68314a;
        int i = this.f68315b;
        int i2 = this.f68316c;
        byte[] bArr = this.f68317d;
        if (ahye.mo37285d()) {
            ahye.f68331a.execute(new ahxt(ahye, i, i2, bArr));
        }
    }
}
