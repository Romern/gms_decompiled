package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: ajmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajmu extends ajhf {

    /* renamed from: a */
    private final ajmt f70939a;

    public ajmu(NearbySharingChimeraService nearbySharingChimeraService, String str) {
        this.f70939a = new ajmt(nearbySharingChimeraService, str);
    }

    /* renamed from: a */
    public final void mo38649a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        if (!cfov.m142034J()) {
            m58704a("registerSendSurface");
        }
        this.f70939a.mo38649a(registerSendSurfaceParams);
    }

    /* renamed from: a */
    public final void mo38650a(RegisterSharingProviderParams registerSharingProviderParams) {
        if (!cfov.m142036L()) {
            m58704a("registerSharingProvider");
        }
        this.f70939a.mo38650a(registerSharingProviderParams);
    }

    /* renamed from: a */
    public final void mo38660a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        if (!cfov.m142034J()) {
            m58704a("unregisterSendSurface");
        }
        this.f70939a.mo38660a(unregisterSendSurfaceParams);
    }

    /* renamed from: a */
    public final void mo38661a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        this.f70939a.mo38661a(unregisterSharingProviderParams);
    }
}
