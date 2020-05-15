package p000;

/* renamed from: ahpi */
public final /* synthetic */ class ahpi implements Runnable {

    /* renamed from: a */
    private final ahpj f67719a;

    /* renamed from: b */
    private final aisb f67720b;

    public ahpi(ahpj ahpj, aisb aisb) {
        this.f67719a = ahpj;
        this.f67720b = aisb;
    }

    public final void run() {
        ahpj ahpj = this.f67719a;
        aisb aisb = this.f67720b;
        ahmi ahmi = (ahmi) ahpj.f67724d.remove(aisb);
        srn srn = ahkm.f67363a;
        if (ahmi != null) {
            ahpj.f67726f.mo36854c(ahpj.f67721a, ahmi);
        }
        ahme ahme = (ahme) ahpj.f67725e.remove(aisb);
        if (ahme != null) {
            ahpj.f67726f.mo36854c(ahpj.f67721a, ahme);
        }
    }
}
