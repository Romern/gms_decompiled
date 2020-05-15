package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgt extends abgl {

    /* renamed from: f */
    private final long f57431f;

    /* renamed from: g */
    private final Bundle f57432g;

    /* renamed from: h */
    private final GoogleHelp f57433h;

    public abgt(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, long j, Bundle bundle, GoogleHelp googleHelp) {
        super("SaveAsyncFeedbackPsdOperation", googleHelpChimeraService, str, abcf);
        this.f57431f = j;
        this.f57432g = bundle;
        this.f57433h = googleHelp;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        aayh.m47242a(this.f57431f, this.f57432g, this.f57412a, this.f57433h);
        this.f57414e.mo31996a();
    }
}
