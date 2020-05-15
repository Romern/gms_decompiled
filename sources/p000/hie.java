package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;

/* renamed from: hie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hie implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeleteRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                credential = (Credential) sed.m34998a(parcel, readInt, Credential.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DeleteRequest(credential);
    }
}
