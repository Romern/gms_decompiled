package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;

/* renamed from: wfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wfg extends wfx {

    /* renamed from: a */
    final /* synthetic */ aucf f50609a;

    public wfg(aucf aucf) {
        this.f50609a = aucf;
    }

    /* renamed from: a */
    public final void mo29075a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        if (status.mo17710c()) {
            rpc.m34202a(status, syncActivityControlsSettingsInternalResult.f31274a, this.f50609a);
        } else {
            rpc.m34202a(status, null, this.f50609a);
        }
    }
}
