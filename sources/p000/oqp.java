package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKARequest;

/* renamed from: oqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqp extends dcj implements oqr {
    public oqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carrierauth.internal.ICarrierAuthService");
    }

    /* renamed from: a */
    public final void mo22518a(oqo oqo, EAPAKARequest eAPAKARequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, oqo);
        dcl.m8165a(bj, eAPAKARequest);
        mo8528b(1, bj);
    }
}
