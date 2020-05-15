package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UploadRequest;

/* renamed from: aeqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UploadRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel, readInt);
                    break;
                case 6:
                    j3 = sed.m35012i(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new UploadRequest(account, str, j, j2, j3, str2);
    }
}
