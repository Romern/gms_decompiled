package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.CollectForDebugParcelable;

/* renamed from: qwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qwy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CollectForDebugParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 2) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new CollectForDebugParcelable(z, j, j2);
    }
}
