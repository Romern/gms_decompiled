package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.call.CallEntryChimeraActivity;

/* renamed from: azay */
public final /* synthetic */ class azay implements azbf {

    /* renamed from: a */
    private final CallEntryChimeraActivity f98887a;

    public azay(CallEntryChimeraActivity callEntryChimeraActivity) {
        this.f98887a = callEntryChimeraActivity;
    }

    /* renamed from: a */
    public final bqgg mo54559a(Intent intent) {
        Intent intent2;
        CallEntryChimeraActivity callEntryChimeraActivity = this.f98887a;
        if (!callEntryChimeraActivity.f111070h.mo54556a(callEntryChimeraActivity.f111069g)) {
            azoj.m85933c("CallEntryActivity", "Unauth external invite from %s", callEntryChimeraActivity.f111069g);
            return CallEntryChimeraActivity.f111064b;
        }
        bmxv a = dds.m8204a(intent);
        if (!a.mo66813a()) {
            azoj.m85933c("CallEntryActivity", "Invalid sms invite number", new Object[0]);
            return CallEntryChimeraActivity.f111064b;
        }
        azoj.m85933c("CallEntryActivity", "Force route to Duo", new Object[0]);
        if (dds.m8207a(callEntryChimeraActivity)) {
            intent2 = azbi.m85184a(callEntryChimeraActivity, (String) a.mo66814b(), "com.google.android.apps.tachyon.action.INVITE");
        } else {
            intent2 = azbi.m85184a(callEntryChimeraActivity, (String) a.mo66814b(), "com.google.android.apps.tachyon.action.DIAL");
        }
        azbi.m85190a(callEntryChimeraActivity, intent2);
        return CallEntryChimeraActivity.f111063a;
    }
}
