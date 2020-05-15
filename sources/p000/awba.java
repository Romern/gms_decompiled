package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* renamed from: awba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awba implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList a = sqc.m35954a();
        ArrayList a2 = sqc.m35954a();
        ArrayList a3 = sqc.m35954a();
        ArrayList arrayList = a;
        ArrayList arrayList2 = a2;
        ArrayList arrayList3 = a3;
        ArrayList a4 = sqc.m35954a();
        ArrayList a5 = sqc.m35954a();
        ArrayList a6 = sqc.m35954a();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str10 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    arrayList = sed.m35005c(parcel2, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) sed.m34998a(parcel2, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList2 = sed.m35005c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    str12 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                    arrayList3 = sed.m35005c(parcel2, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    a4 = sed.m35005c(parcel2, readInt, UriData.CREATOR);
                    break;
                case 21:
                    a5 = sed.m35005c(parcel2, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    a6 = sed.m35005c(parcel2, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) sed.m34998a(parcel2, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z, a4, a5, a6, loyaltyPoints);
    }
}
