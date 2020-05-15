package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import java.util.Set;

/* renamed from: vvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvo extends rzt {

    /* renamed from: a */
    final /* synthetic */ DroidGuardChimeraService f50048a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vvo(DroidGuardChimeraService droidGuardChimeraService, Context context) {
        super(context, 25, new int[0]);
        this.f50048a = droidGuardChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return DroidGuardChimeraService.f31244a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        if (cdre.m134728b()) {
            DroidGuardChimeraService droidGuardChimeraService = this.f50048a;
            bnic bnic = DroidGuardChimeraService.f31244a;
            if (droidGuardChimeraService.f31246c != null) {
                try {
                    droidGuardChimeraService.f31247d.execute(new vvn(this));
                } catch (RuntimeException e) {
                    this.f50048a.f31248e.mo28911a(e);
                }
            }
        }
        sbj.mo16678a(0, new vxr(this.f50048a, getServiceRequest.f30230d), (Bundle) null);
    }
}
