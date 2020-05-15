package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* renamed from: idi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) sed.m34998a(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
