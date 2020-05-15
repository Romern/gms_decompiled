package p000;

/* renamed from: ajha */
final /* synthetic */ class ajha implements aubw {

    /* renamed from: a */
    private final ajhe f70609a;

    /* renamed from: b */
    private final ajhd f70610b;

    public ajha(ajhe ajhe, ajhd ajhd) {
        this.f70609a = ajhe;
        this.f70610b = ajhd;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ajhe ajhe = this.f70609a;
        ajhd ajhd = this.f70610b;
        Boolean bool = (Boolean) obj;
        if (!ajhe.f70618f && !bool.booleanValue()) {
            if (ajhe.f70616d.isLaidOut()) {
                ajhd.mo38630a();
            } else {
                ajhe.f70616d.getViewTreeObserver().addOnPreDrawListener(new ajhc(ajhe, ajhd));
            }
        }
    }
}
