package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;
import com.google.android.gms.payse.internal.GetSeCardsResponse;

/* renamed from: alkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alkn extends dck implements alko {
    public alkn() {
        super("com.google.android.gms.payse.internal.IPaySeServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo40469a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40453a(Status status, ExecuteSdkOperationResponse executeSdkOperationResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo40452a(Status status, GetSeCardsResponse getSeCardsResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            dcl.m8167a(parcel);
            mo40469a((Status) dcl.m8163a(parcel, Status.CREATOR));
            return true;
        } else if (i == 3) {
            mo40452a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetSeCardsResponse) dcl.m8163a(parcel, GetSeCardsResponse.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            mo40453a((Status) dcl.m8163a(parcel, Status.CREATOR), (ExecuteSdkOperationResponse) dcl.m8163a(parcel, ExecuteSdkOperationResponse.CREATOR));
            return true;
        }
    }
}
