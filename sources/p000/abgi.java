package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abgi implements aatu {

    /* renamed from: a */
    final /* synthetic */ GoogleHelpChimeraService f57406a;

    public abgi(GoogleHelpChimeraService googleHelpChimeraService) {
        this.f57406a = googleHelpChimeraService;
    }

    /* renamed from: a */
    public final Context mo31786a() {
        return this.f57406a.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo31787a(bzqp bzqp, HelpConfig helpConfig) {
        if (bzqp != null) {
            this.f57406a.mo43375a(new abgh(bzqp, helpConfig));
        } else {
            GoogleHelpChimeraService.m66617b(helpConfig);
        }
    }
}
