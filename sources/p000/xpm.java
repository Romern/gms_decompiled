package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: xpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialRequestOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) sed.m34998a(parcel, readInt, PublicKeyCredentialRequestOptions.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri);
    }
}
