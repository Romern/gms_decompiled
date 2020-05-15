package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdate;

/* renamed from: frq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PIMEUpdate[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Account account = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 2:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 8:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 9:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 11:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PIMEUpdate(bArr, bArr2, i, str, str2, z, bundle, j, j2, account);
    }
}
