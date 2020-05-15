package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: pfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pfy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LaunchOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        CredentialsData credentialsData = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                credentialsData = (CredentialsData) sed.m34998a(parcel, readInt, CredentialsData.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LaunchOptions(z, str, z2, credentialsData);
    }
}
