package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;

/* renamed from: ahbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahbt implements sqe {

    /* renamed from: a */
    private final OpenFileDescriptorRequest f66967a;

    public ahbt(OpenFileDescriptorRequest openFileDescriptorRequest) {
        this.f66967a = openFileDescriptorRequest;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12349a(Object obj, Object obj2) {
        ahbz ahbz = (ahbz) obj;
        aucf aucf = (aucf) obj2;
        try {
            ((ahbn) ahbz.mo25289B()).mo34998a(new ahbs(aucf), this.f66967a);
        } catch (RemoteException e) {
            rpc.m34202a(Status.f30109c, null, aucf);
        }
    }
}
