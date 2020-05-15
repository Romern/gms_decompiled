package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

/* renamed from: zbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zbv extends dck implements zbw {
    public zbv() {
        super("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo30918a((SubscribeRequest) dcl.m8163a(parcel, SubscribeRequest.CREATOR));
        } else if (i == 2) {
            mo30919a((UnsubscribeRequest) dcl.m8163a(parcel, UnsubscribeRequest.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo30917a((ListSubscriptionsRequest) dcl.m8163a(parcel, ListSubscriptionsRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
