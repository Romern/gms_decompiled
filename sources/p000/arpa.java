package p000;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;

/* renamed from: arpa */
final /* synthetic */ class arpa implements Runnable {

    /* renamed from: a */
    private final TargetChimeraActivity f88051a;

    /* renamed from: b */
    private final Bundle f88052b;

    public arpa(TargetChimeraActivity targetChimeraActivity, Bundle bundle) {
        this.f88051a = targetChimeraActivity;
        this.f88052b = bundle;
    }

    public final void run() {
        TargetChimeraActivity targetChimeraActivity = this.f88051a;
        Bundle bundle = this.f88052b;
        if (!targetChimeraActivity.f108031e.isEmpty()) {
            targetChimeraActivity.mo59129a(false);
        } else {
            targetChimeraActivity.mo59127a(bundle);
        }
    }
}
