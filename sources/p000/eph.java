package p000;

/* renamed from: eph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eph extends C0036av {

    /* renamed from: a */
    private final C0034at f15478a;

    /* renamed from: g */
    private final C0034at f15479g;

    /* renamed from: h */
    private final epg f15480h;

    public eph(C0034at atVar, C0034at atVar2, epg epg) {
        this.f15478a = atVar;
        this.f15479g = atVar2;
        this.f15480h = epg;
        mo2667a(atVar, new epe(this));
        mo2667a(atVar2, new epf(this));
    }

    /* renamed from: e */
    public final void mo10391e() {
        Object b = this.f15478a.mo2448b();
        Object b2 = this.f15479g.mo2448b();
        if (b != null && b2 != null) {
            Object a = this.f15480h.mo10390a(b, b2);
            if (!a.equals(mo2448b())) {
                mo2450b(a);
            }
        }
    }
}
