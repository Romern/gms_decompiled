package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;

/* renamed from: ahep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahep implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EnableTargetRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 2:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 3:
                        iBinder = sed.m35021r(parcel, readInt);
                        continue;
                    case 4:
                        iBinder2 = sed.m35021r(parcel, readInt);
                        continue;
                    case 5:
                        iBinder3 = sed.m35021r(parcel, readInt);
                        continue;
                    case 6:
                        b2 = sed.m35008e(parcel, readInt);
                        continue;
                    case 7:
                        b3 = sed.m35008e(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new EnableTargetRequest(i, str, str2, b2, b3, iBinder, iBinder2, iBinder3);
    }
}
