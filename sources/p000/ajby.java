package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;

/* renamed from: ajby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajby implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetPermissionStatusRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        String str = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                clientAppContext = (ClientAppContext) sed.m34998a(parcel, readInt, ClientAppContext.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetPermissionStatusRequest(i, iBinder, str, clientAppContext);
    }
}
