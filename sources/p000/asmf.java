package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;

/* renamed from: asmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BadgeInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        byte[] bArr = null;
        TokenStatus tokenStatus = null;
        String str2 = null;
        TransactionInfo transactionInfo = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 4:
                    tokenStatus = (TokenStatus) sed.m34998a(parcel, readInt, TokenStatus.CREATOR);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    transactionInfo = (TransactionInfo) sed.m34998a(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new BadgeInfo(str, bArr, i, tokenStatus, str2, transactionInfo);
    }
}
