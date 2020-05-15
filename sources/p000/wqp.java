package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.p042v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: wqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPerson[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        AvatarReference avatarReference = null;
        ArrayList arrayList = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                l = sed.m35013j(parcel, readInt);
            } else if (a == 3) {
                avatarReference = (AvatarReference) sed.m34998a(parcel, readInt, AvatarReference.CREATOR);
            } else if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, ContactPerson.ContactMethod.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ContactPerson(str, l, avatarReference, arrayList, uri);
    }
}
