package p000;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azba */
public final /* synthetic */ class azba implements azbf {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98889a;

    public azba(CallEntryChimeraActivity callEntryChimeraActivity) {
        this.f98889a = callEntryChimeraActivity;
    }

    /* renamed from: a */
    public final bqgg mo54559a(Intent intent) {
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98889a;
        callEntryChimeraActivity.mo60369a(534);
        ComponentName component = intent.getComponent();
        boolean z = true;
        if (CallEntryChimeraActivity.f111065c.equals(component) || CallEntryChimeraActivity.f111067e.equals(component)) {
            z = false;
        } else if (!CallEntryChimeraActivity.f111066d.equals(component) && !CallEntryChimeraActivity.f111068f.equals(component)) {
            azoj.m85933c("CallEntryActivity", "%s intent was sent to an unknown component %s", "android.intent.action.VIEW", component);
            return CallEntryChimeraActivity.f111064b;
        }
        callEntryChimeraActivity.mo60369a(932);
        return callEntryChimeraActivity.mo60368a(intent.getData(), z, false);
    }
}
