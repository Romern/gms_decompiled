package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;

/* renamed from: aidh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aidh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AcceptConnectionRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                iBinder2 = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder3 = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AcceptConnectionRequestParams(iBinder, iBinder2, str, bArr, iBinder3);
    }
}
