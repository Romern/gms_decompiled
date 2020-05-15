package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;

/* renamed from: wew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wew extends wfr {

    /* renamed from: a */
    final /* synthetic */ aucf f50599a;

    public wew(aucf aucf) {
        this.f50599a = aucf;
    }

    /* renamed from: a */
    public final void mo29069a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        if (status.mo17710c()) {
            try {
                rpc.m34202a(status, (bxpe) GeneratedMessageLite.m124014a(bxpe.f164247d, getActivityControlsSettingsResult.f31272a), this.f50599a);
            } catch (bxwf e) {
                this.f50599a.mo50390a((Exception) e);
            }
        } else {
            rpc.m34202a(status, null, this.f50599a);
        }
    }
}
