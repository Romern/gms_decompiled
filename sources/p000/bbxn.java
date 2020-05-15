package p000;

/* renamed from: bbxn */
final /* synthetic */ class bbxn implements Runnable {

    /* renamed from: a */
    private final bbxo f103691a;

    public bbxn(bbxo bbxo) {
        this.f103691a = bbxo;
    }

    public final void run() {
        bbxo bbxo = this.f103691a;
        int i = 3;
        if (bbxo.f103695d != 3) {
            i = bbxo.f103694c;
        }
        for (bbpu bbpu : bbxo.f103692a) {
            bbpu.mo56343a(i);
        }
        bbxo.f103693b.set(false);
    }
}
