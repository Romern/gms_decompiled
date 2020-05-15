package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: aliv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aliv extends dcj implements alix {
    public aliv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo40441a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
