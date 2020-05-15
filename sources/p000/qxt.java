package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: qxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxt extends rbc implements aaai {

    /* renamed from: a */
    private final Context f42401a;

    public qxt(Context context) {
        this.f42401a = context;
    }

    /* renamed from: a */
    public final void mo24393a(rba rba) {
        try {
            Integer a = qxs.m33071a(this.f42401a);
            if (a != null) {
                rba.mo24426a(Status.f30107a, a.intValue());
            } else {
                rba.mo24426a(Status.f30109c, -1);
            }
        } catch (RemoteException e) {
            Log.e("BootCountService", "Could not send a status back in the callback", e);
        }
    }
}
