package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.OnListParentsResponse;

/* renamed from: uuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uuf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnListParentsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnListParentsResponse(dataHolder);
    }
}
