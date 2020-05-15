package p000;

/* renamed from: lvi */
final /* synthetic */ class lvi implements Runnable {

    /* renamed from: a */
    private final lvj f33038a;

    public lvi(lvj lvj) {
        this.f33038a = lvj;
    }

    public final void run() {
        this.f33038a.notifyDataSetChanged();
    }
}
