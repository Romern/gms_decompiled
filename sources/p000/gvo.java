package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

/* renamed from: gvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 2) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                z3 = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }
}
