package p000;

import android.view.View;
import com.google.android.gms.trustagent.GoogleTrustAgentFirstNotificationChimeraActivity;

/* renamed from: aukm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukm implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GoogleTrustAgentFirstNotificationChimeraActivity f91984a;

    public aukm(GoogleTrustAgentFirstNotificationChimeraActivity googleTrustAgentFirstNotificationChimeraActivity) {
        this.f91984a = googleTrustAgentFirstNotificationChimeraActivity;
    }

    public void onClick(View view) {
        this.f91984a.finish();
        this.f91984a.overridePendingTransition(0, 0);
    }
}
