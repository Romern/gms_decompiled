package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.locationsharing.onboarding.TosUiDescription;
import java.util.ArrayList;

/* renamed from: aetz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TosUiDescription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte[] bArr = null;
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
                    arrayList = sed.m35005c(parcel, readInt, TosUiDescription.Section.CREATOR);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new TosUiDescription(str, str2, arrayList, str3, str4, str5, str6, bArr);
    }
}
