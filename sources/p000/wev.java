package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: wev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wev extends wfr {

    /* renamed from: a */
    final /* synthetic */ aucf f50598a;

    public wev(aucf aucf) {
        this.f50598a = aucf;
    }

    /* renamed from: a */
    public final void mo29068a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        if (status.mo17710c()) {
            try {
                rpc.m34202a(status, (bxqg) GeneratedMessageLite.m124014a(bxqg.f164380b, updateActivityControlsSettingsResult.f31276a), this.f50598a);
            } catch (bxwf e) {
                this.f50598a.mo50390a((Exception) e);
            }
        } else {
            rpc.m34202a(status, null, this.f50598a);
        }
    }
}
