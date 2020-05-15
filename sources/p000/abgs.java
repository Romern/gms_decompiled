package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgs extends abgl {

    /* renamed from: f */
    private final long f57427f;

    /* renamed from: g */
    private final Bundle f57428g;

    /* renamed from: h */
    private final GoogleHelp f57429h;

    /* renamed from: i */
    private final FeedbackOptions f57430i;

    public abgs(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super("SaveAsyncFeedbackPsbdOperation", googleHelpChimeraService, str, abcf);
        this.f57430i = feedbackOptions;
        this.f57428g = bundle;
        this.f57427f = j;
        this.f57429h = googleHelp;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        aayh.m47243a(this.f57427f, this.f57430i, this.f57428g, this.f57412a, this.f57429h);
        this.f57414e.mo31998b();
    }
}
