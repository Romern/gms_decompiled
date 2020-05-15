package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;

/* renamed from: aiij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiij implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendPayloadParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        String[] strArr = null;
        ParcelablePayload parcelablePayload = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                strArr = sed.m34989A(parcel, readInt);
            } else if (a == 3) {
                parcelablePayload = (ParcelablePayload) sed.m34998a(parcel, readInt, ParcelablePayload.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SendPayloadParams(iBinder, strArr, parcelablePayload, z);
    }
}
