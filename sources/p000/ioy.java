package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import java.util.ArrayList;

/* renamed from: ioy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ioy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetadata[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel, readInt, DeviceFeatureStatus.CREATOR);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DeviceMetadata(i, str, bArr, str2, arrayList, str3);
    }
}
