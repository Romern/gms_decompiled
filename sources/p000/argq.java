package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: argq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argq {

    /* renamed from: a */
    private final arjf f87697a;

    /* renamed from: b */
    private final arrh f87698b;

    public argq(arjf arjf) {
        this.f87697a = arjf;
        this.f87698b = null;
    }

    /* renamed from: a */
    public final void mo48522a(Status status) {
        try {
            arjf arjf = this.f87697a;
            if (arjf == null) {
                arrh arrh = this.f87698b;
                if (arrh != null) {
                    arrh.mo48773a(status);
                    return;
                }
                return;
            }
            arjf.mo48604d(status);
        } catch (RemoteException e) {
            argr.f87699a.mo25417e("Error calling onStartDirectTransferResult.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo48523b(Status status) {
        try {
            arjf arjf = this.f87697a;
            if (arjf == null) {
                arrh arrh = this.f87698b;
                if (arrh != null) {
                    arrh.mo48773a(status);
                    return;
                }
                return;
            }
            arjf.mo48605e(status);
        } catch (RemoteException e) {
            argr.f87699a.mo25417e("Error calling onAbortDirectTransferResult.", e, new Object[0]);
        }
    }

    public argq(arrh arrh) {
        this.f87698b = arrh;
        this.f87697a = null;
    }
}
