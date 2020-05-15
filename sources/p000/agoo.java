package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import java.util.ArrayList;

/* renamed from: agoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agoo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        MdpFlexTimeWindow[] mdpFlexTimeWindowArr = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            switch (a) {
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
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    mdpFlexTimeWindowArr = (MdpFlexTimeWindow[]) sed.m35004b(parcel2, readInt, MdpFlexTimeWindow.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    arrayList = sed.m34990B(parcel2, readInt);
                    break;
                default:
                    switch (a) {
                        case 20:
                            j3 = sed.m35012i(parcel2, readInt);
                            continue;
                        case 21:
                            j4 = sed.m35012i(parcel2, readInt);
                            continue;
                        case 22:
                            j5 = sed.m35012i(parcel2, readInt);
                            continue;
                        case 23:
                            str8 = sed.m35020q(parcel2, readInt);
                            continue;
                        case 24:
                            str9 = sed.m35020q(parcel2, readInt);
                            continue;
                        case 25:
                            z = sed.m35006c(parcel2, readInt);
                            continue;
                        default:
                            sed.m35002b(parcel2, readInt);
                            continue;
                    }
            }
        }
        sed.m34994F(parcel2, b);
        return new MdpDataPlanStatus(str, str2, str3, j, j2, mdpFlexTimeWindowArr, i, str4, str5, str6, str7, i2, arrayList, j3, j4, j5, str8, str9, z);
    }
}
