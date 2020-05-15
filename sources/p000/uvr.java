package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.model.User;
import java.util.HashSet;

/* renamed from: uvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new User[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        User.Picture picture = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 5) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(5);
            } else if (a == 7) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(7);
            } else if (a == 9) {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(9);
            } else if (a != 10) {
                sed.m35002b(parcel, readInt);
            } else {
                picture = (User.Picture) sed.m34998a(parcel, readInt, User.Picture.CREATOR);
                hashSet.add(10);
            }
        }
        if (parcel.dataPosition() == b) {
            return new User(hashSet, str, str2, z, str3, picture);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
