package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* renamed from: amos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amos implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EmailEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) sed.m34998a(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new EmailEntity(personFieldMetadataEntity, str);
    }
}
