package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;

/* renamed from: sig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sig implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConverterWrapper[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                stringToIntConverter = (StringToIntConverter) sed.m34998a(parcel, readInt, StringToIntConverter.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ConverterWrapper(i, stringToIntConverter);
    }
}
