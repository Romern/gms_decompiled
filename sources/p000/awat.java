package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: awat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awat implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    commonWalletObject = (CommonWalletObject) sed.m34998a(parcel2, readInt, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j, str4, j2, str5);
    }
}
