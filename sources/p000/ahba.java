package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

/* renamed from: ahba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahba implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserKey[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Long l = null;
        AuthType authType = null;
        String str = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                l = sed.m35013j(parcel, readInt);
            } else if (a == 2) {
                authType = (AuthType) sed.m34998a(parcel, readInt, AuthType.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                l2 = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserKey(l, authType, str, l2);
    }
}
