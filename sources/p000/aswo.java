package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* renamed from: aswo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aswo extends aswl {

    /* renamed from: a */
    private final WeakReference f89867a;

    /* renamed from: b */
    private final int f89868b;

    /* renamed from: a */
    public final void mo49607a(Status status, Bundle bundle) {
        Activity activity = (Activity) this.f89867a.get();
        if (activity != null) {
            if (status.mo17709b()) {
                try {
                    status.mo17708a(activity, this.f89868b);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    Log.w("TapAndPayClientImpl", "Exception starting pending intent", e);
                }
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.f89868b, new Intent(), JGCastService.FLAG_PRIVATE_DISPLAY);
            if (createPendingResult == null) {
                Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
                return;
            }
            try {
                createPendingResult.send(!status.mo17710c() ? status.f30115i : -1);
            } catch (PendingIntent.CanceledException e2) {
                Log.w("TapAndPayClientImpl", "Exception setting pending result", e2);
            }
        }
    }

    public aswo(Activity activity, int i) {
        this.f89867a = new WeakReference(activity);
        this.f89868b = i;
    }
}
