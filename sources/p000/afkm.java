package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: afkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afkm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OverrideFileGroupRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ParcelFileDescriptor[] parcelFileDescriptorArr = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 4:
                    strArr2 = sed.m34989A(parcel, readInt);
                    break;
                case 5:
                    parcelFileDescriptorArr = (ParcelFileDescriptor[]) sed.m35004b(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    account = (Account) sed.m34998a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new OverrideFileGroupRequest(str, str2, strArr, strArr2, parcelFileDescriptorArr, account);
    }
}
