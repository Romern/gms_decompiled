package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: arlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arlj extends arje {

    /* renamed from: b */
    private final aucf f87845b;

    public arlj(aucf aucf) {
        super(null);
        this.f87845b = aucf;
    }

    /* renamed from: a */
    public final void mo48599a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        if (status.mo17710c()) {
            this.f87845b.mo50391a(managedAccountSetupInfo);
        } else {
            this.f87845b.mo50390a((Exception) new rjp(status));
        }
    }
}
