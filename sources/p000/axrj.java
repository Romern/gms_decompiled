package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigResponse;

/* renamed from: axrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axrj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetConfigResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) sed.m34998a(parcel, readInt, ConnectionConfiguration.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetConfigResponse(i, connectionConfiguration);
    }
}
