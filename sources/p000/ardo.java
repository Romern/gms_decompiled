package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ardo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardo {

    /* renamed from: a */
    public arit f87463a;

    /* renamed from: b */
    public arrh f87464b;

    public ardo(arit arit) {
        this.f87463a = arit;
    }

    /* renamed from: a */
    public final void mo48441a(Status status) {
        try {
            arit arit = this.f87463a;
            if (arit == null) {
                arrh arrh = this.f87464b;
                if (arrh != null) {
                    arrh.mo48773a(status);
                    return;
                }
                return;
            }
            arit.mo48583i(status);
        } catch (RemoteException e) {
            ardp.f87465a.mo25417e("Error calling onStartDirectTransferResult.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo48442b(Status status) {
        try {
            arit arit = this.f87463a;
            if (arit == null) {
                arrh arrh = this.f87464b;
                if (arrh != null) {
                    arrh.mo48773a(status);
                    return;
                }
                return;
            }
            arit.mo48584j(status);
        } catch (RemoteException e) {
            ardp.f87465a.mo25417e("Error calling onAbortDirectTransferResult.", e, new Object[0]);
        }
    }

    public ardo(arrh arrh) {
        this.f87464b = arrh;
    }
}
