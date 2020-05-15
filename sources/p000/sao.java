package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;

/* renamed from: sao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sao implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientContext[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Account account = null;
        Account account2 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 3:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    account2 = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 8:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
                case 9:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 10:
                    i3 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ClientContext(i, i2, account, account2, str, str2, arrayList, arrayList2, bundle, i3);
    }
}
