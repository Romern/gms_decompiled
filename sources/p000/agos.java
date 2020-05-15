package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;

/* renamed from: agos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agos implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatusResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        MdpDataPlanStatus[] mdpDataPlanStatusArr = null;
        Bundle bundle = null;
        String str2 = null;
        WalletBalanceInfo walletBalanceInfo = null;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    mdpDataPlanStatusArr = (MdpDataPlanStatus[]) sed.m35004b(parcel, readInt, MdpDataPlanStatus.CREATOR);
                    break;
                case 3:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    walletBalanceInfo = (WalletBalanceInfo) sed.m34998a(parcel, readInt, WalletBalanceInfo.CREATOR);
                    break;
                case 6:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 8:
                    l2 = sed.m35013j(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new MdpDataPlanStatusResponse(str, mdpDataPlanStatusArr, bundle, str2, walletBalanceInfo, num, l, l2);
    }
}
