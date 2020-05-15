package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgn extends abgl {

    /* renamed from: f */
    private final HelpConfig f57417f;

    public abgn(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, HelpConfig helpConfig) {
        super("GetRealtimeSupportStatusOperation", googleHelpChimeraService, str, abcf);
        this.f57417f = helpConfig;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        int i;
        bzra a = aava.m47057a(context, this.f57417f, this.f57412a.mo43374a());
        if (a == null) {
            this.f57414e.mo32010h();
            i = 22;
        } else {
            this.f57414e.mo32005c(a.mo73642k());
            i = 21;
        }
        MetricsIntentOperation.m66597a(context, this.f57417f.f78830e, this.f57413d, 149, i, false);
    }
}
