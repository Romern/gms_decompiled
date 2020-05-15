package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.GoogleTransactionId;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.ViewTransactionRequest;

/* renamed from: alhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alhm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewTransactionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        GoogleTransactionId googleTransactionId = null;
        Transaction transaction = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                googleTransactionId = (GoogleTransactionId) sed.m34998a(parcel, readInt, GoogleTransactionId.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                transaction = (Transaction) sed.m34998a(parcel, readInt, Transaction.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ViewTransactionRequest(account, googleTransactionId, transaction);
    }
}
