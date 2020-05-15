package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;

/* renamed from: aihd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aihd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnConnectionInitiatedParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 5:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 6:
                    bArr2 = sed.m35023t(parcel, readInt);
                    break;
                case 7:
                    bArr3 = sed.m35023t(parcel, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new OnConnectionInitiatedParams(str, str2, str3, z, bArr, bArr2, bArr3, z2);
    }
}
