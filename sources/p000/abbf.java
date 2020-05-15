package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbf implements aate {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56981a;

    public abbf(HelpChimeraActivity helpChimeraActivity) {
        this.f56981a = helpChimeraActivity;
    }

    /* renamed from: a */
    public final void mo31768a(aaru aaru) {
        if ((aaru instanceof abeu) && aaru.mo31663b()) {
            this.f56981a.f78960g.mo29584c();
            this.f56981a.mo43344c(aaru);
        }
    }

    /* renamed from: b */
    public final void mo31769b(aaru aaru) {
        abeu abeu;
        abey abey;
        CharSequence charSequence;
        if ((aaru instanceof abeu) && (abey = (abeu = (abeu) aaru).f57310e) != null) {
            HelpChimeraActivity helpChimeraActivity = this.f56981a;
            boolean b = abeu.mo31663b();
            if (HelpChimeraActivity.m66525P()) {
                helpChimeraActivity.findViewById(C0126R.C0129id.gh_open_search_view_progress_bar).setVisibility(8);
            }
            boolean z = false;
            if (!b && abey.mo32061e() && helpChimeraActivity.f56986y.mo43248w()) {
                z = true;
            }
            if (z) {
                abey = abey.m47590a(helpChimeraActivity.f56986y.mo43250x());
            }
            if (!abey.mo32060d()) {
                boolean L = true ^ helpChimeraActivity.mo43326L();
                if (b) {
                    if (HelpChimeraActivity.m66525P()) {
                        charSequence = helpChimeraActivity.f78973t.mo60448c().toString();
                    } else {
                        abfz abfz = helpChimeraActivity.f78971r;
                        abfz.f57383b = abfz.mo32076a().mo32073b();
                        charSequence = abfz.f57383b;
                    }
                    helpChimeraActivity.mo43334a(abey, charSequence, helpChimeraActivity.f78960g);
                } else {
                    if (L) {
                        helpChimeraActivity.f78963j.mo31925a(abey);
                    }
                    if (helpChimeraActivity.f56986y.mo43252z()) {
                        helpChimeraActivity.f78963j.mo31932e();
                    } else if (L) {
                        helpChimeraActivity.f78963j.mo31924a();
                        if (helpChimeraActivity.f78969p || !helpChimeraActivity.f56986y.mo43232g()) {
                            helpChimeraActivity.f78963j.mo31929c();
                            helpChimeraActivity.mo43325K();
                            if (helpChimeraActivity.f56986y.mo43206A()) {
                                helpChimeraActivity.mo43328N();
                            }
                        }
                    }
                }
                if (!abey.mo32061e() && !z) {
                    helpChimeraActivity.f78957d.execute(new abfd(new abfe(helpChimeraActivity.f78965l, abey, helpChimeraActivity.f56986y.f78827b)));
                    if (ceeg.f182447a.mo6606a().mo78935C()) {
                        abhd.m47713a(helpChimeraActivity.f78957d, helpChimeraActivity, helpChimeraActivity.f78965l, abey.f57323b.values());
                    }
                }
                helpChimeraActivity.supportInvalidateOptionsMenu();
            }
        }
    }
}
