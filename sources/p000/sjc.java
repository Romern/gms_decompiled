package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* renamed from: sjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FieldMappingDictionary.FieldMapPair[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        FastJsonResponse$Field fastJsonResponse$Field = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                fastJsonResponse$Field = (FastJsonResponse$Field) sed.m34998a(parcel, readInt, FastJsonResponse$Field.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new FieldMappingDictionary.FieldMapPair(i, str, fastJsonResponse$Field);
    }
}
