package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;

/* renamed from: arvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arvd extends arwc {
    public arvd(rlf rlf) {
        super(rlf);
    }

    /* renamed from: a */
    public final void mo48866a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        if (!status.mo17710c()) {
            this.f88354a.mo9481a(status);
        } else {
            this.f88354a.mo9482a(bootstrapAccountArr);
        }
    }
}
