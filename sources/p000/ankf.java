package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.UserQuota;

/* renamed from: ankf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserQuota[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                z2 = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UserQuota(i, j, j2, z, z2);
    }
}
