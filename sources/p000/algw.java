package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionDetailIntentArgs;

/* renamed from: algw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class algw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TransactionDetailIntentArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Transaction transaction = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                transaction = (Transaction) sed.m34998a(parcel, readInt, Transaction.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new TransactionDetailIntentArgs(str, str2, transaction, i);
    }
}
