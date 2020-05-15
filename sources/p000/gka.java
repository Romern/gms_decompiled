package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.account.authenticator.ChromeOsAuthDelegateService;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import java.util.UUID;

/* renamed from: gka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gka extends iyn {
    public gka(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        if (!"com.google".equals(setupAccountWorkflowRequest.f10788h)) {
            return super.mo11948a(setupAccountWorkflowRequest);
        }
        Intent a = ChromeOsAuthDelegateService.m6271a();
        a.addCategory(UUID.randomUUID().toString());
        return PendingIntent.getActivity(this.f21934a, 0, a, JGCastService.FLAG_PRIVATE_DISPLAY);
    }
}
