package p000;

import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: ajop */
final /* synthetic */ class ajop implements aubt {

    /* renamed from: a */
    private final ReceiveSurfaceChimeraActivity f71068a;

    public ajop(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.f71068a = receiveSurfaceChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f71068a.mo38632a(false);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to get account name");
    }
}
