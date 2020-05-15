package p000;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajho */
final /* synthetic */ class ajho implements aubw {

    /* renamed from: a */
    private final ConsentsChimeraActivity f70670a;

    public ajho(ConsentsChimeraActivity consentsChimeraActivity) {
        this.f70670a = consentsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.f70670a;
        if (((Boolean) obj).booleanValue()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Successfully enabled device contacts.");
            consentsChimeraActivity.setResult(-1);
            consentsChimeraActivity.finishAfterTransition();
            return;
        }
        ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Unable to enable device contacts.");
        consentsChimeraActivity.mo44389h();
    }
}
