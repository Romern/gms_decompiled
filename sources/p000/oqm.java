package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: oqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqm extends dcj implements oqo {
    public oqm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
    }

    /* renamed from: a */
    public final void mo22513a(Status status, EAPAKAResponse eAPAKAResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, eAPAKAResponse);
        mo8530c(1, bj);
    }
}
