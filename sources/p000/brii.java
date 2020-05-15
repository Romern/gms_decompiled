package p000;

/* renamed from: brii */
final /* synthetic */ class brii implements aubt {

    /* renamed from: a */
    private final bril f142867a;

    public brii(bril bril) {
        this.f142867a = bril;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        bril bril;
        bril bril2 = this.f142867a;
        synchronized (bril2.f142873c.f142875b) {
            if (bril2.f142873c.f142875b.peek() == bril2) {
                bril2.f142873c.f142875b.remove();
                brim brim = bril2.f142873c;
                brim.f142876c = 0;
                bril = (bril) brim.f142875b.peek();
            } else {
                bril = null;
            }
        }
        bril2.f142872b.mo50392b(exc);
        if (bril != null) {
            bril.mo69564a();
        }
    }
}
