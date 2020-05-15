package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajzl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnShareTargetLostParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ShareTarget shareTarget = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                shareTarget = (ShareTarget) sed.m34998a(parcel, readInt, ShareTarget.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnShareTargetLostParams(shareTarget);
    }
}
