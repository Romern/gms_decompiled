package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: fvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPerson[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        AvatarReference avatarReference = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 5:
                    avatarReference = (AvatarReference) sed.m34998a(parcel, readInt, AvatarReference.CREATOR);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel, readInt, ContactPerson.ContactMethod.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ContactPerson(str, str2, l, avatarReference, arrayList, i);
    }
}
