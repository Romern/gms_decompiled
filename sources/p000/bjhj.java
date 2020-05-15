package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;

/* renamed from: bjhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountStateSnapshot[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account[] accountArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                accountArr = (Account[]) sed.m35004b(parcel, readInt, Account.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GoogleAccountStateSnapshot(accountArr);
    }
}
