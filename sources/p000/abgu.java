package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgu extends abgl {

    /* renamed from: f */
    private final long f57434f;

    /* renamed from: g */
    private final Bundle f57435g;

    /* renamed from: h */
    private final GoogleHelp f57436h;

    public abgu(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, long j, Bundle bundle, GoogleHelp googleHelp) {
        super("SaveAsyncHelpPsdOperation", googleHelpChimeraService, str, abcf);
        this.f57434f = j;
        this.f57435g = bundle;
        this.f57436h = googleHelp;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        aayh.m47246a(this.f57435g, aayh.m47258b(this.f57434f), this.f57412a);
        Bundle bundle = this.f57435g;
        GoogleHelp googleHelp = this.f57436h;
        GoogleHelpChimeraService googleHelpChimeraService = this.f57412a;
        if (bundle.containsKey("gms:googlehelp:async_help_psd_collection_time_ms")) {
            aayh.m47240a(137, Long.valueOf(bundle.getString("gms:googlehelp:async_help_psd_collection_time_ms")).longValue(), googleHelp, googleHelpChimeraService);
        } else if (bundle.containsKey("gms:googlehelp:async_help_psd_failure")) {
            aayh.m47241a((int) ErrorInfo.TYPE_SDU_MEMORY_FULL, bundle.getString("gms:googlehelp:async_help_psd_failure"), googleHelp, googleHelpChimeraService);
        }
        this.f57414e.mo31996a();
    }
}
