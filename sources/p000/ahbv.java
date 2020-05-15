package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: ahbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahbv implements sqe {

    /* renamed from: a */
    private final RenameRequest f66969a;

    public ahbv(RenameRequest renameRequest) {
        this.f66969a = renameRequest;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12349a(Object obj, Object obj2) {
        ahbz ahbz = (ahbz) obj;
        aucf aucf = (aucf) obj2;
        try {
            ((ahbn) ahbz.mo25289B()).mo34999a(new ahbu(aucf), this.f66969a);
        } catch (RemoteException e) {
            rpc.m34202a(Status.f30109c, null, aucf);
        }
    }
}
