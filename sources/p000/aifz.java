package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;

/* renamed from: aifz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aifz extends dcj implements aigb {
    public aifz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    /* renamed from: a */
    public final void mo37466a(OnConnectionResponseParams onConnectionResponseParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onConnectionResponseParams);
        mo8530c(2, bj);
    }
}
