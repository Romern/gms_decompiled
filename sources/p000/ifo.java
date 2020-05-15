package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;

/* renamed from: ifo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PermitAccess[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    arrayList = sed.m35005c(parcel2, readInt, BeaconSeedEntity.CREATOR);
                    break;
                case 12:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 13:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PermitAccess(i, str, str2, bArr, str3, z, z2, z3, str4, str5, arrayList, j, z4, z5);
    }
}
