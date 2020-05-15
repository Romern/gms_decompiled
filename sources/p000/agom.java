package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;

/* renamed from: agom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agom implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpCarrierPlanIdResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CarrierSupportInfo carrierSupportInfo = null;
        Integer num = null;
        Long l = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    carrierSupportInfo = (CarrierSupportInfo) sed.m34998a(parcel2, readInt, CarrierSupportInfo.CREATOR);
                    break;
                case 9:
                    num = sed.m35011h(parcel2, readInt);
                    break;
                case 10:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MdpCarrierPlanIdResponse(str, j, str2, str3, j2, str4, i, carrierSupportInfo, num, l);
    }
}
