package p000;

import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: aqyy */
final /* synthetic */ class aqyy implements aubw {

    /* renamed from: a */
    private final CleanSharedSecretChimeraService f87132a;

    public aqyy(CleanSharedSecretChimeraService cleanSharedSecretChimeraService) {
        this.f87132a = cleanSharedSecretChimeraService;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        CleanSharedSecretChimeraService cleanSharedSecretChimeraService = this.f87132a;
        ManagedAccountSetupInfo managedAccountSetupInfo = (ManagedAccountSetupInfo) obj;
        if (managedAccountSetupInfo != null && managedAccountSetupInfo.f107899b != 0) {
            CleanSharedSecretChimeraService.m92619a(cleanSharedSecretChimeraService);
        }
    }
}
