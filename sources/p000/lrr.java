package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import java.util.ArrayList;

/* renamed from: lrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BeaconStateImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, BeaconStateImpl.BeaconInfoImpl.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BeaconStateImpl(arrayList);
    }
}
