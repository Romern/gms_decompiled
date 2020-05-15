package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: afkh */
public final /* synthetic */ class afkh implements sqe {

    /* renamed from: a */
    private final FileGroupRequest f64310a;

    public afkh(FileGroupRequest fileGroupRequest) {
        this.f64310a = fileGroupRequest;
    }

    /* renamed from: a */
    public final void mo12349a(Object obj, Object obj2) {
        FileGroupRequest fileGroupRequest = this.f64310a;
        afkn afkn = (afkn) obj;
        aucf aucf = (aucf) obj2;
        try {
            ((afjp) afkn.mo25289B()).mo34912b(new afkk(aucf), fileGroupRequest);
        } catch (RemoteException e) {
            rpc.m34201a(Status.f30109c, aucf);
        }
    }
}
