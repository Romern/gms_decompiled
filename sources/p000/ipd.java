package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ipd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new KeyInvalidationResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new KeyInvalidationResult(i, status);
    }
}
