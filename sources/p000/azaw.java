package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azaw */
public final /* synthetic */ class azaw implements azbf {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98885a;

    public azaw(CallEntryChimeraActivity callEntryChimeraActivity) {
        this.f98885a = callEntryChimeraActivity;
    }

    /* renamed from: a */
    public final bqgg mo54559a(Intent intent) {
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98885a;
        callEntryChimeraActivity.mo60369a(529);
        if (!callEntryChimeraActivity.f111070h.mo54556a(callEntryChimeraActivity.f111069g)) {
            callEntryChimeraActivity.mo60369a(539);
            azoj.m85933c("CallEntryActivity", "Unauth external call from %s", callEntryChimeraActivity.f111069g);
            return CallEntryChimeraActivity.f111064b;
        }
        callEntryChimeraActivity.mo60369a(540);
        return callEntryChimeraActivity.mo60368a(intent.getData(), intent.getBooleanExtra(ddr.f12952h, false), intent.getBooleanExtra(ddr.f12953i, false));
    }
}
