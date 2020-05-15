package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;

/* renamed from: weu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class weu extends wfr {

    /* renamed from: a */
    final /* synthetic */ aucf f50597a;

    public weu(aucf aucf) {
        this.f50597a = aucf;
    }

    /* renamed from: a */
    public final void mo29067a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        if (status.mo17710c()) {
            try {
                rpc.m34202a(status, (bxpe) GeneratedMessageLite.m124014a(bxpe.f164247d, forceSettingsCacheRefreshResult.f31271a), this.f50597a);
            } catch (bxwf e) {
                this.f50597a.mo50390a((Exception) e);
            }
        } else {
            rpc.m34202a(status, null, this.f50597a);
        }
    }
}
