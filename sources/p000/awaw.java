package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* renamed from: awaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awaw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m34990B(parcel, readInt);
                    break;
                case 3:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = sed.m34990B(parcel, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }
}
