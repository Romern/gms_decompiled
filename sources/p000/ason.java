package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.firstparty.TransactionData;

/* renamed from: ason */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ason implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RetrieveInAppPaymentCredentialRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        TransactionData transactionData = null;
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                transactionData = (TransactionData) sed.m34998a(parcel, readInt, TransactionData.CREATOR);
            } else if (a == 5) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new RetrieveInAppPaymentCredentialRequest(str, str2, transactionData, bArr, z);
    }
}
