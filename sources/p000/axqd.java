package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;

/* renamed from: axqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CapabilityInfoParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, NodeParcelable.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CapabilityInfoParcelable(str, arrayList);
    }
}
