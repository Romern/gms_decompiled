package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;

/* renamed from: apri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apri implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetNativeApiInfoCall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        NativeApiInfo nativeApiInfo = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                nativeApiInfo = (NativeApiInfo) sed.m34998a(parcel, readInt, NativeApiInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetNativeApiInfoCall$Response(status, nativeApiInfo);
    }
}
