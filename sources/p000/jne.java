package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.ArrayList;

/* renamed from: jne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jne implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RemoteDevice[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        String str4 = null;
        ArrayList arrayList = null;
        String str5 = null;
        int i = 0;
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
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 4:
                        bArr = sed.m35023t(parcel, readInt);
                        continue;
                    case 5:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 6:
                        arrayList = sed.m35005c(parcel, readInt, BeaconSeedEntity.CREATOR);
                        continue;
                    case 7:
                        str5 = sed.m35020q(parcel, readInt);
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
        return new RemoteDevice(i, str, str2, str3, bArr, str4, arrayList, str5);
    }
}
