package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azaz */
public final /* synthetic */ class azaz implements azbf {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98888a;

    public azaz(CallEntryChimeraActivity callEntryChimeraActivity) {
        this.f98888a = callEntryChimeraActivity;
    }

    /* renamed from: a */
    public final bqgg mo54559a(Intent intent) {
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98888a;
        if (!callEntryChimeraActivity.f111070h.mo54556a(callEntryChimeraActivity.f111069g)) {
            azoj.m85933c("CallEntryActivity", "Unauth external register from %s", callEntryChimeraActivity.f111069g);
            return CallEntryChimeraActivity.f111064b;
        }
        if (azbi.m85190a(callEntryChimeraActivity, (Intent) null)) {
            callEntryChimeraActivity.mo60369a(532);
        } else {
            callEntryChimeraActivity.mo60369a(537);
        }
        return CallEntryChimeraActivity.f111063a;
    }
}
