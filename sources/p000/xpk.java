package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* renamed from: xpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialCreationOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) sed.m34998a(parcel, readInt, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri);
    }
}
