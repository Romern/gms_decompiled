package p000;

/* renamed from: nod */
final /* synthetic */ class nod implements Runnable {

    /* renamed from: a */
    private final noe f36135a;

    /* renamed from: b */
    private final biro f36136b;

    /* renamed from: c */
    private final bpea f36137c;

    /* renamed from: d */
    private final int f36138d;

    /* renamed from: e */
    private final int f36139e;

    public nod(noe noe, biro biro, bpea bpea, int i, int i2) {
        this.f36135a = noe;
        this.f36136b = biro;
        this.f36137c = bpea;
        this.f36138d = i;
        this.f36139e = i2;
    }

    public final void run() {
        noe noe = this.f36135a;
        biro biro = this.f36136b;
        bpea bpea = this.f36137c;
        int i = this.f36138d;
        int i2 = this.f36139e;
        noj noj = noe.f36144e;
        bnsn bnsn = noj.f36155b;
        noj.f36159D.mo22052b();
        nip g = noe.f36144e.mo21194g();
        if (g != null) {
            if (!biro.f121437c) {
                noe.f36144e.f36168M.mo20860a(bpeb.INPUT_EVENT, bpea);
            }
            g.mo20804a(noe.f36140a, biro, i, i2);
        }
    }
}
