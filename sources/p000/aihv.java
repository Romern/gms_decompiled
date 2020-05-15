package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: aihv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aihv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnPayloadTransferUpdateParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        PayloadTransferUpdate payloadTransferUpdate = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                payloadTransferUpdate = (PayloadTransferUpdate) sed.m34998a(parcel, readInt, PayloadTransferUpdate.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnPayloadTransferUpdateParams(str, payloadTransferUpdate);
    }
}
