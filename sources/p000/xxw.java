package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* renamed from: xxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserSignRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        SignRequestParams signRequestParams = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                signRequestParams = (SignRequestParams) sed.m34998a(parcel, readInt, SignRequestParams.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BrowserSignRequestParams(signRequestParams, uri);
    }
}
