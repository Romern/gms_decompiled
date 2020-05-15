package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abbb implements aarn {

    /* renamed from: a */
    final /* synthetic */ boolean f56973a;

    /* renamed from: b */
    final /* synthetic */ HelpChimeraActivity f56974b;

    public abbb(HelpChimeraActivity helpChimeraActivity, boolean z) {
        this.f56974b = helpChimeraActivity;
        this.f56973a = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(int, bzps):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(bzpv, int):void
      com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        boolean z;
        HelpChimeraActivity helpChimeraActivity = this.f56974b;
        boolean z2 = this.f56973a;
        aask b = GoogleHelpChimeraService.m66616b(GoogleHelpChimeraService.m66618c(helpChimeraActivity.f56986y));
        if (b == null || b.f56462e) {
            z = true;
        } else {
            z = false;
        }
        bzqp a = aatw.m47002a(aarp);
        if (a != null) {
            helpChimeraActivity.f56986y.mo43218a(a);
        } else if (!z) {
            if (!helpChimeraActivity.f78968o) {
                helpChimeraActivity.mo43339a(!helpChimeraActivity.mo43358t(), true);
                return;
            }
            return;
        }
        helpChimeraActivity.mo43324J();
        helpChimeraActivity.mo43343b(z2);
    }
}
