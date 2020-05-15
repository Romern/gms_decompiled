package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abas */
public final /* synthetic */ class abas implements Runnable {

    /* renamed from: a */
    private final HelpChimeraActivity f56955a;

    public abas(HelpChimeraActivity helpChimeraActivity) {
        this.f56955a = helpChimeraActivity;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.f56955a;
        helpChimeraActivity.mo43349e(helpChimeraActivity.f56986y.f78821U);
        if (aaya.m47228a(cegf.m136774b())) {
            helpChimeraActivity.findViewById(C0126R.C0129id.gh_search_box).setVisibility(8);
            helpChimeraActivity.mo43351m();
        }
        helpChimeraActivity.f78961h.setVisibility(0);
    }
}
