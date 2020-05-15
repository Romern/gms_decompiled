package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.HomeIntentArgs;
import com.google.android.gms.pay.IntentSource;

/* renamed from: aler */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aler implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HomeIntentArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean z = false;
        IntentSource intentSource = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                intentSource = (IntentSource) sed.m34998a(parcel, readInt, IntentSource.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new HomeIntentArgs(z, intentSource);
    }
}
