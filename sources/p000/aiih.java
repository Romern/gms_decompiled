package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

/* renamed from: aiih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiih implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendConnectionRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder4 = null;
        byte[] bArr2 = null;
        ConnectionOptions connectionOptions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    iBinder = sed.m35021r(parcel, readInt);
                    break;
                case 2:
                    iBinder2 = sed.m35021r(parcel, readInt);
                    break;
                case 3:
                    iBinder3 = sed.m35021r(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 7:
                    iBinder4 = sed.m35021r(parcel, readInt);
                    break;
                case 8:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 9:
                    connectionOptions = (ConnectionOptions) sed.m34998a(parcel, readInt, ConnectionOptions.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new SendConnectionRequestParams(iBinder, iBinder2, iBinder3, str, str2, bArr, iBinder4, bArr2, connectionOptions);
    }
}
