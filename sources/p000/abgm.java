package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgm extends abgl {

    /* renamed from: f */
    private final HelpConfig f57415f;

    /* renamed from: g */
    private final bqgj f57416g;

    public abgm(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, HelpConfig helpConfig, bqgj bqgj) {
        super("GetEscalationOptionsOperation", googleHelpChimeraService, str, abcf);
        this.f57415f = helpConfig;
        this.f57416g = bqgj;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        int i;
        bzqp a = aats.m46994a(context.getApplicationContext(), this.f57415f, this.f57416g, this.f57412a.mo43374a());
        if (a == null) {
            Log.e("gH_GetEscalationOp", "No escalation options returned");
            this.f57414e.mo32009g();
            i = 22;
        } else {
            this.f57414e.mo32003b(a.serializeToBytes());
            i = 21;
        }
        MetricsIntentOperation.m66597a(context, this.f57415f.f78830e, this.f57413d, 126, i, false);
    }
}
