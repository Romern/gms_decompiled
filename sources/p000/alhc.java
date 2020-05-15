package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.UpdateClosedLoopBundleRequest;

/* renamed from: alhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alhc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateClosedLoopBundleRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Account account = null;
        String str = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new UpdateClosedLoopBundleRequest(account, str, j, bArr, j2, j3, bArr2);
    }
}
