package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.server.response.SafeParcelResponse;

/* renamed from: sjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Parcel parcel2 = null;
        FieldMappingDictionary fieldMappingDictionary = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                parcel2 = sed.m34993E(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                fieldMappingDictionary = (FieldMappingDictionary) sed.m34998a(parcel, readInt, FieldMappingDictionary.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
    }
}
