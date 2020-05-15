package p000;

import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: oqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oqn extends dck implements oqo {
    public oqn() {
        super("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
    }

    /* renamed from: a */
    public void mo22513a(Status status, EAPAKAResponse eAPAKAResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo22513a((Status) dcl.m8163a(parcel, Status.CREATOR), (EAPAKAResponse) dcl.m8163a(parcel, EAPAKAResponse.CREATOR));
        return true;
    }
}
