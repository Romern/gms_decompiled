package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbe implements C1263pb {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56980a;

    public abbe(HelpChimeraActivity helpChimeraActivity) {
        this.f56980a = helpChimeraActivity;
    }

    /* renamed from: a */
    public final boolean mo15674a() {
        this.f56980a.f78972s.setVisible(false);
        this.f56980a.f78962i.setVisibility(0);
        HelpChimeraActivity helpChimeraActivity = this.f56980a;
        if (helpChimeraActivity.f78976w.peek() == bzpv.HELP_SUB_CONSOLE || helpChimeraActivity.mo43364z()) {
            this.f56980a.onBackPressed();
            return true;
        } else if (!aaya.m47228a(cegf.m136774b()) || !this.f56980a.mo43326L()) {
            return true;
        } else {
            this.f56980a.findViewById(C0126R.C0129id.gh_search_box).setVisibility(0);
            this.f56980a.mo43315A();
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo15675b() {
        this.f56980a.f78972s.setVisible(false);
        return true;
    }
}
