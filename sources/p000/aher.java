package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

/* renamed from: aher */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aher implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartScanRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 0;
        byte b2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                iBinder2 = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                b2 = sed.m35008e(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new StartScanRequest(i, b2, iBinder, iBinder2);
    }
}
