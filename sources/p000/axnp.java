package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.internal.zeroparty.ErrorDetails;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import com.google.android.gms.walletp2p.internal.zeroparty.Transaction;
import java.util.ArrayList;

/* renamed from: axnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetTransactionResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Transaction transaction = null;
        ArrayList arrayList = null;
        ErrorDetails errorDetails = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                transaction = (Transaction) sed.m34998a(parcel, readInt, Transaction.CREATOR);
            } else if (a == 3) {
                arrayList = sed.m35005c(parcel, readInt, Account.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                errorDetails = (ErrorDetails) sed.m34998a(parcel, readInt, ErrorDetails.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetTransactionResponse(transaction, arrayList, errorDetails);
    }
}
