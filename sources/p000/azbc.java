package p000;

import android.content.Intent;
import android.util.Pair;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azbc */
public final /* synthetic */ class azbc implements bmxj {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98891a;

    public azbc(CallEntryChimeraActivity callEntryChimeraActivity) {
        this.f98891a = callEntryChimeraActivity;
    }

    public final Object apply(Object obj) {
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98891a;
        Pair pair = (Pair) obj;
        if (((Boolean) pair.first).booleanValue()) {
            azbi.m85188a(callEntryChimeraActivity, "from outbound call");
            callEntryChimeraActivity.setResult(-1, (Intent) pair.second);
        } else {
            callEntryChimeraActivity.setResult(0);
        }
        callEntryChimeraActivity.finish();
        return null;
    }
}
