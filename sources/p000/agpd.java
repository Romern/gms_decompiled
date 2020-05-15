package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;

/* renamed from: agpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpUpsellPlan[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 9:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new MdpUpsellPlan(str, str2, str3, j, str4, str5, j2, j3, str6, str7, i);
    }
}
