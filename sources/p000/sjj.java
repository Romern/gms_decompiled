package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: sjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjj {

    /* renamed from: a */
    private final sbj f44573a;

    public sjj(sbj sbj) {
        this.f44573a = sbj;
    }

    /* renamed from: a */
    public final void mo25644a(int i, Bundle bundle) {
        try {
            this.f44573a.mo16678a(i, (IBinder) null, bundle);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo25645a(sjr sjr) {
        try {
            this.f44573a.mo16678a(0, sjr.asBinder(), (Bundle) null);
        } catch (RemoteException e) {
        }
    }
}
