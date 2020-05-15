package p000;

import android.content.Context;
import android.service.trust.TrustAgentService;
import java.util.List;

/* renamed from: det */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class det extends TrustAgentService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.TrustAgentService f12985a;

    public det(com.google.android.chimera.TrustAgentService trustAgentService) {
        this.f12985a = trustAgentService;
    }

    public final void attachBaseContext(Context context) {
        det.super.attachBaseContext(context);
    }

    public final boolean onConfigure(List list) {
        return this.f12985a.onConfigure(list);
    }

    public final void onDeviceLocked() {
        this.f12985a.onDeviceLocked();
    }

    public final void onDeviceUnlockLockout(long j) {
        this.f12985a.onDeviceUnlockLockout(j);
    }

    public final void onDeviceUnlocked() {
        this.f12985a.onDeviceUnlocked();
    }

    public final void onTrustTimeout() {
        this.f12985a.onTrustTimeout();
    }

    public final void onUnlockAttempt(boolean z) {
        this.f12985a.onUnlockAttempt(z);
    }
}
