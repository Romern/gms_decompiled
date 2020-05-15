package p000;

/* renamed from: rgf */
final /* synthetic */ class rgf implements Runnable {

    /* renamed from: a */
    private final rgn f42913a;

    public rgf(rgn rgn) {
        this.f42913a = rgn;
    }

    public final void run() {
        this.f42913a.notifyDataSetChanged();
    }
}
