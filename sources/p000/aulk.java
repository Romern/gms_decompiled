package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: aulk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aulk extends auqa implements sjr {

    /* renamed from: a */
    private final sjn f92038a;

    public aulk(sjn sjn) {
        this.f92038a = sjn;
    }

    /* renamed from: a */
    public final sce mo50656a(auqe auqe, int i, Bundle bundle) {
        aulp ault = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : new ault(auqe, bundle) : new auls(auqe, bundle) : new auln(new aupj(aupo.m77578a(rpr.m34216b())), auqe, bundle) : new aulr(auqe, bundle);
        if (ault == null) {
            try {
                auqe.mo50793a(new Status(8, "Invalid operation."), null);
            } catch (RemoteException e) {
            }
            return null;
        }
        this.f92038a.mo25649a(ault);
        return ault.f92049g;
    }
}
