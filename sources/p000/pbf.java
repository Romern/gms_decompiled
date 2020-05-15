package p000;

/* renamed from: pbf */
final /* synthetic */ class pbf implements Runnable {

    /* renamed from: a */
    private final pbk f38756a;

    /* renamed from: b */
    private final int f38757b;

    /* renamed from: c */
    private final int f38758c;

    /* renamed from: d */
    private final String f38759d;

    public pbf(pbk pbk, int i, int i2, String str) {
        this.f38756a = pbk;
        this.f38757b = i;
        this.f38758c = i2;
        this.f38759d = str;
    }

    public final void run() {
        pbk pbk = this.f38756a;
        int i = this.f38757b;
        int i2 = this.f38758c;
        String str = this.f38759d;
        pbm pbm = pbk.f38767a;
        bnsn bnsn = pbm.f38775a;
        pbm.f38783i.mo22568a(i, i2, str);
    }
}
