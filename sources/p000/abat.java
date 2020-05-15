package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abat */
public final /* synthetic */ class abat implements Runnable {

    /* renamed from: a */
    private final HelpChimeraActivity f56956a;

    /* renamed from: b */
    private final boolean f56957b;

    /* renamed from: c */
    private final boolean f56958c;

    public abat(HelpChimeraActivity helpChimeraActivity, boolean z, boolean z2) {
        this.f56956a = helpChimeraActivity;
        this.f56957b = z;
        this.f56958c = z2;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.f56956a;
        boolean z = this.f56957b;
        boolean z2 = this.f56958c;
        String c = GoogleHelpChimeraService.m66618c(helpChimeraActivity.f56986y);
        helpChimeraActivity.mo43338a(c, GoogleHelpChimeraService.m66616b(c), z, z2);
    }
}
