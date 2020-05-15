package p000;

/* renamed from: ovg */
final /* synthetic */ class ovg implements oxp {

    /* renamed from: a */
    private final ovi f38468a;

    /* renamed from: b */
    private final int f38469b;

    public ovg(ovi ovi, int i) {
        this.f38468a = ovi;
        this.f38469b = i;
    }

    /* renamed from: a */
    public final void mo22661a(oxt oxt) {
        ovi ovi = this.f38468a;
        ovi.f38472a.getActivity().runOnUiThread(new ovh(ovi, this.f38469b));
    }
}
