package p000;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajhp */
final /* synthetic */ class ajhp implements aubt {

    /* renamed from: a */
    private final ConsentsChimeraActivity f70671a;

    public ajhp(ConsentsChimeraActivity consentsChimeraActivity) {
        this.f70671a = consentsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ConsentsChimeraActivity consentsChimeraActivity = this.f70671a;
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Unable to enable device contacts.");
        consentsChimeraActivity.mo44389h();
    }
}
