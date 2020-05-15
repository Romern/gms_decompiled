package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajsa */
final /* synthetic */ class ajsa implements aubt {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71216a;

    public ajsa(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71216a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f71216a.mo38632a(false);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68437a(exc);
        bnsl.mo68405a("Failed to get account name");
    }
}
