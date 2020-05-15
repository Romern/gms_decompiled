package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.TransactionInfo;
import com.google.android.gms.payse.internal.ExecuteSdkOperationResponse;

/* renamed from: alkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExecuteSdkOperationResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TransactionInfo transactionInfo = null;
        SecureElementStoredValue secureElementStoredValue = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                transactionInfo = (TransactionInfo) sed.m34998a(parcel, readInt, TransactionInfo.CREATOR);
            } else if (a == 2) {
                secureElementStoredValue = (SecureElementStoredValue) sed.m34998a(parcel, readInt, SecureElementStoredValue.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ExecuteSdkOperationResponse(transactionInfo, secureElementStoredValue, str, str2);
    }
}
