package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbv extends dcj implements gbx {
    public gbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.asterism.internal.IAsterismCallbacks");
    }

    /* renamed from: a */
    public final void mo11626a(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getAsterismConsentResponse);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo11611a(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, setAsterismConsentResponse);
        mo8530c(2, bj);
    }
}
