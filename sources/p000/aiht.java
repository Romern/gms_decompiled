package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: aiht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiht implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnPayloadReceivedParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ParcelablePayload parcelablePayload = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                parcelablePayload = (ParcelablePayload) sed.m34998a(parcel, readInt, ParcelablePayload.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new OnPayloadReceivedParams(str, parcelablePayload, z);
    }
}
