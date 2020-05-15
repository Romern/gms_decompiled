package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;

/* renamed from: wex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wex extends wfr {

    /* renamed from: a */
    final /* synthetic */ aucf f50600a;

    public wex(aucf aucf) {
        this.f50600a = aucf;
    }

    /* renamed from: a */
    public final void mo29070a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        if (status.mo17710c()) {
            try {
                rpc.m34202a(status, (bxok) GeneratedMessageLite.m124016a(bxok.f164161d, readDeviceLevelSettingsResult.f31273a, bxus.m123744c()), this.f50600a);
            } catch (bxwf e) {
                this.f50600a.mo50390a((Exception) e);
            }
        } else {
            rpc.m34202a(status, null, this.f50600a);
        }
    }
}
