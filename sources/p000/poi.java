package p000;

/* renamed from: poi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class poi extends poq {

    /* renamed from: c */
    private final String f39916c;

    public poi(pnl pnl, plx plx, String str) {
        super(pnl, plx, true, false, "ClearGuestModePinOperation");
        this.f39916c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnq a;
        for (pnm pnm : pnl.mo23495e().mo23505a()) {
            if (ptk.m31236a(this.f39916c, pnm.f39844a.mo17494a()) && (a = pnm.mo23497a()) != null) {
                a.f39870f = null;
            }
        }
    }
}
