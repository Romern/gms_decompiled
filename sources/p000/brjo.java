package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: brjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brjo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserProfileChangeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z2 = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserProfileChangeRequest(str, str2, z, z2);
    }
}
