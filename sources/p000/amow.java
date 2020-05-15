package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* renamed from: amow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amow implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NameEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 17) {
                switch (a) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) sed.m34998a(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
                        continue;
                    case 3:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 4:
                        str6 = sed.m35020q(parcel, readInt);
                        continue;
                    case 5:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 6:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        str5 = sed.m35020q(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new NameEntity(personFieldMetadataEntity, str, str2, str3, str4, str5, str6);
    }
}
