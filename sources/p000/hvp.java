package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInPassword;

/* renamed from: hvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hvp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInPassword[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SignInPassword(str, str2);
    }
}
