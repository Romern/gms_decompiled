package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;

/* renamed from: akas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akas implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ShareTarget shareTarget = null;
        Intent intent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                shareTarget = (ShareTarget) sed.m34998a(parcel, readInt, ShareTarget.CREATOR);
            } else if (a == 2) {
                intent = (Intent) sed.m34998a(parcel, readInt, Intent.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SendParams(shareTarget, intent, iBinder);
    }
}
