package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.internal.firstparty.FirstPartyTokenizePanRequest;

/* renamed from: asxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asxy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FirstPartyTokenizePanRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    z4 = sed.m35006c(parcel, readInt);
                    break;
                case 10:
                    z5 = sed.m35006c(parcel, readInt);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new FirstPartyTokenizePanRequest(str, z, str2, bArr, z2, str3, z3, z4, z5, str4);
    }
}
