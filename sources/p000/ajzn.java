package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: ajzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajzn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnTransferUpdateParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ShareTarget shareTarget = null;
        TransferMetadata transferMetadata = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                shareTarget = (ShareTarget) sed.m34998a(parcel, readInt, ShareTarget.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                transferMetadata = (TransferMetadata) sed.m34998a(parcel, readInt, TransferMetadata.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnTransferUpdateParams(shareTarget, transferMetadata);
    }
}
