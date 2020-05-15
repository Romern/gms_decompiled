package p000;

import com.google.android.gms.family.webview.FamilyWebViewChimeraActivity;

/* renamed from: wri */
public final /* synthetic */ class wri implements aubt {

    /* renamed from: a */
    private final FamilyWebViewChimeraActivity f51179a;

    public wri(FamilyWebViewChimeraActivity familyWebViewChimeraActivity) {
        this.f51179a = familyWebViewChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        FamilyWebViewChimeraActivity familyWebViewChimeraActivity = this.f51179a;
        wgn.m41926f("FamilyWebViewChimeraActivity", "Webview initialization failed:", exc);
        familyWebViewChimeraActivity.mo18569a();
    }
}
