package p000;

/* renamed from: axde */
final /* synthetic */ class axde implements Runnable {

    /* renamed from: a */
    private final axdf f95832a;

    /* renamed from: b */
    private final String f95833b;

    public axde(axdf axdf, String str) {
        this.f95832a = axdf;
        this.f95833b = str;
    }

    public final void run() {
        axdf axdf = this.f95832a;
        axdf.getActivity().setTitle(this.f95833b);
    }
}
