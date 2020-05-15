package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* renamed from: ampa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonFieldMetadataEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 3;
        Boolean bool = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 3) {
                i = sed.m35011h(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                bool = sed.m35007d(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PersonFieldMetadataEntity(i, bool);
    }
}
