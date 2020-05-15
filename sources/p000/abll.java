package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: abll */
final /* synthetic */ class abll implements bmyl {

    /* renamed from: a */
    private final Context f57665a;

    public abll(Context context) {
        this.f57665a = context;
    }

    /* renamed from: a */
    public final void mo12292a(Object obj) {
        Void voidR = (Void) obj;
        aeat a = aeat.m51532a(this.f57665a);
        aeac aeac = new aeac();
        aeac.f63099k = "DSUW_TASK";
        aeac.f63097i = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        aeac.mo34027b(1);
        aeac.f63102n = true;
        aeac.mo34023a(0);
        aeac.mo33972a(new aeab(Settings.Secure.getUriFor("user_setup_personalization_state"), 0));
        a.mo33984a(aeac.mo33974b());
    }
}
