package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.CustomProperty;

/* renamed from: uys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uys implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CustomProperty[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        CustomPropertyKey customPropertyKey = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                customPropertyKey = (CustomPropertyKey) sed.m34998a(parcel, readInt, CustomPropertyKey.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CustomProperty(customPropertyKey, str);
    }
}