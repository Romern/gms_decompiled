package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: afkg */
final /* synthetic */ class afkg implements sqe {

    /* renamed from: a */
    private final FileGroupRequest f64309a;

    public afkg(FileGroupRequest fileGroupRequest) {
        this.f64309a = fileGroupRequest;
    }

    /* renamed from: a */
    public final void mo12349a(Object obj, Object obj2) {
        FileGroupRequest fileGroupRequest = this.f64309a;
        afkn afkn = (afkn) obj;
        aucf aucf = (aucf) obj2;
        try {
            ((afjp) afkn.mo25289B()).mo34908a(new afkj(aucf), fileGroupRequest);
        } catch (RemoteException e) {
            rpc.m34201a(Status.f30109c, aucf);
        }
    }
}
