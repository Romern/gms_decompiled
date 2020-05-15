package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: fvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPerson.ContactMethod[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        AvatarReference avatarReference = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                avatarReference = (AvatarReference) sed.m34998a(parcel, readInt, AvatarReference.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ContactPerson.ContactMethod(i, str, avatarReference);
    }
}
