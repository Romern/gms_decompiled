package p000;

/* renamed from: ahlf */
final /* synthetic */ class ahlf implements Runnable {

    /* renamed from: a */
    private final ahlh f67429a;

    /* renamed from: b */
    private final ahkv f67430b;

    /* renamed from: c */
    private final String f67431c;

    public ahlf(ahlh ahlh, ahkv ahkv, String str) {
        this.f67429a = ahlh;
        this.f67430b = ahkv;
        this.f67431c = str;
    }

    public final void run() {
        ahlh ahlh = this.f67429a;
        ahlh.mo36786a(new ahlg(ahlh, this.f67430b, this.f67431c));
    }
}
