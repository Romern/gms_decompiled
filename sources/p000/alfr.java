package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.ClosedLoopCardIntentArgs;
import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.HomeIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.PaycacheSetupIntentArgs;
import com.google.android.gms.pay.SaveTicketCentricIntentArgs;
import com.google.android.gms.pay.TopUpIntentArgs;
import com.google.android.gms.pay.TransactionDetailIntentArgs;
import com.google.android.gms.pay.TransactionListIntentArgs;
import com.google.android.gms.pay.TransitDisplayCardIntentArgs;
import com.google.android.gms.pay.ValuableDetailIntentArgs;

/* renamed from: alfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alfr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PayIntentArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        FopDetailIntentArgs fopDetailIntentArgs = null;
        TransactionDetailIntentArgs transactionDetailIntentArgs = null;
        TransactionListIntentArgs transactionListIntentArgs = null;
        ClosedLoopCardIntentArgs closedLoopCardIntentArgs = null;
        TransitDisplayCardIntentArgs transitDisplayCardIntentArgs = null;
        SaveTicketCentricIntentArgs saveTicketCentricIntentArgs = null;
        PaycacheSetupIntentArgs paycacheSetupIntentArgs = null;
        TopUpIntentArgs topUpIntentArgs = null;
        ValuableDetailIntentArgs valuableDetailIntentArgs = null;
        HomeIntentArgs homeIntentArgs = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 2:
                    fopDetailIntentArgs = (FopDetailIntentArgs) sed.m34998a(parcel, readInt, FopDetailIntentArgs.CREATOR);
                    break;
                case 3:
                    transactionDetailIntentArgs = (TransactionDetailIntentArgs) sed.m34998a(parcel, readInt, TransactionDetailIntentArgs.CREATOR);
                    break;
                case 4:
                    transactionListIntentArgs = (TransactionListIntentArgs) sed.m34998a(parcel, readInt, TransactionListIntentArgs.CREATOR);
                    break;
                case 5:
                    closedLoopCardIntentArgs = (ClosedLoopCardIntentArgs) sed.m34998a(parcel, readInt, ClosedLoopCardIntentArgs.CREATOR);
                    break;
                case 6:
                    transitDisplayCardIntentArgs = (TransitDisplayCardIntentArgs) sed.m34998a(parcel, readInt, TransitDisplayCardIntentArgs.CREATOR);
                    break;
                case 7:
                    saveTicketCentricIntentArgs = (SaveTicketCentricIntentArgs) sed.m34998a(parcel, readInt, SaveTicketCentricIntentArgs.CREATOR);
                    break;
                case 8:
                    paycacheSetupIntentArgs = (PaycacheSetupIntentArgs) sed.m34998a(parcel, readInt, PaycacheSetupIntentArgs.CREATOR);
                    break;
                case 9:
                    topUpIntentArgs = (TopUpIntentArgs) sed.m34998a(parcel, readInt, TopUpIntentArgs.CREATOR);
                    break;
                case 10:
                    valuableDetailIntentArgs = (ValuableDetailIntentArgs) sed.m34998a(parcel, readInt, ValuableDetailIntentArgs.CREATOR);
                    break;
                case 11:
                    homeIntentArgs = (HomeIntentArgs) sed.m34998a(parcel, readInt, HomeIntentArgs.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new PayIntentArgs(account, fopDetailIntentArgs, transactionDetailIntentArgs, transactionListIntentArgs, closedLoopCardIntentArgs, transitDisplayCardIntentArgs, saveTicketCentricIntentArgs, paycacheSetupIntentArgs, topUpIntentArgs, valuableDetailIntentArgs, homeIntentArgs);
    }
}
