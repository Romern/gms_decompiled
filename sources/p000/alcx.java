package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.DataChangeListenerRequest;
import com.google.android.gms.pay.DataChangeListenerType;

/* renamed from: alcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataChangeListenerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        DataChangeListenerType dataChangeListenerType = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                dataChangeListenerType = (DataChangeListenerType) sed.m34998a(parcel, readInt, DataChangeListenerType.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataChangeListenerRequest(account, dataChangeListenerType, str);
    }
}
