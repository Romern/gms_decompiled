package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: wff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wff extends wfx {

    /* renamed from: a */
    final /* synthetic */ aucf f50608a;

    public wff(aucf aucf) {
        this.f50608a = aucf;
    }

    /* renamed from: a */
    public final void mo29074a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        if (status.mo17710c()) {
            rpc.m34202a(status, updateActivityControlsSettingsInternalResult.f31275a, this.f50608a);
        } else {
            rpc.m34202a(status, null, this.f50608a);
        }
    }
}
