package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.ClaimMoneyRequest;

/* renamed from: axne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axne implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClaimMoneyRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 7:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ClaimMoneyRequest(str, str2, j, j2, bArr, bArr2, z, str3);
    }
}
