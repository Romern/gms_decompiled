package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;

/* renamed from: asoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asoq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendTransmissionEventRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TransmissionEvent transmissionEvent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                transmissionEvent = (TransmissionEvent) sed.m34998a(parcel, readInt, TransmissionEvent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SendTransmissionEventRequest(transmissionEvent);
    }
}
