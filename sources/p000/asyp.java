package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TapEvent;
import com.google.android.gms.tapandpay.internal.firstparty.SendTapEventRequest;

/* renamed from: asyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asyp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendTapEventRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TapEvent tapEvent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                tapEvent = (TapEvent) sed.m34998a(parcel, readInt, TapEvent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SendTapEventRequest(tapEvent);
    }
}
