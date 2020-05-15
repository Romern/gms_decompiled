package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;

/* renamed from: awxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReauthProofTokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ReauthProofTokenResponse(parcel.readString(), parcel.readInt(), parcel.readLong());
    }
}
