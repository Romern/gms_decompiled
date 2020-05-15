package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;

/* renamed from: agpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WalletBalanceInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    l2 = sed.m35013j(parcel2, readInt);
                    break;
                case 8:
                    l3 = sed.m35013j(parcel2, readInt);
                    break;
                case 9:
                    l4 = sed.m35013j(parcel2, readInt);
                    break;
                case 10:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new WalletBalanceInfo(j, str, i, l, str2, str3, l2, l3, l4, str4);
    }
}
