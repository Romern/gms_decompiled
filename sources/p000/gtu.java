package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.ArrayList;

/* renamed from: gtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountTransferProgress[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
                case 4:
                    arrayList3 = sed.m34992D(parcel, readInt);
                    break;
                case 5:
                    arrayList4 = sed.m34992D(parcel, readInt);
                    break;
                case 6:
                    arrayList5 = sed.m34992D(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AccountTransferProgress(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }
}
