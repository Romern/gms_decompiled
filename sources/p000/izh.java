package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import java.util.ArrayList;

/* renamed from: izh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ScopeData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
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
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 16:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ScopeData(i, str, str2, str3, str4, z, str5, str6, z2, z3, z4, z5, z6, z7, arrayList, str7);
    }
}
