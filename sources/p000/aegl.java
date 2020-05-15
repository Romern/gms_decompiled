package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientationRequest;

/* renamed from: aegl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aegl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                z = sed.m35006c(parcel2, readInt);
            } else if (a == 2) {
                j = sed.m35012i(parcel2, readInt);
            } else if (a == 3) {
                f = sed.m35015l(parcel2, readInt);
            } else if (a == 4) {
                j2 = sed.m35012i(parcel2, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel2, readInt);
            } else {
                i = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new DeviceOrientationRequest(z, j, f, j2, i);
    }
}
