package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;

/* renamed from: juy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountDetail[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Intent intent = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    z2 = sed.m35006c(parcel, readInt);
                    break;
                case 6:
                    intent = (Intent) sed.m34998a(parcel, readInt, Intent.CREATOR);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    z3 = sed.m35006c(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AccountDetail(str, str2, z, str3, z2, intent, str4, z3);
    }
}
