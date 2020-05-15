package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;

/* renamed from: ahbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahbr implements sqe {

    /* renamed from: a */
    private final DeleteFileRequest f66965a;

    public ahbr(DeleteFileRequest deleteFileRequest) {
        this.f66965a = deleteFileRequest;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12349a(Object obj, Object obj2) {
        ahbz ahbz = (ahbz) obj;
        aucf aucf = (aucf) obj2;
        try {
            ((ahbn) ahbz.mo25289B()).mo34997a(new ahbq(aucf), this.f66965a);
        } catch (RemoteException e) {
            rpc.m34202a(Status.f30109c, null, aucf);
        }
    }
}
