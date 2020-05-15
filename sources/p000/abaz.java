package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abaz implements aatu {

    /* renamed from: a */
    final /* synthetic */ HelpChimeraActivity f56970a;

    public abaz(HelpChimeraActivity helpChimeraActivity) {
        this.f56970a = helpChimeraActivity;
    }

    /* renamed from: a */
    public final Context mo31786a() {
        return this.f56970a.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo31787a(bzqp bzqp, HelpConfig helpConfig) {
        if (bzqp != null) {
            this.f56970a.mo43332a(new abay(bzqp, helpConfig));
            this.f56970a.mo43324J();
            return;
        }
        GoogleHelpChimeraService.m66617b(helpConfig);
    }
}
