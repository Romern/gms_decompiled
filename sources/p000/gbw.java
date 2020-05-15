package p000;

import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gbw extends dck implements gbx {
    public gbw() {
        super("com.google.android.gms.asterism.internal.IAsterismCallbacks");
    }

    /* renamed from: a */
    public final void mo11626a(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo11611a(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11626a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetAsterismConsentResponse) dcl.m8163a(parcel, GetAsterismConsentResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo11611a((Status) dcl.m8163a(parcel, Status.CREATOR), (SetAsterismConsentResponse) dcl.m8163a(parcel, SetAsterismConsentResponse.CREATOR));
        }
        return true;
    }
}
